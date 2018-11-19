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
@Table(name="Bagage")
public class Bagage extends DBItem implements Serializable{
	
@ManyToOne
@JoinColumn(name = "profil_id",referencedColumnName="id")
private Profil profil;

@ManyToOne
@JoinColumn(name = "trajet_id",referencedColumnName="id")
private Trajet trajet;

@Column
private Integer volume;

/***********************************************
 * GETTEUR ET SETTEUR
 ***********************************************/

public Integer getVolume() {
	return volume;
}

public void setVolume(Integer volume) {
	this.volume = volume;
}

public Trajet getTrajet() {
    return trajet;
}

public void setTrajet(Trajet trajet) {
    this.trajet = trajet;
}
public Profil getProfil() {
    return profil;
}

public void setProfil(Profil profil) {
    this.profil = profil;
}

/***********************************************
 * CONSTRUCTEURS
 ***********************************************/

public Bagage(Integer volume, Profil profile, Trajet trajet) {
	super();
	this.volume = volume;
	this.profil = profile;
	this.trajet = trajet;
}
public Bagage()
{
	super();
}
}
