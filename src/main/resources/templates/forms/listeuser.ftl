<#import "/spring.ftl" as spring/>


<#include "../blocsCommuns/head.ftl"/>	
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<#include "../blocsCommuns/headerAdmin.ftl"/>	

<div class="br">
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/formCreateUser.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/listeUsers.css'/>"/>
<#include "/forms/editlistuser.ftl"/> 
<div class="br">

<#include "../blocsCommuns/footer.ftl"/>	
	