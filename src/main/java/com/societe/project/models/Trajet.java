package com.societe.project.models;


import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.societe.project.database.DBItem;

@Entity
@Table(name="trajet")
public class Trajet extends DBItem {

	@Column(name="perimetre")
	private Double perimetre;
	
	@Column(name="dateDepart")
	private Date dateDepart;
	
    @OneToMany(targetEntity=Point.class,mappedBy="trajet")
	private List<Point> points;
    
   
	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public void setPerimetre(Double perimetre) {
		this.perimetre = perimetre;
	}


	public Double getPerimetre() {
		return perimetre;
	}

	public Trajet(Double perimetre, Date dateDepart) {
		super();
		this.perimetre = perimetre;
		this.dateDepart = dateDepart;
	}

	public Trajet() {
	super();
	}
	
}