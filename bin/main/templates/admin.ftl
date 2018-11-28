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
						<li><a href="/message">Messages</a></li>
                    </ul>
				</nav>	
        </header>

		<footer>
		<div id="liens">
			<a href="#"><p>Liens 1<p></a>
			<a href="#"><p>Liens 2<p></a>
			<a href="#"><p>Liens 3<p></a>
			<a href="#"><p>Liens 4<p></a>
			<a href="#"><p>Liens 5<p></a>
		</div>
	</footer>
</body>
	
</html>
