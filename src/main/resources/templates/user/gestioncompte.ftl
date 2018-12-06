<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>		
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/infosUser.css'/>"/>

<title>User Gestion Compte</title>
<header id="headerAdmin">
	<a href="/home"><div id="logo"><img src="../images/matchmooveBLANCS.png"></div></a>
			<h1>Bonjour ${compte.getProfil().getFirstname()} ${compte.getProfil().getLastname()}</h1>
</header>

<form action="/user/gestioncompte" method="POST">
	
	<section id="infosUser">
			<div class="blocInfo">
				<h2>Profil</h2>
				
				<p><label><b>Nom</b></label>
				<input type="text" placeholder="Nom" name="profil.lastname" value="<#if compte?? && compte.getProfil().getLastname()??>${compte.getProfil().getLastname()}</#if>" required> </p>
				
				<p><label><b>Prenom</b></label>
				<input type="text" placeholder="Prénom" name="profil.firstname" value="<#if compte?? && compte.getProfil().getFirstname()??>${compte.getProfil().getFirstname()}</#if>" required> </p>	
				
				<p><label><b>Telephone</b></label>
				<input type="text" placeholder="Numéro de téléphone" name="profil.phoneNumber" value="<#if compte?? && compte.getProfil().getPhoneNumber()??>${compte.getProfil().getPhoneNumber()}</#if>" required></p>
   				<input type="hidden" name="profil.id" value="${compte.getProfil().getId()}">
   				 
   				 <p><label><b>Adresse mail</b></label>
				<input type="text" placeholder="Adresse mail" name="email" value="<#if compte?? && compte.getEmail()??>${compte.getEmail()}</#if>" disabled></p>
			</div>
			
			<div class="blocInfo">
				<h2>Adresse</h2>
			<#if compte.getProfil().getAdresses()?has_content >
    		<#list compte.getProfil().getAdresses() as adresse>
    		<p> </p/>
				<p><label><b>Numero</b></label>
				<input type="text" placeholder="numero" name="profil.adresse.numero" value="<#if adresse.getNumero()??>${adresse.getNumero()}</#if>" required></p>
    			
				<p><label><b>Rue</b></label>
				<input type="text" placeholder="rue" name="profil.adresse.rue" value="<#if adresse.getRue()??>${adresse.getRue()}</#if>" required></p>
				
				
				<p><label><b>Code postal</b></label>
				<input type="text" placeholder="code postal" name="profil.adresse.cp" value="<#if adresse.getCp()??>${adresse.getCp()}</#if>" required></p>
				
				<p><label><b>Ville</b></label>	
				<input type="text" placeholder="ville" name="profil.adresse.ville" value="<#if adresse.getVille()??>${adresse.getVille()}</#if>" required></p>
				
				<!--TODO COMMENT RECUPERER DOMICILE OU TRAVAIL
				<label>Type d'adresse</label>
	    		<input type="radio" id="domicile" name="domicile" value="true" checked/>
			  	<label for="domicile">Domicile</label>
			  	<input type="radio" id="travail" name="domicile" value="false"/>
			  	<label for="travail">Travail</label>
	  			-->
	  			
	  			<input type="hidden" name="profil.adresse.id" value="${adresse.getId()}">
    		</#list>
    		<#else>
				<input type="text" placeholder="numero" name="profil.adresse.numero" required>
				<label><b>Rue</b></label>
				<input type="text" placeholder="rue" name="profil.adresse.rue" required>
				<label><b>Code postal</b></label>
				<input type="number" placeholder="code postal" name="profil.adresse.cp" required>
				<label><b>Ville</b></label>
				<input type="text" placeholder="ville" name="profil.adresse.ville" required>
				<label>Type d'adresse</label>
	    		<input type="radio" id="domicile" name="profil.adresse.domicile" value="true">
	  			<label for="domicile">Domicile</label>
	  			<input type="radio" id="travail" name="profil.adresse.domicile" value="false"/>
	  			<label for="travail">Travail</label>
    		</#if> 
	   				
			</div>
			
			<div class="blocInfo">
				<h2>Voiture </h2>
			<#if compte.getProfil().getCars()?has_content >
	    	<#list compte.getProfil().getCars() as voiture>
	    	
				<p><label><b>Marque</b></label>
				<input type="text" placeholder="marque" name="profil.car.marque" value="<#if voiture.getMarque()??>${voiture.getMarque()}</#if>" required></p>
				
				<p><label><b>Modele</b></label>
				<input type="text" placeholder="modele" name="profil.car.modele" value="<#if voiture.getModele()??>${voiture.getModele()}</#if>" required></p>
				
				<p><label><b>Nombre de places</b></label>
				<input type="number" placeholder="nombre de place" name="profil.car.nombreDePlace" value="<#if voiture.getNombreDePlace()??>${voiture.getNombreDePlace()}</#if>" required></p>
				
				<p><label><b>Plaque d'immatriculation</b></label>
				<input type="text" placeholder="plaque d'immmatriculation" name="profil.car.immatriculation" value="<#if voiture.getImmatriculation()??>${voiture.getImmatriculation()}</#if>" required>
        		<input type="hidden" name="profil.car.id" value="${voiture.getId()}"></p>
			</#list>
		    <#else>
		    	<label><b>Marque</b></label>
				<input type="text" placeholder="marque" name="profil.car.marque" />
				<label><b>Modele</b></label>
				<input type="text" placeholder="modele" name="profil.car.modele" />
				<label><b>Nombre de places</b></label>
				<input type="number" placeholder="nombre de place" name="profil.car.nombreDePlace" />
				<label><b>Plaque d'immatriculation</b></label>
				<input type="text" placeholder="plaque d'immmatriculation" name="profil.car.immatriculation" />
		    </#if>     
			</div>
			
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	    <div><input type="submit" value="Modifier"></div>			
	</section>		

<#include "../blocsCommuns/footer.ftl"/>	