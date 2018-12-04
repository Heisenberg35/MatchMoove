package com.societe.project.models;





import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	
	@Column(name="content")
	private String content;
	
	
	@Column(name="date")
	private Date date;
	
	@OneToMany(targetEntity=Message.class)
	private List<Message> messages;
	
	@ManyToOne
	@JoinColumn(name = "trajet_id",referencedColumnName="id")
	private Trajet trajet; 
	
	@ManyToOne
	@JoinColumn(name = "profil_id",referencedColumnName="id")
	private Profil profil;
	
	/*
	*************************************************
	*    @Contructeur
	*************************************************
	 */
	public Message(String content,Date date,Trajet trajet,Profil profil,List<Message> messages)
	{
		
		this.content = content;
		this.date = date;
		this.trajet = trajet;
		this.profil = profil;
		this.messages = messages;
				}
	public Message(String content)
	{
		
		this.content = content;
	
		
				}
	
	public Message() {
		super();
	}
	
	
	/*
	*************************************************
	*    @Getter setter
	*************************************************
	 */


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Message> getMessage() {
		return messages;
	}

	public void setMessage(List<Message> message) {
		this.messages = message;
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
	
}
