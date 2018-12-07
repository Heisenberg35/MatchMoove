package com.societe.project.firebase;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.protobuf.TextFormat.ParseException;
import com.societe.project.firebase.models.FirebaseMessage;
import com.societe.project.models.Message;
import com.societe.project.models.Profil;

public class FirebaseNotificationObserver {
	//rebaseMessage firebaseMessage;
	Message message;
	//public static Date parseDate(String date) throws java.text.ParseException, ParseException {
	 //    return (Date) new SimpleDateFormat("yyyy-MM-dd").parse(date);
	//  }
	
	private FirebaseNotificationObserver() throws IOException {
	//	Profil myprofil = new Profil("lama","Jabban", "0654441558");
	//	Date myDate = parseDate("1999-01-01");
	//	this.message = new Message("",myDate,myprofil);
	//	ArrayList<Message>  conversatoin = new ArrayList<>();
	//	conversatoin.add(this.message);
	//	firebaseNotificationsObserver(conversatoin);
	}

	private static FirebaseNotificationObserver INSTANCE = null;

	public static synchronized FirebaseNotificationObserver getInstance() throws IOException {
		if (INSTANCE == null) {
			INSTANCE = new FirebaseNotificationObserver( );
		}
		return INSTANCE;
	}
	
	
private void firebaseNotificationsObserver(Message message) throws IOException {

   
		FirebaseOpenHelper.getInstance()
		                  .getDatabase()
		                  .getReference("/message")
		                  .setValueAsync(message);
}
	

	public Message getNotification() {
		return this.message;
	}
}
