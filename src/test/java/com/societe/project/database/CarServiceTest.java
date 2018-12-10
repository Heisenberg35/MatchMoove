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

import com.societe.project.models.Car;
import com.societe.project.models.Profil;

/**
 * @author Fabrice
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.application.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarServiceTest {
	
	@Autowired
	private ProfilRepository profilRepository;
	@Autowired
	private CarRepository carRepository;
	
	private Profil profil = new Profil("toto", "TOTO", "0102030405");
	private Car car = new Car("Citroen", "C3", 5, "AA-000-AA", profil);
	
	@Test
	public void createAndFind() {
		profilRepository.save(profil);
		carRepository.save(car);
		
		List<Car> cars = carRepository.findByMarque("Citroen");
		for (Car elt : cars) {
			assertThat(elt.getMarque()).isEqualTo(car.getMarque());
		}
	}
	
	@Test
	public void findAndDelete() {
		List<Car> cars = carRepository.findByMarque("Citroen");
		for (Car car : cars) {
			assertThat(car.getMarque().equals("Citroen"));
		}
		cars = carRepository.findByModele("C3");
		
	}
}
