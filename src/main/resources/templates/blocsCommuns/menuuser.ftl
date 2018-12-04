      
<#import "/spring.ftl" as spring/>

 	  <!--////////////////////////////////////////////////////-->
      <!--             menu	user		                      -->
      <!--////////////////////////////////////////////////////-->

  				<nav>
          			<ul>
           			
   						<#if roles??>
    						<#list roles as r>
            					<#if r=="ROLE_ADMIN">
            						<li><a href="#">Administrateur</a></li>
            					</#if>
        					</#list>
   						</#if>
   						<#if roles??>
    						<#list roles as r>
            					<#if r=="ROLE_USER">
            						<li><a href="#">Utilisateur</a></li>
            					</#if>
        					</#list>
   						</#if>
   						<#if notlogin??>
            					<#if notlogin==true>
            						<li><a href="${login}">${anonyme}</a></li>
            					</#if>	
            			</#if>
            			
                        <li><a href="#">Je match !</a></li>
                        <li><a href="#">Proposer un trajet</a></li>
                        <li><a href="#">Rechercher un trajet</a></li>
                        <li><a href="#">Messagerie</a></li>
                        <li><a href="#">BLOG</a></li>
			     		<li>
			     			<a href="/logout"><img src="../img/logout.png"></a>
			     		</li>
                    </ul>          
				</nav>	
				
		</header>	          
	            
	              
	                
	                  
	                    
	                      
	                        
	                          
	                            
	                              
	                                
	                                  
	                                    
	                                      
	                                        
	                                          
	                                            
	                                              
	                                                
	                                                  
	                                                    
	                                                      
	                                                        
	