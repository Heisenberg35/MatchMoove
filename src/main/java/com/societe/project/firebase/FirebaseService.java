package com.societe.project.firebase;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.json.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.google.firebase.database.DatabaseReference;
import com.societe.project.models.Message;
import com.societe.project.models.PT;
import com.societe.project.models.Trajet;
import com.societe.project.services.RecuperationInfoLoginService;
import com.societe.project.services.TrajetService;
@Service
public class FirebaseService {
	@Autowired
	TrajetService trajetService;
	@Autowired
	RecuperationInfoLoginService recuperationInfoLogin;
	
	public void createFirebaseTrajet(int id) throws IOException {
			DatabaseReference Ref = FirebaseOpenHelper.getInstance().getDatabase().getReference("conversations/");

			String trajetId = String.valueOf(id);
		    Ref.child(trajetId).push().setValueAsync("Conversation créée pour trajet " /*+ trajetService.find(id).get().getNom()*/ );
	   }
	
	public List<Integer> getUserTrajets(){
		List<Integer> result = new ArrayList<Integer>();
	    Date currentDate = new Date(Calendar.getInstance().getTime().getTime());
		System.out.println(currentDate);
		
		for(PT pt : recuperationInfoLogin.recuperationCompteForUserLogged().getProfil().getPT()) {
			if( currentDate.compareTo(pt.getTrajet().getDateDepart()) < 0) 
			{
				result.add(pt.getTrajet().getId());
			}
		
		}
		return result;
	}
}
