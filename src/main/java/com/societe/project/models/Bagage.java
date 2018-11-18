package com.societe.project.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.societe.project.database.DBItem;
@Entity
@Table(name="Bagage")
public class Bagage extends DBItem{
@Column
private int volume;

public int getVolume() {
	return volume;
}

public void setVolume(int volume) {
	this.volume = volume;
}

public Bagage(int volume) {
	super();
	this.volume = volume;
}
public Bagage()
{
	super();
}
}
