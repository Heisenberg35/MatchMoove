package com.societe.project.firebase;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.concurrent.Executor;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.societe.project.models.Message;

public class FirebaseNotificationObserver {
	
	Message message;
	
	private FirebaseNotificationObserver() throws IOException {
		this.message = new Message("coucou");
		System.out.println(message.getContent());
		firebaseNotificationsObserver(this.message);
	}

	private static FirebaseNotificationObserver INSTANCE = null;

	public static synchronized FirebaseNotificationObserver getInstance() throws IOException {
		if (INSTANCE == null) {
			INSTANCE = new FirebaseNotificationObserver();
		}
		return INSTANCE;
	}
	
	
private void firebaseNotificationsObserver(Message message) throws IOException {
	String lama = "merci";
   
		FirebaseOpenHelper.getInstance()
		                  .getDatabase()
		                  .getReference("/notifications")
		                  .setValueAsync(message);
}
	

	public Message getNotification() {
		return this.message;
	}
}
