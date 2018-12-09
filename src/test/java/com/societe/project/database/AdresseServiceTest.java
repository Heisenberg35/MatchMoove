/**
 * 
 */
package com.societe.project.database;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import com.societe.project.models.Adresse;
import com.societe.project.models.Profil;

/**
 * @author Fabrice
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.application.properties")
public class AdresseServiceTest {

	@Autowired
	private AdresseRepository adresseRepository;
	@Autowired
	private ProfilRepository profilRepository;
	
	@Test
    public void createAndFind() {
		Profil profil = new Profil("test", "test", "0102030405");
		Adresse adresse = new Adresse(1, "rue de rennes", 35000, "Rennes", true, profil);
		profilRepository.save(profil);
		adresseRepository.save(adresse);
		
		List<Adresse> adresses = new ArrayList<Adresse>();
		adresses = adresseRepository.findByRue(adresse.getRue());
		for (Adresse elt : adresses) {
			assertThat(elt.getRue()).isEqualTo(adresse.getRue());
		}
		
		adresses = adresseRepository.findByVille(adresse.getVille());
		for (Adresse elt : adresses) {
			assertThat(elt.getVille()).isEqualTo(adresse.getVille());
		}
	}
	
	@Test
    public void findAndDelete() {
		List<Adresse> adresses = new ArrayList<Adresse>();
		adresses = adresseRepository.findByRue("rue de rennes");
		for (Adresse elt : adresses) {
			assertThat(elt.getRue().equals("rue de rennes"));
		}
		adresses = adresseRepository.findByVille("Rennes");
		for (Adresse elt : adresses) {
			assertThat(elt.getRue().equals("Rennes"));
		}
		
		for (Adresse elt : adresses) {
			adresseRepository.delete(elt);
		}

		adresses = adresseRepository.findByVille("Rennes");
		for (Adresse elt : adresses) {
			assertThat(elt).isNull();
		}
	}
}
