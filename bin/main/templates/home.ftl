<#import "/spring.ftl" as spring/>

<#include "blocsCommuns/head.ftl"/>	
<#include "blocsCommuns/headerUser.ftl"/>	
<title>Home</title>

<h2>Decouvrez les derniers trajets</h2>

	<section id="Trajets"> 
 		<div class="trajetbloc">
			<p>Bain de B</p>
			<p>IMIE RENNES</p>
            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
			<p>Lucile</p>
			<p>Prix 8,50�</p>
        </div>
		<div class="trajetbloc">
			<p>Bain de B</p>
			<p>IMIE RENNES</p>
            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
			<p>Lucile</p>
			<p>Prix 8,50�</p>
        </div>
		<div class="trajetbloc">
			<p>Bain de B</p>
			<p>IMIE RENNES</p>
            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
			<p>Lucile</p>
			<p>Prix 8,50�</p>
        </div>
	</section>
	
	
<#if lastArticles??>


	<section id="Actu"> 
	<#list lastArticles as i>	
    	<div class="actubloc">
			<h3><a href="displayArticle/${i.getId()}"><#if i.getTitle()??> ${i.getTitle()} </#if> </a></h3>
			<p><#if i.getDescription()??> ${i.getDescription()} </#if></p>
       		<a href="/articles" title="blog">Lire l'article</a>
       	</div>
        
    </#list>
	</section>
 
	</#if>		

<#include "blocsCommuns/footer.ftl"/>
