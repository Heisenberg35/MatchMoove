package com.societe.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.societe.project.models.Message;
import com.societe.project.security.services.FirstService;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class MatchMooveApplication {
   

	public static void main(String[] args) {
		SpringApplication.run(MatchMooveApplication.class, args);
		System.out.println("test");
	
	}

	@Autowired
	FirstService service;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				service.createFirstAdminAndFirstUser("ROLE_ADMIN");
				service.createFirstAdminAndFirstUser("ROLE_USER");
				service.createFirstAdminAndFirstUser("ROLE_USER");
			}
		};
	}
}
