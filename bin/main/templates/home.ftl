<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>	
<#include "../blocsCommuns/headerUser.ftl"/>	

<<<<<<< HEAD
=======
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/bootstrap.css'/>"/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<title>MatchMoove</title>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link href="https://fonts.googleapis.com/css?family=Lato:400,400i,700" rel="stylesheet">
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="60">
		<header>
				<div id="logo"><img src="images/matchmooveBLANCS.png"></div>
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
			

                    </ul>
				</nav>	

		</header>
>>>>>>> master
<h2>Decouvrez les derniers trajets</h2>

	<section id="Trajets"> 
 		<div class="trajetbloc">
			<p>Bain de B</p>
			<p>IMIE RENNES</p>
            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
			<p>Lucile</p>
			<p>Prix 8,50€</p>
        </div>
		<div class="trajetbloc">
			<p>Bain de B</p>
			<p>IMIE RENNES</p>
            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
			<p>Lucile</p>
			<p>Prix 8,50€</p>
        </div>
		<div class="trajetbloc">
			<p>Bain de B</p>
			<p>IMIE RENNES</p>
            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
			<p>Lucile</p>
			<p>Prix 8,50€</p>
        </div>
	</section>
	
<h2>Nos actualites</h2>
	
	<section id="Actu"> 
    	<div class="actubloc">
        	<a href="#"><img src="images/article3.jpg"></a>
			<p><a href="#">Ecologie : Utiliser MatchMoove! </a></p>
			<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
       	</div>
        <div class="actubloc">
         	<a href="#"><img src="images/article3.jpg"  ></a>
			<p><a href="#">Notre appli fait parler d'elle </a></p>
			<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
        </div> 
        <div class="actubloc">
        	<a href="#"><img src="images/article3.jpg"  ></a>
			<p><a href="#">Hausse du prix du carburant... </a></p>
			<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
         </div>
	</section>
	
<#include "../blocsCommuns/footer.ftl"/>	

