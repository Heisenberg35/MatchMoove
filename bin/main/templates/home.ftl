<#import "/spring.ftl" as spring/>

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
			

                    </ul>
				</nav>	


		</header>
<h2>Decouvrez les derniers trajets</h2>

	<section id="Trajets">
		<div class="col-md-4 ">  
                        <div class="trajetbloc">
							<p>Bain de B</p>
							<p>IMIE RENNES</p>
                            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
							<p>Lucile</p>
							<p>Prix 8,50€</p>
                        </div>
		</div>
		<div class="col-md-4 ">  
                        <div class="trajetbloc">
							<p>Bain de B</p>
							<p>IMIE RENNES</p>
                            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
							<p>Lucile</p>
							<p>Prix 8,50€</p>
                        </div>
		</div>
			<div class="col-md-4 ">  
                        <div class="trajetbloc">
							<p>Bain de B</p>
							<p>IMIE RENNES</p>
                            <img src="images/PORTRAIT1.jpg" class="img-circle">
							<p>Lucile</p>
							<p>Prix 8,50€</p>
                        </div>
		</div>
	</section>
<h2>Nos actualites</h2>
	<section id="Actu">
	
		<div class="col-md-3 ">  
                        <div class="actubloc">
						
                            <a href="#"><img src="images/article3.jpg"></a>
							<p><a href="#">Ecologie : Utiliser MatchMoove! </a></p>
							<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
                        </div>
			</div>
		<div class="col-md-3 ">  
                        <div class="actubloc">

                            <a href="#"><img src="images/article3.jpg"  ></a>
							<p><a href="#">Notre appli fait parler d'elle </a></p>
						<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
                        </div>
		</div>
		<div class="col-md-3 ">  
                        <div class="actubloc">

                            <a href="#"><img src="images/article3.jpg"  ></a>
							<p><a href="#">Hausse du prix du carburant... </a></p>
							<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
                        </div>
		</div>
		<div class="col-md-3">  
                        <div class="actubloc">
	
                            <a href="#"><img src="images/article3.jpg"  ></a>
							<p><a href="#">Aide a la conversion </a></p>
							<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
                        </div>
		</div>
	
	</section>
	<div id="footer">
		<ul>
			<li>Nous contacter</li>
			<li>Nous rejoindre</li>
			<li>Informations Legales</li>
		</ul>
		<ul>
			<a href="/home"><img src="images/matchmooveBLANCS.png"></a>
			<li>Immeuble IMIE</li>
			<li>Rue Pierre de Maupertuis</li>
			<li>35170 BRUZ</li>
		</ul>
	</div>
	
	
</body>
	
</html>
