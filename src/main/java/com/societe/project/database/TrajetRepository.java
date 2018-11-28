package com.societe.project.database;

import java.util.Date;
import java.util.List;

import com.societe.project.database.base.BaseCRUDRepository;
import com.societe.project.models.Trajet;

@org.springframework.stereotype.Repository
public interface TrajetRepository extends BaseCRUDRepository<Trajet> {

	List<Trajet> findByPerimetre(Double Perimetre);
	List<Trajet> findByDateDepart(Date date);
	//List<Trajet> findByPoint(List<Point> Perimetre);
	List<Trajet> findByPerimetreAndDateDepart(Double perimetre, Date dateDepart);
	
}