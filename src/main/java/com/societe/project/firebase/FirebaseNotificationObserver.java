package com.societe.project.firebase;

import java.io.IOException;


import java.text.SimpleDateFormat;

import java.util.Date;

import com.google.protobuf.TextFormat.ParseException;
import com.societe.project.models.Message;

public class FirebaseNotificationObserver {
	
	Message message;
	public static Date parseDate(String date) throws java.text.ParseException, ParseException {
	     return (Date) new SimpleDateFormat("yyyy-MM-dd").parse(date);
	  }
	
	private FirebaseNotificationObserver() throws IOException, java.text.ParseException {
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date myDate = parseDate("2014-02-14");
		this.message = new Message("coucou",myDate);
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
