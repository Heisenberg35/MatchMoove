<#import "/spring.ftl" as spring/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<script src="https://www.gstatic.com/firebasejs/5.6.0/firebase.js"></script>
<script>
  // Initialize Firebase
  var config = {
    apiKey: "AIzaSyCRr8ZfguNkfDotA-ykiEmrAGepSYFNuDo",
    authDomain: "matchmoove-80f73.firebaseapp.com",
    databaseURL: "https://matchmoove-80f73.firebaseio.com",
    projectId: "matchmoove-80f73",
    storageBucket: "matchmoove-80f73.appspot.com",
    messagingSenderId: "888582472732"
  };
  firebase.initializeApp(config);
  
 
function writeUserMessage(content) {
  firebase.database().ref('message/').set({
    content: content
  });
}

</script>


<header>
	<a href="/home"><div id="logo"><img src="../../images/matchmooveBLANCS.png"></div></a>
	<h1>Messagerie</h1>
</header>	
	



	
	
	<div>derniers messages<div>
	<textarea readonly rows = "5" cols = "60"  name="content" value=""><#if message?? >${message.getContent()} </#if>  </textarea>
    <div>nouveau message</div>
    <textarea rows = "5" cols = "60"  name="content" value=""> </textarea>
    <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
    <div><input id='notification' onclick='writeUserMessage()' type="submit" value="envoie"></div>
    
	
	


<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br><br>	
<#include "/blocsCommuns/footer.ftl"/>