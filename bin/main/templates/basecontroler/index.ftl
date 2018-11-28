<#import "/spring.ftl" as spring/>
<#include "../utils/bootstrap.ftl"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>


<h1>${pageName}</h1>


<h2><a href="/home">Retour Accueil</a></h2>

<div><a href="${detailPath}/edit/">Create New</a></div>
<div><a href="${detailPath}/find/">Find by criteria</a></div>
<div><a href="${detailPath}/delete/">Delete by criteria</a></div>
<div>
<#if items??>
	<#list items as i>
		<#include "..${detailPath}/specific/show.ftl"/>
	</#list>
</#if>
</div>
