<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/bootstrap.css'/>"/>

<header>
	<div id="logo"><a href="/home><img src="images/matchmooveBLANCS.png"></a></div>
		<nav>
 			<ul>
            	<#if roles??>
    				<#list roles as r>
            		<#if r=="ROLE_ADMIN">
            			<li><a href="/admin">Administrateur</a></li>
            		</#if>
        			</#list>
   				</#if>
                <li><a href="#">Je match !</a></li>
                <li><a href="#">Proposer un trajet</a></li>
                <li><a href="#">Rechercher un trajet</a></li>
                <li><a href="#">Messagerie</a></li>
                <li><a href="#">BLOG</a></li>
			    <li><a href="/logout"><img src="images/logout.png"></a></li>
             </ul>
			</nav>	
</header>