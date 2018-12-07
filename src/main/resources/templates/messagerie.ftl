<#import "/spring.ftl" as spring/>

<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/header.css'/>"/>
<script src="https://www.gstatic.com/firebasejs/5.6.0/firebase.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase-app.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase-database.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.5.8/firebase-functions.js"></script>

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
  
var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1; //January is 0!
var yyyy = today.getFullYear();
if(dd<10) {
    dd = '0'+dd
} 
if(mm<10) {
    mm = '0'+mm
} 
today = dd + '/' +mm  + '/' + yyyy;


function sayClicked() {

var rootRef = firebase.database().ref('conversation/');
  var newMessageRef = rootRef.push();
      newMessageRef.set({
      content:  '${userEmail}'+":\n" + document.getElementById("t1").value.trim(),
      date: today
});

}

 var updateMessage = function(element, value) {
        document.getElementById(element).value += value + '\n';
        document.getElementById("t1").value = "";
    };
    
 var conversationRef = firebase.database().ref('conversation/');
 
conversationRef.once('value', function(snapshot) {
    snapshot.forEach(function(childSnapshot) {
	    var childKey = childSnapshot.key;
	    var childData = childSnapshot.val().content;
	    updateMessage("t2", childData);
	});
});
    
conversationRef.orderByKey().limitToLast(1).on('child_added',function(snapshot) {
  updateMessage("t2", snapshot.val().content);
});




</script>


<header>
	<a href="/home"><div id="logo"><img src="../../images/matchmooveBLANCS.png"></div></a>
	<h1>Messagerie</h1>
</header>	
	
	
	 <div>derniers messages<div>
	 <textarea id="t2" readonly rows = "5" cols = "60"  name="content" value=""></textarea>
   
     <div>nouveau message</div>
     <textarea id="t1" rows = "5" cols = "60"  name="content" > </textarea>
    
     <div><button onclick="sayClicked()" >envoie</button>
     
     
      <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
   
    
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