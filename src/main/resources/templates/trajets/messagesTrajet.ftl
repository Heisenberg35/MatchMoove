  
   <#import "/spring.ftl" as spring/>

    
     <div class="messages-trajet">
        <div class="content-mess">
            <span>INSCRIVEZ VOS MESSAGES : </span>
        </div>
  	
        <textarea id="mess-trajet" name="message" rows="4" cols="40">
        
           Vous pouvez écrire vos messages dans cette case. 
            
        </textarea>
        
        <div id="message" class="trajet-match match ">
			<a id="sendMess" class="button btn-match" href="#">Valider</a>
			<input id="id" type="hidden" name="id" value="">
			<input id="secu" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </div> 
   
    </div>

