package com.societe.project.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.societe.project.database.DBItem;

@Entity
@Table(name="profil")
public class Profil extends DBItem {
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="phoneNumber")
	private int phoneNumber;
	
	@OneToMany(mappedBy="profil")
	private List<Role> roles;
	
	@OneToOne(mappedBy="profil")
	private Compte compte;

	/***********************************************
	 * GETTEUR ET SETTEUR
	 ***********************************************/
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	/***********************************************
	 * CONSTRUCTEURS
	 ***********************************************/
	public Profil() {
		super();
		this.roles = new ArrayList<Role>();
	}

	public Profil(String firstname, String lastname, int phoneNumber, List<Role> roles, Compte compte) {
		this();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.roles = roles;
		this.compte = compte;
	}
	
}
