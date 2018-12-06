<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>	
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<title>User Gestion Compte</title>
<header id="headerAdmin">
	<a href="/home"><div id="logo"><img src="../images/matchmooveBLANCS.png"></div></a>
			<h1>Mon compte</h1>
</header>

<form action="/user/gestioncompte" method="POST">
	<p>Compte : </p>
	<label><b>Adresse mail</b></label>
	<input type="text" placeholder="Adresse mail" name="email" value="<#if compte?? && compte.getEmail()??>${compte.getEmail()}</#if>" disabled>
	
	<p>Profil : </p>
	<label><b>Nom</b></label>
	<input type="text" placeholder="Nom" name="profil.lastname" value="<#if compte?? && compte.getProfil().getLastname()??>${compte.getProfil().getLastname()}</#if>" required>
	<label><b>Prénom</b></label>
	<input type="text" placeholder="Prénom" name="profil.firstname" value="<#if compte?? && compte.getProfil().getFirstname()??>${compte.getProfil().getFirstname()}</#if>" required>
	<label><b>Téléphone</b></label>
	<input type="text" placeholder="Numéro de téléphone" name="profil.phoneNumber" value="<#if compte?? && compte.getProfil().getPhoneNumber()??>${compte.getProfil().getPhoneNumber()}</#if>" required>
    <input type="hidden" name="profil.id" value="${compte.getProfil().getId()}">
    
    <p>Adresse : </p>
    <#if compte.getProfil().getAdresses()?has_content >
    <#assign index = 0>
    	<#list compte.getProfil().getAdresses() as adresse>
    		<label><b>Numero</b></label>
			<input type="number" placeholder="numero" name="profil.adresses[${index}].numero" value="<#if adresse.getNumero()??>${adresse.getNumero()}</#if>" required>
			<label><b>Rue</b></label>
			<input type="text" placeholder="rue" name="profil.adresses[${index}].rue" value="<#if adresse.getRue()??>${adresse.getRue()}</#if>" required>
			<label><b>Code postal</b></label>
			<input type="text" placeholder="code postal" name="profil.adresses[${index}].cp" value="<#if adresse.getCp()??>${adresse.getCp()? string ["0"]}</#if>" required>
			<label><b>Ville</b></label>
			<input type="text" placeholder="ville" name="profil.adresses[${index}].ville" value="<#if adresse.getVille()??>${adresse.getVille()}</#if>" required>
			<#if index == 0>
			<input type="hidden" name="profil.adresses[${index}].domicile" value="true">
			<#else>
			<input type="hidden" name="profil.adresses[${index}].domicile" value="false">
			</#if>
  			<input type="hidden" name="profil.adresses[${index}].id" value="${adresse.getId()}">
  			<input type="hidden" name="profil.adresses[${index}].profil.id" value="${compte.getProfil().getId()}">
  	<#assign index++>
        </#list>
    <#else>
    		<label><b>Numero</b></label>
			<input type="number" placeholder="numero" name="profil.adresses[0].numero">
			<label><b>Rue</b></label>
			<input type="text" placeholder="rue" name="profil.adresses[0].rue" required>
			<label><b>Code postal</b></label>
			<input type="number" placeholder="code postal" name="profil.adresses[0].cp" required>
			<label><b>Ville</b></label>
			<input type="text" placeholder="ville" name="profil.adresses[0].ville" required>
  			<input type="hidden" name="profil.adresses[0].domicile" value="true">
  			<input type="hidden" name="profil.adresses[0].profil.id" value="${compte.getProfil().getId()}">
    </#if>   
    
    <p>Voiture : </p>
    <#if compte.getProfil().getCars()?has_content >
    <#assign index = 0>
    	<#list compte.getProfil().getCars() as voiture>
    		<label><b>Marque</b></label>
			<input type="text" placeholder="marque" name="profil.cars[${index}].marque" value="<#if voiture.getMarque()??>${voiture.getMarque()}</#if>">
			<label><b>Modele</b></label>
			<input type="text" placeholder="modele" name="profil.cars[${index}].modele" value="<#if voiture.getModele()??>${voiture.getModele()}</#if>">
			<label><b>Nombre de places</b></label>
			<input type="number" placeholder="nombre de place" name="profil.cars[${index}].nombreDePlace" value="<#if voiture.getNombreDePlace()??>${voiture.getNombreDePlace()}</#if>">
			<label><b>Plaque d'immatriculation</b></label>
			<input type="text" placeholder="plaque d'immmatriculation" name="profil.cars[${index}].immatriculation" value="<#if voiture.getImmatriculation()??>${voiture.getImmatriculation()}</#if>">
        	<input type="hidden" name="profil.cars[${index}].id" value="${voiture.getId()}">
  			<input type="hidden" name="profil.cars[${index}].profil.id" value="${compte.getProfil().getId()}">
    <#assign index++>
        </#list>
    <#else>
    	<label><b>Marque</b></label>
		<input type="text" placeholder="marque" name="profil.cars[0].marque" />
		<label><b>Modele</b></label>
		<input type="text" placeholder="modele" name="profil.cars[0].modele" />
		<label><b>Nombre de places</b></label>
		<input type="number" placeholder="nombre de place" name="profil.cars[0].nombreDePlace" />
		<label><b>Plaque d'immatriculation</b></label>
		<input type="text" placeholder="plaque d'immmatriculation" name="profil.cars[0].immatriculation" />
		<input type="hidden" name="profil.cars[0].profil.id" value="${compte.getProfil().getId()}">
    </#if>     

    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Modifier"></div>             
</form>

<#include "../blocsCommuns/footer.ftl"/>	