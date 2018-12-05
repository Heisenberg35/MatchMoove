<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<header>
	<a href="/home"><div id="logo"><img src="images/matchmooveBLANCS.png"></div></a>
		<nav>
 			<ul>
            	<#if roles??>
    				<#list roles as r>
            		<#if r=="ROLE_ADMIN">
            			<li><a href="/admin">Administrateur</a></li>
            		</#if>
        			</#list>
   				</#if>
   				<li><a href="/user/gestioncompte">Mon compte</a></li>
                <li><a href="#">Je match !</a></li>
                <li><a href="#">Proposer un trajet</a></li>
                <li><a href="#">Rechercher un trajet</a></li>
                <li><a href="#">Messagerie</a></li>
                <li><a href="/articles">BLOG</a></li>
			    <li><a href="/logout"><img src="images/logout.png"></a></li>
             </ul>
		</nav>	
</header>