package com.societe.project.models;


import java.util.ArrayList;
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
    
    @OneToMany(targetEntity=PT.class,mappedBy = "trajet")
    private List<PT> pts;
    
    @OneToMany(targetEntity=Bagage.class,mappedBy = "trajet")
    private List<Bagage> bagages;

    /***********************************************
	 * GETTEUR ET SETTEUR
	 ***********************************************/
    public List<Point> getPoint() {
        return points;
    }

    public void setPoint(List<Point> points) {
        this.points = points;
    } 
    public List<PT> getPT() {
        return pts;
    }

    public void setPT(List<PT> pts) {
        this.pts = pts;
    }

    public List<Bagage> getBagage() {
        return bagages;
    }

    public void setBagage(List<Bagage> bagages) {
        this.bagages = bagages;
    }

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
    
	/***********************************************
	 * CONSTRUCTEURS
	 ***********************************************/
	
	public Trajet(Double perimetre, Date dateDepart,List<PT>pts,List<Bagage>bagages) {
		super();
		this.perimetre = perimetre;
		this.dateDepart = dateDepart;
		this.pts = pts;
		this.bagages = bagages;
	}

	public Trajet() {
	super();
	this.bagages = new ArrayList<Bagage>();
	this.pts = new ArrayList<PT>();
	
	}
	
}