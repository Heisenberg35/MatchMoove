<#import "/spring.ftl" as spring/>

<<<<<<< HEAD
<link rel="stylesheet" type="text/css" 
    href="<@spring.url '/css/bootstrap.css'/>"/>
<script src="<@spring.url '/javascript/bootstrap.js'/>"></script>

 <link rel="stylesheet" type="text/css" 
    href="<@spring.url '/css/default.css'/>"/>
     
<h1>Coucou</h1>
<p>Hello</p>
aizjejoiajzeoijaziejoiazjeoijaoziejzajie
<button type="button" class="btn btn-warning">Warning</button>

<div>${att1}</div>

<div>${user}</div>
<div>${user.getFirstname()}</div>
<div>${user.getLastname()}</div>

<#assign a = 1>
<#if users??>

<#list users as u>
<#if u.getLastname() = "u1">
<div>coucou</div>
</#if>
<div> ${a}
	<div>${u.getFirstname()}</div>
	<div>${u.getLastname()}</div>
</div>
<#assign a++>
</#list>

</#if>

<form action="/save1" method="POST">
  First name:<br>
  <input type="text" name="firstname" value="Mickey">
  <br>
  Last name:<br>
  <input type="text" name="lastname" value="Mouse">
  <br><br>
  <input type="submit" value="Submit">
</form> 
=======
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/bootstrap.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>

<script type="text/javascript" src="<@spring.url '/js/bootstrap.js'/>"/></script>

<div>
	<h1>PAGE D'ACCUEIL</h1>
</div>
<div class="container">
  <h2>Admin</h2>
  <div class="list-group">
    <a href="/adresses" class="list-group-item">Adresse</a>
    <a href="/articles" class="list-group-item">Articles</a>
    <a href="/cars" class="list-group-item">Cars</a>
    <a href="/comptes" class="list-group-item">Comptes</a>
    <a href="/profils" class="list-group-item">Profils</a>
    <a href="/roles" class="list-group-item">Roles</a>
  </div>
</div>
>>>>>>> 4ac768b3313a6375101c3b516f3e0e1e4c7a383c
