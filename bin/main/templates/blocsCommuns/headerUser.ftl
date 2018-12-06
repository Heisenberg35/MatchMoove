<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<#include "../popupmsg.ftl"/>
<header>
	<a href="/home"><div id="logo"><img src="/images/matchmooveBLANCS.png"></div></a>
		<nav>
 			<ul>
            	
   				<li><a href="/user/gestioncompte"><img src="/images/profil.png"></a></li>
                <#if roles??>
    				<#list roles as r>
            		<#if r=="ROLE_ADMIN">
            			<li><a href="/admin">Admin</a></li>
            		</#if>
        			</#list>
   				</#if>
<<<<<<< HEAD
                <li><a href="#">Proposer</a></li>
                <li><a href="#">Rechercher</a></li>
                <li><a href="/articles">BLOG</a></li>
			    <li><a href="/logout"><img src="/images/logout.png"></a></li>
=======
                <li><a href="#">Je match !</a></li>
                <li><a href="#">Proposer un trajet</a></li>
<<<<<<< HEAD
                <li><a href="#">Rechercher un trajet</a></li>
                <li><a href="/articles">BLOG</a></li>
                <li><a href="/messagerie">Messagerie</a></li>
=======
                <li><a href="/user/researchtrajet">Rechercher un trajet</a></li>
                <li><a href="#">Messagerie</a></li>
                <li><a href="#">BLOG</a></li>
>>>>>>> jeremFunctionV2
			    <li><a href="/logout"><img src="images/logout.png"></a></li>
>>>>>>> ea83ec2d1467dc7dafe0cf85f2acc6b0c4e3928a
             </ul>
		</nav>
		
		<h1>Matchez, Partagez la route !</h1>
</header>