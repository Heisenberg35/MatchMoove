<#import "/spring.ftl" as spring/>

<link rel="stylesheet" type="text/css" href="<@spring.url '/css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/header.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '/css/popupmsg.css'/>"/>
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
var ss = today.getSeconds();
var m = today.getMinutes();
var hh = today.getHours();
var dd = today.getDate();
var mm = today.getMonth()+1; //January is 0!
var yyyy = today.getFullYear();
if(dd<10) {
    dd = '0'+dd
} 
if(mm<10) {
    mm = '0'+mm
} 
if(hh<10) {
    hh = '0'+hh
} 
if(m<10) {
    m = '0'+m
} 
today = dd + '/' +mm  + '/' + yyyy + '    ' + hh + ':' + m ;

 var notification = 0;
var rootRef = firebase.database().ref('/conversations/${trajetId}')
function sayClicked() {


alert(rootRef);
  var newMessageRef = rootRef.push();
      newMessageRef.set({
      content:  '${userEmail}'+":\n" + document.getElementById("t1").value.trim(),
      date: today
});

}
 var updateMessage = function(element, content,date) {
        document.getElementById(element).value += content + '     ';
       
        document.getElementById(element).value += date + '\n';
        document.getElementById("t1").value = "";
      
    };


 rootRef.once('value', function(snapshot) {
    snapshot.forEach(function(childSnapshot) {
	    var childKey = childSnapshot.key;
	    var childDataContent = childSnapshot.val().content;
	     var childDataDate = childSnapshot.val().date;
	    updateMessage("t2", childDataContent,childDataDate);
	});
});
   

rootRef.orderByKey().limitToLast(1).on('child_added',function(snapshot) {
    updateMessage("t2", snapshot.val().content,snapshot.val().date);
    notification();
   });




</script>



	
<button id="alire"  class="open-button" onclick="openForm()"><img src="/images/message.png" class="popup"> 0 a lire</button>
<div class="chat-popup" id="myForm">
  <form action="" class="form-container">
    <h2>Retrouvez vos messages</h2>

    <label for="msg"><b>Messages</b></label>
    
    <textarea id="t2" readonly rows = "5" cols = "60"  name="content" value=""> </textarea>
    
     <textarea id="t1" rows = "5" cols = "60"  name="content" placeholder="Taper votre message.." name="msg"> </textarea>

    <img onclick="sayClicked()" src="/images/send.png" class="popup">
    
    <img onclick="closeForm()" src="/images/close.png" class="popup">
    
  </form>
</div>

<script>
	var textarea = document.getElementById("t2");
	setInterval(function(){
    	textarea.scrollTop = textarea.scrollHeight;
		}, 1000);
		
		
		  
</script>
<script>
	textArea = document.getElementById("t1");
    formulaire = document.getElementById('MyForm');
		textArea.onkeypress = traiteEntree;
        	function traiteEntree(e) {         
            	if(e.keyCode == 13){
                	sayClicked();
                }
            }
            
            
 
</script>
        
      <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
<script>
	function openForm() {
    	document.getElementById("myForm").style.display = "block";
	}

	function  closeForm() {
    	document.getElementById("myForm").style.display = "none";
    	
	}
	
	function notification(){
	  
		if (document.getElementById("myForm").style.display === "none")
		{ alert(document.getElementById("alire").textContent);
		  document.getElementById("alire").textContent = "1";
		}
	}
</script>
