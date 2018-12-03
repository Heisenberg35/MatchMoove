<#import "/spring.ftl" as spring/>

<p>Page de gestion de l'utilisateur loggé</p>

<form class="text-center border border-light" action="/user/edit" method="POST">
    <div>Nom</div>
    <input type="text" name="firstname" value="<#if profil?? && profil.getFirstname()??>${profil.getFirstname()}</#if>" required>
    <div>Prenom</div>
    <input type="text" name="lastname" value="<#if profil?? && profil.getLastname()??>${profil.getLastname()}</#if>" required>
    <div>Telephone</div>
    <input type="tel" name="phoneNumber" value="<#if profil?? && profil.getPhoneNumber()??>${profil.getPhoneNumber()}</#if>" required>
	<input type="hidden" name="id" value="${profil.getId()}">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Save"></div>
</form> 