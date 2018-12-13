package com.societe.project.firebase;

import java.io.IOException;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.societe.project.firebase.models.MessageNotification;

public class FirebaseNotificationObserver {

	MessageNotification messageNotification;

	private FirebaseNotificationObserver() throws IOException {
		firebaseNotificationsObserver(this.messageNotification);
	}

	private static FirebaseNotificationObserver INSTANCE = null;

	public static synchronized FirebaseNotificationObserver getInstance() throws IOException {
		if (INSTANCE == null) {
			INSTANCE = new FirebaseNotificationObserver( );
		}
		return INSTANCE;
	}	
	
private void firebaseNotificationsObserver(MessageNotification messageNotification) throws IOException {

		FirebaseOpenHelper.getInstance()
		                  .getDatabase()
		                  .getReference("/conversations/1")
		                  .addChildEventListener(new ChildEventListener() {
							
							@Override
							public void onChildRemoved(DataSnapshot snapshot) {
								System.out.println("removed " + snapshot.getKey());
								
							}
							
							@Override
							public void onChildMoved(DataSnapshot snapshot, String previousChildName) {
								System.out.println("moved " + snapshot.getKey());
								
							}
							
							@Override
							public void onChildChanged(DataSnapshot snapshot, String previousChildName) {
								System.out.println("changed " + snapshot.getKey());
															
							}
							
							@Override
							public void onChildAdded(DataSnapshot snapshot, String previousChildName) {
								System.out.println("Added " + snapshot.getKey());
								if (snapshot.getValue().equals("content")) {
									FirebaseNotificationObserver.this.messageNotification.setContent(snapshot.getValue().toString());
								}
								if (snapshot.getValue().equals("date")) {
									FirebaseNotificationObserver.this.messageNotification.setDate(snapshot.getValue().toString());
								}	
							}
							
							@Override
							public void onCancelled(DatabaseError error) {
								System.out.println("Error");
								
							}
						} );
}

	public MessageNotification getNotification() {
	    //System.out.println(messageNotification.getContent());
		return this.messageNotification;
	}	
}