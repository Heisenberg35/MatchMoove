/**
 * 
 */
package com.societe.project.database;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.societe.project.models.PT;
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
public class PTServiceTest {
	
	@Autowired
	PTRepository pTRepository;
	@Autowired
	ProfilRepository profilRepository;
	@Autowired
	TrajetRepository trajetRepository;
	
	@Test
    public void createAndFind() {
		Profil profil = new Profil();
		Trajet trajet = new Trajet();
		PT pt = new PT(5, 10.5, profil, trajet);
		
		pt.setNbrePlace(5);
		pt.setVolumeMax(10.5);
		pt.setProfil(profil);
		pt.setTrajet(trajet);
		
		profilRepository.save(profil);
		trajetRepository.save(trajet);
		pTRepository.save(pt);
		
		List<PT> pts = pTRepository.findByNbrePlace(pt.getNbrePlace());
		for (PT elt : pts) {
			assertThat(elt.getNbrePlace()).isEqualTo(pt.getNbrePlace());
		}
		
		pts = pTRepository.findByVolumeMax(pt.getVolumeMax());
		for (PT elt : pts) {
			assertThat(elt.getVolumeMax()).isEqualTo(pt.getVolumeMax());
		}
	}

	@Test
    public void findAndDelete() {
		List<PT> pts = pTRepository.findByNbrePlace(5);
		for (PT elt : pts) {
			assertThat(elt.getNbrePlace().equals(5));
		}
		
		pts = pTRepository.findByVolumeMax(10.5);
		for (PT elt : pts) {
			assertThat(elt.getVolumeMax().equals(10.5));
		}
		
		for (PT elt : pts) {
			pTRepository.delete(elt);
		}
		assertThat(pts.isEmpty());
	}
}
