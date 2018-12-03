package com.societe.project.database;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.societe.project.models.Profil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfilServiceTest {
	
	@Autowired
	ProfilRepository profilRepository;
	
	@Test
	public void createAndFindProfilByFirstname() {
		Profil profilTest = new Profil("firstnameTest", "lastnameTest", "0122334455");
		profilRepository.save(profilTest);
		
		List<Profil> profilFound = profilRepository.findByFirstname(profilTest.getFirstname());
		
		for (Profil elt : profilFound) {
			assertThat(elt.getFirstname()).isEqualTo(profilTest.getFirstname());
		}
	}
	
	@Test
	public void createAndFindProfilByLastname() {
		Profil profilTest = new Profil("firstnameTest", "lastnameTest", "0122334455");
		profilRepository.save(profilTest);
		
		List<Profil> profilFound = profilRepository.findByLastname(profilTest.getLastname());
		
		for (Profil elt : profilFound) {
			assertThat(elt.getLastname()).isEqualTo(profilTest.getLastname());
		}
	}
	
	@Test
	public void createAndFindProfilByFirstnameAndLastname() {
		Profil profilTest = new Profil("firstnameTest", "lastnameTest", "0122334455");
		profilRepository.save(profilTest);
		
		List<Profil> profilFound = profilRepository.findByFirstnameAndLastname(profilTest.getFirstname(), profilTest.getLastname());
		
		for (Profil elt : profilFound) {
			assertThat(elt.getFirstname() + elt.getLastname()).isEqualTo(profilTest.getFirstname() + profilTest.getLastname());
		}
	}
}
