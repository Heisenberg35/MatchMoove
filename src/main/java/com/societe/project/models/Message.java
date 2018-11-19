package com.societe.project.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.societe.project.database.DBItem;


@Entity
@Table(name="message")
public class Message extends DBItem {
	
	/*
	*************************************************
	*    @Private
	*************************************************
	 */
	
	@Column(name="title")
	private String title;
	@Column(name="decription")
	private String description;
	@Column(name="date")
	private Date date;
	
	@OneToOne()
	private Message message;
	
	@ManyToOne(targetEntity=Trajet.class)
	private List<Trajet> listTrajet= new ArrayList<Trajet>(); 
	
	@ManyToOne(targetEntity=Profil.class)
	private List<Profil> listProfil = new ArrayList<Profil>();
	
	/*
	*************************************************
	*    @Contructeur
	*************************************************
	 */
	
	public Message() {
		super();
	}
	/*
	*************************************************
	*    @Getter setter
	*************************************************
	 */

	public String getObjet() {
		return title;
	}

	public void setObjet(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	public List<Trajet> getListTrajet() {
		return listTrajet;
	}

	public void setListTrajet(Trajet trajet) {
		this.listTrajet.add(trajet);
	}
	
	
	public List<Profil> getListProfil() {
		return listProfil;
	}

	public void setListProfil(Profil profil) {
		this.listProfil.add(profil);
	}
}
