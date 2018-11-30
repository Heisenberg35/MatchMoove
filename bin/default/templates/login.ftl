<#import "/spring.ftl" as spring/>

		<title>Login</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/bootstrap.css'/>"/>
	<link rel="stylesheet" type="text/css" href="<@spring.url '/css/login.css'/>"/>
		
	<body>
		<a href=""><img src="images/Matchmoovecouleurs.png" alt="logo matchmoove" class="logo"></a>
		<div id="container">
          
            
			<img src="images/lock%20(1)%20(1).png" id="lock">
            <form method="POST">
                
                <label><b>Adresse mail</b></label>
                <input type="text" placeholder="Adresse mail" name="mail" required>

                <label><b>Mot de passe</b></label>
                <input type="password" placeholder="Mot de passe" name="password" required>

                <input type="submit" id='submit' value='LOGIN' >
                
            </form>
        </div>
	
	
	
	
	</body>



</html>