<#import "/spring.ftl" as spring/>

<link rel="stylesheet" type="text/css" href="<@spring.url '/../css/header.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/../css/default.css'/>"/>
<header id="headerAdmin">

	<a href="/home"><div id="logo"><img src="../images/matchmooveBLANCS.png"></div></a>
		<nav>
			<ul>
				<li><a href="${detailPath}/edit/">Create new</a></li>
                <li><a href="${detailPath}/find/">Find by criteria</a></li>
                <li><a href="${detailPath}/delete/">Delete by criteria</a></li>  
             </ul>
		</nav>	
		<h1>${pageName}</h1>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
		<div id="flex">
<#if items??>
	<#list items as i>
		<#include "..${detailPath}/specific/show.ftl"/>
	</#list>
</#if>
</div>
</header>

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<#include "../blocsCommuns/footer.ftl"/>	


