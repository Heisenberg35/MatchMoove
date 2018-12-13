<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/../css/header.css'/>"/>

<header id="headerAdmin">
	<a href="/home"><div id="logo"><img src="../../images/matchmooveBLANCS.png"></div></a>
</header>	
	
	<div class="form">
	<#include "..${detailPath}/specific/editableform.ftl"/>
	<#if item?? && item.getId()??>
		<div><a href="${detailPath}/delete/${item.getId()}">Supprimer</a></div>
	</#if>
	</div>
	
	
<#include "../blocsCommuns/footer.ftl"/>	