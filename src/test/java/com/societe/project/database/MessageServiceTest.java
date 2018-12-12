/**
 * 
 */
package com.societe.project.database;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.societe.project.models.Message;
import com.societe.project.models.Profil;
import com.societe.project.models.Trajet;

/**
 * @author Fabrice
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.application.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MessageServiceTest {
	
	@Autowired
	MessageRepository messageRepository;
	@Autowired
	TrajetRepository trajetRepository;
	@Autowired
	ProfilRepository profilRepository;
	
	@Test
    public void createAndFind() {
		Date date = new Date();
		Trajet trajet = new Trajet();
		Profil profil = new Profil();
		Message message = new Message("mon message", date, trajet, profil);
		message.setContent("mon message");
		message.setDate(date);
		message.setTrajet(trajet);
		message.setProfil(profil);
		
		trajetRepository.save(trajet);
		profilRepository.save(profil);
		messageRepository.save(message);
		int idMessage = message.getId();
		
		List<Message> messages = messageRepository.findByContent(message.getContent());
		for (Message elt : messages) {
			assertThat(elt.getContent()).isEqualTo(message.getContent());
		}
		
		Message found = messageRepository.findById(idMessage).get();
			assertThat(found.getId()).isEqualTo(message.getId());
	}

	@Test
    public void findAndDelete() {
		List<Message> messages = messageRepository.findByContent("mon message");
		for (Message elt : messages) {
			assertThat(elt.getContent().equals("mon message"));
		}
		for (Message elt : messages) {
			messageRepository.delete(elt);
		}
		assertThat(messages.isEmpty());
	}
}
