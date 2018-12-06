<#import "/spring.ftl" as spring/>

<#include "../blocsCommuns/head.ftl"/>	
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<header>
	<a href="/home"><div id="logo"><img src="/images/matchmooveBLANCS.png"></div></a>
		<#include "../blocsCommuns/menuuser.ftl"/>
		<h1>Matchez, Partagez la route !</h1>
</header>
	
<div class="br">
<#include "/trajets/editMatchTrajet.ftl"/> 
<#include "../blocsCommuns/footer.ftl"/>	
	
