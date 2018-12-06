<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<header>
	<a href="/home"><div id="logo"><img src="images/matchmooveBLANCS.png"></div></a>
		<nav>
 			<ul>
            	
   				<li><a href="/user/gestioncompte"><img src="images/profil.png"</a></li>
                <#if roles??>
    				<#list roles as r>
            		<#if r=="ROLE_ADMIN">
            			<li><a href="/admin">Admin</a></li>
            		</#if>
        			</#list>
   				</#if>
                <li><a href="#">Je match !</a></li>
                <li><a href="#">Proposer un trajet</a></li>
                <li><a href="#">Rechercher un trajet</a></li>
<<<<<<< HEAD
                <li><a href="#">Messagerie</a></li>
                <li><a href="/articles">BLOG</a></li>
=======
                <li><a href="/messagerie">Messagerie</a></li>
                <li><a href="#">BLOG</a></li>
>>>>>>> 9f3608a136681a1baab134d271c675a4b4087fb8
			    <li><a href="/logout"><img src="images/logout.png"></a></li>
             </ul>
		</nav>
</header>