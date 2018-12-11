package com.societe.project.firebase;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONStringer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.google.firebase.database.DatabaseReference;
import com.google.gson.JsonObject;
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
			 Date currentDate = new Date(Calendar.getInstance().getTime().getTime());
		    JsonObject firstMessage = new JsonObject();
		    firstMessage.addProperty("content", "Conversation créée pour trajet "+ trajetService.find(id).get().getNom() );
		    firstMessage.addProperty("date", currentDate.toString());
            System.out.println(firstMessage);
			String trajetId = String.valueOf(id);
		    Ref.child(trajetId).push().setValueAsync(firstMessage);
		  
	   }
	
	public Integer getUserTrajet(){
		Integer result =new Integer(-1);
	    Date currentDate = new Date(Calendar.getInstance().getTime().getTime());
		System.out.println(currentDate);
		 
        if(!recuperationInfoLogin.recuperationCompteForUserLogged().getProfil().getPT().isEmpty())
		{
        	Date temp = recuperationInfoLogin.recuperationCompteForUserLogged().getProfil().getPT().get(0).getTrajet().getDateDepart();
        	result =    recuperationInfoLogin.recuperationCompteForUserLogged().getProfil().getPT().get(0).getTrajet().getId();
			for(PT pt : recuperationInfoLogin.recuperationCompteForUserLogged().getProfil().getPT()) {
				if(temp.after(pt.getTrajet().getDateDepart()))
				{
					if( currentDate.compareTo(pt.getTrajet().getDateDepart()) < 0) 
					{
						temp = pt.getTrajet().getDateDepart();
						result = pt.getTrajet().getId();
					}
				}
			
			}
		}
		return result;
	}
	

}
