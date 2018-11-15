package com.societe.project.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.societe.project.database.DBItem;

@Entity
@Table(name="compte")
public class Compte extends DBItem {

	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne()
	private Role role;
	
	@OneToMany(targetEntity=Article.class,mappedBy="compte")
	private List<Article> articles;
	
	@OneToOne()
	private Profil profil;

	/***********************************************
	 * GETTEUR ET SETTEUR
	 ***********************************************/
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
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
	public Compte() {
		super();
		this.articles = new ArrayList<Article>();
	}
	
	public Compte(String email, String password, Role role, List<Article> articles, Profil profil) {
		this();
		this.email = email;
		this.password = password;
		this.role = role;
		this.articles = articles;
		this.profil = profil;
	}
	
}
