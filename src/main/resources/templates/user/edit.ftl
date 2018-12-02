<#import "/spring.ftl" as spring/>

<#if profil??>
	Bonjour ${profil.getLastname() + " " + profil.getFirstname()}
</#if>