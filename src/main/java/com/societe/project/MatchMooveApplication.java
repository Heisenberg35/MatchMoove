package com.societe.project;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.societe.project.models.Point;
import com.societe.project.models.Trajet;


@SpringBootApplication
public class MatchMooveApplication {
	  
public static void initiainzeSDK() {
	        FileInputStream serviceAccount = null;
	        try {
	        	 serviceAccount = new FileInputStream("./serviceAccountKey.json");
	            FirebaseOptions options = new FirebaseOptions.Builder()
	            	    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
	            	    .setDatabaseUrl("https://firstproj-f8c15.firebaseio.com")
	            	    .build();
	            FirebaseApp.initializeApp(options);
	        } catch (FileNotFoundException foe) {
	            System.out.println(foe.getMessage());
	        } catch (IOException ioe) {
	            System.out.println(ioe.getMessage());
	        }
	    }
	  
	  public static void writeTOFb() {
	        FirebaseDatabase database = FirebaseDatabase.getInstance(FirebaseApp.getInstance());
	        DatabaseReference ref = database.getReference("notifications");
	        Point p = new Point(1,1);
	        ref.setValueAsync(p);
	        database.getReference("notifications").addValueEventListener(new ValueEventListener() {
				
				@Override
				public void onDataChange(DataSnapshot snapshot) {
					 Point p = snapshot.getValue(Point.class);
					    System.out.println(p);
				}
				
				@Override
				public void onCancelled(DatabaseError error) {
					// TODO Auto-generated method stub
					
				}
			});
	   
	        		
	  }
	
	  public static void main(String[] args) {
		SpringApplication.run(MatchMooveApplication.class, args);
		
		//initiainzeSDK();
		
		// writeTOFb();
		
}
}
