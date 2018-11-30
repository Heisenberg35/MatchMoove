<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>	
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
	<title>MatchMoove</title>
		<header>
				<div id="logo"><img src="images/matchmooveBLANCS.png"></div><a href="/logout"><img src="images/logout.png"></a>
                <nav>
                    <ul>
                    	<li><a href="/profils">Profils</a></li>
                    	<li><a href="/roles">Roles</a></li>
                        <li><a href="/comptes">Comptes</a></li>
                        <li><a href="/adresses">Adresses</a></li>
                        <li><a href="/cars">Vehicules</a></li>
                        <li><a href="/trajets">Trajets</a></li>
                        <li><a href="/bagages">Bagages</a></li>
                        <li><a href="/points">Coordonnees</a></li>
						<li><a href="/pts">PT</a></li>
						<li><a href="/articles">Articles</a></li>
						<li><a href="/messages">Messages</a></li>
                    </ul>
				</nav>	
        </header>
<#include "../blocsCommuns/footer.ftl"/>	
	
