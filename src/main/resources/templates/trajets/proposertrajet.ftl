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
		<label><b>Informations du véhicule pour le trajet</b></label>
		<p>Marque : ${voiture.getMarque()}</p>
		<p>Modèle : ${voiture.getModele()}</p>
		<p>Nombre de places : ${voiture.getNombreDePlace()}</p> 
		<p>Immatriculation : ${voiture.getImmatriculation()}</p>
		</#list>
		<br>
	<form action="/user/proposertrajet" method="POST">
		<label><b>Nom du trajet</b></label>
		<input type="text" placeholder="Nom du trajet" name="nom"></p>
	
		<label><b>Nombre de places disponibles pour ce trajet</b></label>
		<input type="number" placeholder="Nombre de place" name="nbrePlace"></p>
		
		<label><b>Choisir le trajet</b></label>
		<select name="isDirection">
			<option valeur=""></option>
			<option valeur="1">Domicile vers Travail</option>
			<option valeur="0">Travail vers Domicile</option>
		</select>	
			
<!--	
	<#if compte.getProfil().getAdresses()?has_content >
		<label><b>Adresse de départ</b></label>
		<select>
			<option valeur=""></option>
			<#list compte.getProfil().getAdresses() as adresse>
				<option valeur="${adresse.getId()}">${adresse.getNumero()} ${adresse.getRue()} ${adresse.getCp()} ${adresse.getVille()}</option>
			</#list>
		</select>
		<p><label><b>Adresse d'arrivée</b></label>
		<select>
		<option valeur=""></option>
		<#list compte.getProfil().getAdresses() as adresse>
			<option valeur="${adresse.getId()}">${adresse.getNumero()} ${adresse.getRue()} ${adresse.getCp()} ${adresse.getVille()}</option>
		</#list>
		</select>
	</#if>
-->
	<p>
		<label><b>Périmètre</b></label>
		<input type="number" min=0 name="perimetre" required>
<!--		
		<select name="perimetre" required>
			<option valeur=""></option>
			<option valeur="5">5 kms</option>
			<option valeur="10">10 kms</option>
			<option valeur="15">15 kms</option>
			<option valeur="20">20 kms</option>
			<option valeur="25">25 kms</option>
			<option valeur="30">30 kms</option>
		</select>
-->
	</p>
	
	<p><label><b>Date de départ</b></label></p>
	<input type="date" placeholder="date départ trajet" name="dateDepart">
	
	<p>
		<label><b>Heures</b></label>
		<select name="heureDepart">
	            <#if item?? && item.getHeureDepart()??><option value="${item.getHeureDepart()}">${item.getHeureDepart()}</option></#if>
	    <#list 0..23 as i>
	            <option value="${i}">${i}</option>
	     </#list>      
	    </select> 
	   
	   <label><b>Minutes</b></label>
	   <select name="minuteDepart">
	            <#if item?? && item.getMinuteDepart()??><option value="${item.getMinuteDepart()}">${item.getMinuteDepart()}</option></#if>
	    <#list 0..11 as i>
	            <option value="${i*5}">${i*5}</option>
	     </#list>      
	    </select>
	</p>
	<br>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
<div><input type="submit" value="Enregistrer"></div>			

</form>

<#else>
<h2>Afin de pouvoir proposer un trajet, il faut d'abord dans la gestion du compte avoir ajouter un véhicule <a href="/user/gestioncompte">cliquez ici</a></h2> 
</#if>
	
	
<#include "../blocsCommuns/footer.ftl"/>