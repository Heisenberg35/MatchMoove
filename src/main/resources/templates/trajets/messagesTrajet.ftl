  
   <#import "/spring.ftl" as spring/>

    
     <div class="messages-trajet">
        <div class="content-mess">
            <span>INSCRIVEZ VOS MESSAGES : </span>
        </div>
  	
        <textarea id="mess-trajet" name="message" rows="4" cols="40">
        
            Lorem ipsum dolor sit amet, consectetur adipisicing elit. 
            In voluptates sint eligendi tempora deserunt error nemo accusamus, 
            impedit numquam, illo exercitationem officiis natus placeat tempore 
            voluptatum rerum nihil non maxime.
            
        </textarea>
        
        <div id="message" class="trajet-match match ">
            <a id="sendMess" class="button btn-match" href="#">validez message</a>
             <input id="id" type="hidden" name="id" value="">
             <input id="secu" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
     
             
        </div> 
   
    </div>

