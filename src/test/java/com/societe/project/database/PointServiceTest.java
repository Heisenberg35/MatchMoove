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

import com.societe.project.models.Point;
import com.societe.project.models.Trajet;

/**
 * @author Fabrice
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations="classpath:test.application.properties")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PointServiceTest {
	
	@Autowired
	PointRepository pointRepository;
	@Autowired
	TrajetRepository trajetRepository;
	
	@Test
    public void createAndFind() {
		Trajet trajet = new Trajet();
		Point point = new Point(10.5, 10.5, trajet);
		
		point.setAltitude(10.5);
		point.setLongitude(10.5);
		point.setTrajet(trajet);
		
		trajetRepository.save(trajet);
		pointRepository.save(point);
		
		List<Point> points = pointRepository.findByLongitudeAndAltitude(point.getLongitude(), point.getAltitude());
		for (Point elt : points) {
			assertThat(elt.getLongitude() + elt.getAltitude()).isEqualTo(point.getLongitude() + point.getAltitude()); 
		}
	}
	
	@Test
    public void findAndDelete() {
		List<Point> points = pointRepository.findByLongitudeAndAltitude(10.5, 10.5);
		for (Point elt : points) {
			assertThat(elt.getLongitude().equals(10.5)); 
			assertThat(elt.getAltitude().equals(10.5)); 
		}
		for (Point elt : points) {
			pointRepository.delete(elt);
		}
		assertThat(points.isEmpty());
	}
}
