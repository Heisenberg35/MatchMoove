package com.societe.project.firebase;

import java.io.FileInputStream;
import java.io.IOException;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseOpenHelper {
	
	private FirebaseDatabase defaultDatabase;
	
	private FirebaseOpenHelper() throws IOException {
		FileInputStream serviceAccount = new FileInputStream("./serviceAccount.json");

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://matchmoove-80f73.firebaseio.com").build();

		FirebaseApp.initializeApp(options);
	
		defaultDatabase = FirebaseDatabase.getInstance(FirebaseApp.getInstance());
	}

	private static FirebaseOpenHelper INSTANCE = null;

	public static synchronized FirebaseOpenHelper getInstance() throws IOException {
		if (INSTANCE == null) {
			INSTANCE = new FirebaseOpenHelper();
		}
		return INSTANCE;
	}
	
	public FirebaseDatabase getDatabase() {
		return defaultDatabase;
	}
}