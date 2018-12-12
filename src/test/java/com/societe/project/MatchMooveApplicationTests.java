package com.societe.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.societe.project.database.AdresseRepository;
import com.societe.project.database.ArticleRepository;
import com.societe.project.database.BagageRepository;
import com.societe.project.database.CarRepository;
import com.societe.project.database.CompteRepository;
import com.societe.project.database.MessageRepository;
import com.societe.project.database.PTRepository;
import com.societe.project.database.PointRepository;
import com.societe.project.database.ProfilRepository;
import com.societe.project.database.RoleRepository;
import com.societe.project.database.TrajetRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.application.properties")
public class MatchMooveApplicationTests {
	
	@Autowired
	AdresseRepository adresseRepository;
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	BagageRepository bagageRepository;
	@Autowired
	CarRepository carRepository;
	@Autowired
	CompteRepository compteRepository;
	@Autowired
	MessageRepository messageRepository;
	@Autowired
	PointRepository pointRepository;
	@Autowired
	ProfilRepository profilRepository;
	@Autowired
	PTRepository pTRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	TrajetRepository trajetRepository;
	
	@Test
	public void contextLoads() {
//		adresseRepository.deleteAll();
//		articleRepository.deleteAll();
//		bagageRepository.deleteAll();
//		carRepository.deleteAll();
//		compteRepository.deleteAll();
//		messageRepository.deleteAll();
//		pointRepository.deleteAll();
//		profilRepository.deleteAll();
//		pTRepository.deleteAll();
//		roleRepository.deleteAll();
//		trajetRepository.deleteAll();
	}

}
