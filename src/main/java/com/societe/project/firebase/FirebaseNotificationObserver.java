package com.societe.project.firebase;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

import com.google.protobuf.TextFormat.ParseException;
import com.societe.project.firebase.models.FirebaseMessage;
import com.societe.project.models.Message;

public class FirebaseNotificationObserver {
	//rebaseMessage firebaseMessage;
	Message message;
	public static Date parseDate(String date) throws java.text.ParseException, ParseException {
	     return (Date) new SimpleDateFormat("yyyy-MM-dd").parse(date);
	  }
	
	private FirebaseNotificationObserver() throws IOException, java.text.ParseException {
		
	//irebaseMessage = new FirebaseMessage();
		Date myDate = parseDate("1999-01-01");
		this.message = new Message("",myDate);
		firebaseNotificationsObserver(this.message);
	}

	private static FirebaseNotificationObserver INSTANCE = null;

	public static synchronized FirebaseNotificationObserver getInstance() throws IOException, java.text.ParseException {
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
