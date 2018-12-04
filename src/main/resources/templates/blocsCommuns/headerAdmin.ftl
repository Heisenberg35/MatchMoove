<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>

<header id="headerAdmin">
				<a href="/home"><div id="logo"><img src="/images/matchmooveBLANCS.png"></div></a>
	
                <nav>
                    <ul>
                    	<#if roles??>
    						<#list roles as r>
            					<#if r=="ROLE_ADMIN">
            						<li><a href="#">Administrateur</a></li>
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
            			
                        <li><a href="/admin/createcompte">Ajout Client     </a></li>
                        <li><a href="/admin/listuser">Gestion User    </a></li>
                        
                        
                        <li><a href="/adresses">Adresses</a></li>
                        <li><a href="/cars">Vehicules</a></li>
                        <li><a href="/trajets">Trajets</a></li>
                        <li><a href="/bagages">Bagages</a></li>
                        <li><a href="/points">Coordonnees</a></li>
						<li><a href="/pts">PT</a></li>
						<li><a href="/articles">Articles</a></li>
						<li><a href="/messages">Messages</a></li>
						<a href="/logout"><img src="/images/logout.png"></a>
                    </ul>
				</nav>	
</header>