package com.societe.project.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.societe.project.database.DBItem;
@Entity
@Table(name="PT")
public class PT extends DBItem{
@Column
private int nbrePlace;
@Column
private int volumeMax;




public int getNbrePlace() {
	return nbrePlace;
}
public void setNbrePlace(int nbrePlace) {
	this.nbrePlace = nbrePlace;
}
public int getVolumeMax() {
	return volumeMax;
}
public void setVolumeMax(int volumeMax) {
	this.volumeMax = volumeMax;
}
public PT(int nbrePlace, int volumeMax) {
	super();
	this.nbrePlace = nbrePlace;
	this.volumeMax = volumeMax;
}	
public PT() {
	super();
}
}

