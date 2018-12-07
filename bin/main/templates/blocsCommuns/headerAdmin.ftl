<link rel="stylesheet" type="text/css" href="<@spring.url '../css/header.css'/>"/>

<header id="headerAdmin">
				<a href="/home"><div id="logo"><img src="/images/matchmooveBLANCS.png"></div></a>
	
                <nav>
                    <ul>
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
<<<<<<< HEAD
						<li><a href="/articles">Articles</a></li>
=======
						<li><a href="/articles">BLOG</a></li>
>>>>>>> 7d8ea421571d05ead61d3b72f378566592f7b16a
						<li><a href="/messages">Messages</a></li>						
						<a href="/logout"><img src="/images/logout.png"></a>
                    </ul>
				</nav>	
</header>