<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>	
<#include "../blocsCommuns/headerUser.ftl"/>	

<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/infosUser.css'/>"/>
<title>User Gestion Compte</title>
	<h2>Bonjour ${compte.getProfil().getFirstname()} ${compte.getProfil().getLastname()}</h2>

<#if errors ?has_content>
	<div class="error">
		<#list errors.getAllErrors()as error>
		<p>Afin de valider votre formulaire, veuillez corriger le ou les erreurs suivantes :</p>
		<p>${error.getCode()}</p>
		</#list>
	</div>
</#if>

<section id="infosUser">
	<form action="/user/gestioncompte" method="POST">
		<div class="blocInfo">
			<h2>Profil</h2>
			<label><b>Nom</b></label>
			<input type="text" placeholder="Nom" name="profil.lastname" value="<#if compte?? && compte.getProfil().getLastname()??>${compte.getProfil().getLastname()}</#if>" required>
			
			<label><b>Prenom</b></label>
			<input type="text" placeholder="Pr�nom" name="profil.firstname" value="<#if compte?? && compte.getProfil().getFirstname()??>${compte.getProfil().getFirstname()}</#if>" required>
				
				<p><label><b>Telephone</b></label>
				<input type="text" placeholder="Num�ro de t�l�phone" name="profil.phoneNumber" value="<#if compte?? && compte.getProfil().getPhoneNumber()??>${compte.getProfil().getPhoneNumber()}</#if>" required> </p>

   				<input type="hidden" name="profil.id" value="${compte.getProfil().getId()}">
   				 
   				 <p><label><b>Adresse mail</b></label>
				<input type="text" placeholder="Adresse mail" name="email" value="<#if compte?? && compte.getEmail()??>${compte.getEmail()}</#if>" disabled></p>
			</div>
			
			<div class="blocInfo">

			<#if compte.getProfil().getAdresses()?has_content >
			<#assign index = 0>
    		<#list compte.getProfil().getAdresses() as adresse>
    			<#if index == 0>
    			<h2>Adresse Domicile</h2>
    			</#if>
    			<#if index == 1>
    			<h2>Adresse Travail</h2>
    			</#if>
    			
				<p><label><b>Numero</b></label>
				<input type="text" placeholder="numero" name="profil.adresses[${index}].numero" value="<#if adresse.getNumero()??>${adresse.getNumero()}</#if>" required></p>

    			
				<p><label><b>Rue</b></label>
				<input type="text" placeholder="rue" name="profil.adresses[${index}].rue" value="<#if adresse.getRue()??>${adresse.getRue()}</#if>" required></p>
				
				<p><label><b>Code postal</b></label>
				<input type="text" placeholder="code postal" name="profil.adresses[${index}].cp" value="<#if adresse.getCp()??>${adresse.getCp()? string ["0"]}</#if>" required></p>
				
				<p><label><b>Ville</b></label>	
				<input type="text" placeholder="ville" name="profil.adresses[${index}].ville" value="<#if adresse.getVille()??>${adresse.getVille()}</#if>" required></p>
				
				<#if index == 0>
					<input type="hidden" name="profil.adresses[${index}].domicile" value="true">
				<#else>
					<input type="hidden" name="profil.adresses[${index}].domicile" value="false">
				</#if>
				<#if adresse.getId()?has_content >
					<input type="hidden" name="profil.adresses[${index}].id" value="${adresse.getId()}">
				</#if>
	  			<input type="hidden" name="profil.adresses[${index}].profil.id" value="${compte.getProfil().getId()}">
				<#assign index++>
    		</#list>
    		<#else>
    			<h2>Adresse Domicile</h2>
    			<label><b>Numero</b></label>
    			<input type="text" placeholder="numero" name="profil.adresses[0].numero" required>
				<label><b>Rue</b></label>
				<input type="text" placeholder="rue" name="profil.adresses[0].rue" required>
				<label><b>Code postal</b></label>
				<input type="number" placeholder="code postal" name="profil.adresses[0].cp" required>
				<label><b>Ville</b></label>
				<input type="text" placeholder="ville" name="profil.adresses[0].ville" required>
				<input type="hidden" name="profil.adresses[0].domicile" value="true">
  				<input type="hidden" name="profil.adresses[0].profil.id" value="${compte.getProfil().getId()}">
  				
  				<h2>Adresse Travail</h2>
  				<label><b>Numero</b></label>
    			<input type="text" placeholder="numero" name="profil.adresses[1].numero" required>
				<label><b>Rue</b></label>
				<input type="text" placeholder="rue" name="profil.adresses[1].rue" required>
				<label><b>Code postal</b></label>
				<input type="number" placeholder="code postal" name="profil.adresses[1].cp" required>
				<label><b>Ville</b></label>
				<input type="text" placeholder="ville" name="profil.adresses[1].ville" required>
				<input type="hidden" name="profil.adresses[1].domicile" value="false">
  				<input type="hidden" name="profil.adresses[1].profil.id" value="${compte.getProfil().getId()}">
    		</#if> 

			</div>

			<div class="blocInfo">
				<h2>Voiture </h2>
				<div class="form-group-voiture">
	        	<input class="form-check-input" type="checkbox" value="" id="ignorePass">
				<label class="label label-nom" for="ignoreepass">
					Cocher pour acc�der aux informations du v�hicule
				</label>
			</div>
			<#if compte.getProfil().getCars()?has_content >
			<#assign index = 0>
	    	<#list compte.getProfil().getCars() as voiture>
	    	
				<p><label><b>Marque</b></label>
				<input type="text" placeholder="marque" id="marque" name="profil.cars[${index}].marque" value="<#if voiture.getMarque()??>${voiture.getMarque()}</#if>" disabled required></p>
				
				<p><label><b>Modele</b></label>
				<input type="text" placeholder="modele" id="modele" name="profil.cars[${index}].modele" value="<#if voiture.getModele()??>${voiture.getModele()}</#if>" disabled required></p>
				
				<p><label><b>Nombre de places</b></label>
				<input type="number" placeholder="nombre de place" id="nbrePlace" name="profil.cars[${index}].nombreDePlace" value="<#if voiture.getNombreDePlace()??>${voiture.getNombreDePlace()}</#if>" disabled required></p>
				
				<p><label><b>Plaque d'immatriculation</b></label>
				<input type="text" placeholder="plaque d'immmatriculation" id="immatriculation" name="profil.cars[${index}].immatriculation" value="<#if voiture.getImmatriculation()??>${voiture.getImmatriculation()}</#if>" disabled required></p>
        		<#if voiture.getId() ?has_content >
        			<input type="hidden" name="profil.cars[${index}].id" value="${voiture.getId()}">
        		</#if>
  				<input type="hidden" name="profil.cars[${index}].profil.id" value="${compte.getProfil().getId()}">
  			<#assign index++>
			</#list>
		    <#else>
		    	<label><b>Marque</b></label>
				<input type="text" placeholder="marque" id="marque" name="profil.cars[0].marque" disabled required />
				<label><b>Modele</b></label>
				<input type="text" placeholder="modele" id="modele" name="profil.cars[0].modele" disabled required/>
				<label><b>Nombre de places</b></label>
				<input type="number" placeholder="nombre de place" id="nbrePlace" name="profil.cars[0].nombreDePlace" disabled required/>
				<label><b>Plaque d'immatriculation</b></label>
				<input type="text" placeholder="plaque d'immmatriculation" id="immatriculation" name="profil.cars[0].immatriculation" disabled required/>
				<input type="hidden" name="profil.cars[0].profil.id" value="${compte.getProfil().getId()}">
		    </#if>     
			</div>
			
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	    <div><input type="submit" value="Mettre a jour mon profil"></div>			
	</form>
	</section>		
            
<script type="text/javascript" src="<@spring.url '/javascript/jquery-3.2.1.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/javascript/gestionCompte.js'/>"></script>
<#include "../blocsCommuns/footer.ftl"/>