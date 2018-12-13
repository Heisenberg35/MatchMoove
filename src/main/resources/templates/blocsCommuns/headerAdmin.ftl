<#import "/spring.ftl" as spring/> 

        
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>





<header id="headerAdmin">
				<a href="/home"><div id="logo"><img src="/images/matchmooveBLANCS.png"></div></a>
	
                <nav>
                    <ul>
                    <#if roles?has_content>
    						<#list roles as r>
            					<#if r=="ROLE_ADMIN">
            						<li><a href="/admin/">Gestion Administration</a></li>
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

                        <li><a href="/admin/createcompte">Créer un compte</a></li>
                     	<li><a href="/admin/listuser">Gestion des comptes</a></li>					
						<a href="/logout"><img src="/images/logout.png"></a>
                    </ul>
				</nav>	
</header>