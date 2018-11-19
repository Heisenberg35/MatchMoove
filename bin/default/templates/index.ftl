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
                        <li><a href="#">Je match !</a></li>
                        <li><a href="#">Proposer un trajet</a></li>
                        <li><a href="#">Rechercher un trajet</a></li>
                        <li><a href="#">Messagerie</a></li>
                        <li><a href="#">BLOG</a></li>
                    </ul>
				</nav>	
			
			<div class="dropdown">
				<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
					ADMIN
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
					<li><a href="/adresses" class="list-group-item" title="Adresses">Adresses</a></li>
					<li><a href="/articles" class="list-group-item" title="Articles">Articles</a></li>
					<li><a href="/cars" class="list-group-item" title="cars">Cars</a></li>
					<li><a href="/comptes" class="list-group-item" title="comptes">Comptes</a></li>
					<li><a href="/profils" class="list-group-item" title="profils">Profils</a></li>
					<li><a href="/roles" class="list-group-item" title="roles">Roles</a></li>
					<li><a href="/bagages" class="list-group-item" title="bagages">Bagages</a></li>
					<li><a href="/trajets" class="list-group-item" title="trajets">Trajets</a></li>
					<li><a href="/point" class="list-group-item" title="Point">Point</a></li>
					<li><a href="/pt" class="list-group-item" title="pt">PT</a></li>
					<li><a href="/point" class="list-group-item" title="Point">Point</a></li>
					<li><a href="/message" class="list-group-item" title="message">Messages</a></li>
					
					
					
					
				</ul>
			</div>
			
			        	<h1>Decouvrez les derniers trajets</h1>
        </header>

	<section id="Trajets">
		<div class="col-md-4 ">  
                        <div class="trajetbloc">
							<p>Bain de B</p>
							<p>IMIE RENNES</p>
                            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
							<p>Lucile</p>
							<p>Prix 8,50</p>
                        </div>
		</div>
		<div class="col-md-4 ">  
                        <div class="trajetbloc">
							<p>Bain de B</p>
							<p>IMIE RENNES</p>
                            <img src="images/PORTRAIT1.jpg" id="portait" class="img-circle">
							<p>Lucile</p>
							<p>Prix 8,50</p>
                        </div>
		</div>
			<div class="col-md-4 ">  
                        <div class="trajetbloc">
							<p>Bain de B</p>
							<p>IMIE RENNES</p>
                            <img src="images/PORTRAIT1.jpg" class="img-circle">
							<p>Lucile</p>
							<p>Prix 8,50</p>
                        </div>
		</div>
	
	</section>
<h2>Nos actu !</h2>
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
							<p><a href="#">Aide � la conversion </a></p>
							<p>Et olim licet otiosae sint tribus pacataeque centuriae...</p>
                        </div>
			</div>
	
	</section>
</body>
	
</html>