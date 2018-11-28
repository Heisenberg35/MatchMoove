package com.societe.project.models;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.annotation.Timed;

import com.societe.project.database.DBItem;

@Entity
@Table(name="trajet")
public class Trajet extends DBItem {

	@Column(name="nom")
	private String nom;

	@Column(name="perimetre")
	private Double perimetre;
	
	@Column(name="dateDepart")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDepart;
	
	@Column
	private Integer heureDepart;
	
	@Column
	private Integer minuteDepart;
	
    

	@OneToMany(targetEntity=Point.class,mappedBy="trajet")
	private List<Point> points;
    
    @OneToMany(targetEntity=PT.class,mappedBy = "trajet")
    private List<PT> pts;
    
    @OneToMany(targetEntity=Bagage.class,mappedBy = "trajet")
    private List<Bagage> bagages;

    /***********************************************
	 * GETTEUR ET SETTEUR
	 ***********************************************/
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
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
	//	DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Integer getHeureDepart() {
		return heureDepart;
	}

	public void setHeureDepart(Integer heureDepart) {
		this.heureDepart = heureDepart;
	}
	
	public Integer getMinuteDepart() {
		return minuteDepart;
	}

	public void setMinuteDepart(Integer minuteDepart) {
		this.minuteDepart = minuteDepart;
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
	
	public Trajet(String nom,Double perimetre, Date dateDepart,Integer heureDepart,Integer minuteDepart,List<PT>pts,List<Bagage>bagages) {
		super();
		this.nom = nom;
		this.perimetre = perimetre;
		this.dateDepart = dateDepart;
		this.heureDepart = heureDepart;
		this.minuteDepart = minuteDepart;
		this.pts = pts;
		this.bagages = bagages;
	}

	public Trajet() {
	super();
	this.bagages = new ArrayList<Bagage>();
	this.pts = new ArrayList<PT>();
	
	}
	
}