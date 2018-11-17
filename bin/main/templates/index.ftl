<#import "/spring.ftl" as spring/>

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