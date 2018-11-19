package com.societe.project.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.societe.project.database.DBItem;
@Entity
@Table(name="PT")
public class PT extends DBItem implements Serializable{
	
@ManyToOne
@JoinColumn(name = "profil_id",referencedColumnName="id")
private Profil profil;

@ManyToOne
@JoinColumn(name = "trajet_id",referencedColumnName="id")
private Trajet trajet;

@Column
private Integer nbrePlace;

@Column
private Integer volumeMax;

/***********************************************
 * GETTEUR ET SETTEUR
 ***********************************************/

public Integer getNbrePlace() {
	return nbrePlace;
}
public void setNbrePlace(Integer nbrePlace) {
	this.nbrePlace = nbrePlace;
}
public Integer getVolumeMax() {
	return volumeMax;
}
public void setVolumeMax(Integer volumeMax) {
	this.volumeMax = volumeMax;
}
public Trajet getTrajet() {
    return trajet;
}

public void setTrajet(Trajet trajet) {
    this.trajet = trajet;
}
public Profil getprofil() {
    return profil;
}

public void setprofil(Profil profil) {
    this.profil = profil;
}

/***********************************************
 * CONSTRUCTEURS
 ***********************************************/

public PT(Integer nbrePlace, Integer volumeMax, Profil profile, Trajet trajet) {
	super();
	this.nbrePlace = nbrePlace;
	this.volumeMax = volumeMax;
	this.profil = profile;
	this.trajet = trajet;
}	
public PT() {
	super();
}
}

