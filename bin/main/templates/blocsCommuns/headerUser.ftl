<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>

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
<<<<<<< HEAD
   				</#if>
              
                <li><a href="#">Proposer</a></li>
              	<li><a href="/user/researchtrajet">Rechercher</a></li>
                
                <li><a href="/articles">BLOG</a></li>
                <li><a href="/messagerie">Messagerie</a></li>
                
                <li><a href="#">BLOG</a></li>

=======
   				</#if>             
                <li><a href="#">Proposer</a></li>
              	<li><a href="/user/researchtrajet">Rechercher</a></li>              
                <li><a href="/articles">BLOG</a></li>
                <li><a href="/messagerie">Messagerie</a></li>
>>>>>>> 7d8ea421571d05ead61d3b72f378566592f7b16a
			    <li><a href="/logout"><img src="images/logout.png"></a></li>
             </ul>
		</nav>
		
		<h1>Matchez, Partagez la route !</h1>
</header>