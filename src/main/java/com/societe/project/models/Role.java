package com.societe.project.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.societe.project.database.DBItem;


@Entity
@Table(name="role")
public class Role extends DBItem {

	@Column(name="name")
	private String name;
	
	@OneToMany(targetEntity=Compte.class,mappedBy="role")
	private List<Compte> comptes;
	
	@ManyToOne()
	private Profil profil;
	
	/***********************************************
	 * GETTEUR ET SETTEUR
	 ***********************************************/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
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
	public Role() {
		super();
		this.comptes = new ArrayList<Compte>();
	}
	
	public Role(String name) {
		this();
		this.name = name;
	}
	
	public Role(String name, List<Compte> comptes, Profil profil) {
		this();
		this.name = name;
		this.comptes = comptes;
		this.profil = profil;
	}

}
