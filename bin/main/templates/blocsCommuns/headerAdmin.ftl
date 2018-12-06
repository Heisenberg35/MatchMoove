<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>
<#include "../popupmsg.ftl"/>

<header id="headerAdmin">
				<a href="/home"><div id="logo"><img src="/images/matchmooveBLANCS.png"></div></a>
	
                <nav>
                    <ul>
<<<<<<< HEAD
                        <li><a href="/admin/createcompte">Create compte</a></li>
                     	<li><a href="/admin/listuser">Gestion Compte</a></li>
                        <li><a href="/cars">Vehicules</a></li>
                        <li><a href="/trajets">Trajets</a></li>
                        <li><a href="/bagages">Bagages</a></li>
                        <li><a href="/points">Coordonnees</a></li>
						<li><a href="/pts">PT</a></li>
=======
                    <#if roles?has_content>
    						<#list roles as r>
            					<#if r=="ROLE_ADMIN">
            						<li><a href="/admin/">Administrateur</a></li>
            					</#if>
        					</#list>
   						</#if>
   						<#if roles??>
    						<#list roles as r>
            					<#if r=="ROLE_USER">
            						<li><a href="#">Utilisateur</a></li>
            					</#if>
        					</#list>
   						</#if>
   						<#if notlogin??>
            					<#if notlogin==true>
            						<li><a href="${login}">${anonyme}</a></li>
            					</#if>	
            			</#if>

                    	
                        <li><a href="/admin/createcompte">Create compte</a></li>
                     	<li><a href="/admin/listuser">Gestion Compte</a></li>
          
                       
>>>>>>> ea83ec2d1467dc7dafe0cf85f2acc6b0c4e3928a
						<li><a href="/articles">Articles</a></li>
						<li><a href="/messages">Messages</a></li>
						
						<a href="/logout"><img src="/images/logout.png"></a>
                    </ul>
				</nav>	
</header>