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
 private int longitude ;
@Column
private int altitude ;

@ManyToOne
private Trajet trajet ;

/***********************************************
 * GETTEUR ET SETTEUR
 ***********************************************/

public int getLongitude() {
	return longitude;
}
public void setLongitude(int longitude) {
	this.longitude = longitude;
}
public int getAltitude() {
	return altitude;
}
public void setAltitude(int altitude) {
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

public Point(int longitude, int altitude,Trajet trajet) {
	super();
	this.longitude = longitude;
	this.altitude = altitude;
	this.trajet = trajet;
}
 
public Point() {
 super();
}
}
