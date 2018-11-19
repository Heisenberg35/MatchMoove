package com.societe.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.societe.project.database.DBItem;
@Entity
@Table(name="Point")
public class Point extends DBItem {
@Column
 private Integer longitude ;
@Column
private Integer altitude ;

@ManyToOne
private Trajet trajet ;

/***********************************************
 * GETTEUR ET SETTEUR
 ***********************************************/

public Integer getLongitude() {
	return longitude;
}
public void setLongitude(Integer longitude) {
	this.longitude = longitude;
}
public Integer getAltitude() {
	return altitude;
}
public void setAltitude(Integer altitude) {
	this.altitude = altitude;
}
public Trajet getTrajet()
{
	return trajet;}

public void setTrajet(Trajet trajet) {
	this.trajet = trajet;
}

/***********************************************
 * CONSTRUCTEURS
 ***********************************************/

public Point(Integer longitude, Integer altitude,Trajet trajet) {
	super();
	this.longitude = longitude;
	this.altitude = altitude;
	this.trajet = trajet;
}
 
public Point() {
 super();
}
}
