<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>	
<#include "../blocsCommuns/headerUser.ftl"/>	

<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/infosUser.css'/>"/>
<title>Proposer un trajet</title>
<h2>Bonjour ${compte.getProfil().getFirstname()} ${compte.getProfil().getLastname()}</h2>

<#if compte.getProfil().getCars()?has_content >
		<#list compte.getProfil().getCars() as voiture>
		<label><b>Voiture</b></label>
		<p>Marque : ${voiture.getMarque()}</p>
		<p>Modèle : ${voiture.getModele()}</p>
		<p>Nombre de places : ${voiture.getNombreDePlace()}</p> 
		<p>Immatriculation : ${voiture.getImmatriculation()}</p>
		</#list>
		<br>
	<form action="/user/proposertrajet" method="POST">
		<label><b>Nombre de places disponibles pour ce trajet</b></label>
		<input type="number" placeholder="Nombre de place" name="profil.phoneNumber" required></p>
		
	<#if compte.getProfil().getAdresses()?has_content >
		<label><b>Adresse de départ</b></label>
		<select autofocus required>
		<option valeur=""></option>
		<#list compte.getProfil().getAdresses() as adresse>
			<option valeur="${adresse.getId()}">${adresse.getNumero()} ${adresse.getRue()} ${adresse.getCp()} ${adresse.getVille()}</option>
		</#list>
		</select>
		<p><label><b>Adresse d'arrivée</b></label>
		<select required>
		<option valeur=""></option>
		<#list compte.getProfil().getAdresses() as adresse>
			<option valeur="${adresse.getId()}">${adresse.getNumero()} ${adresse.getRue()} ${adresse.getCp()} ${adresse.getVille()}</option>
		</#list>
		</select>
	</#if>
	<p>
		<label><b>Périmètre</b></label>
		<select autofocus required>
		<option valeur=""></option>
		<option valeur="">5 kms</option>
		<option valeur="">10 kms</option>
		<option valeur="">15 kms</option>
		<option valeur="">20 kms</option>
		<option valeur="">25 kms</option>
		<option valeur="">30 kms</option>
	</p>
	
	<p><label><b>Date</b></label>
	<input type="date" placeholder="date" name="profil.phoneNumber" required></p>
	
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<div><input type="submit" value="Ajouter le trajet"></div>			

</form>

<#else>
<h2>Afin de pouvoir proposer un trajet, il faut d'abord dans la gestion du compte avoir ajouter un véhicule <a href="/user/gestioncompte">cliquez ici</a></h2> 
</#if>
	
	
<#include "../blocsCommuns/footer.ftl"/>