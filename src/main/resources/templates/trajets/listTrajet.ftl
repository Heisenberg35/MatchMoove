<#import "/spring.ftl" as spring/>
   <div class="container-map">

    
    

   <!--////////////////////////////////////////////////////-->
   <!--             MAP                                    -->
   <!--////////////////////////////////////////////////////-->

   <div class="box">
       <div id="map"></div>
   </div>
   
  
  
    <!--////////////////////////////////////////////////////-->
    <!--             liste des trajet user                  -->
    <!--////////////////////////////////////////////////////-->
    
     <#if listPt?has_content>
        <#list listPt as pt>
			<p>${pt.getProfil().getFirstname()}</p>
			<p>${pt.getProfil().getLasttname()}</p>
			<p>${pt.getProfil().getPhoneNumber()}</p>
		</#list>
   </#if>
        <div class="listuser">
            <div class="listuser-title">
                <h1>Listes des trajets</h1>    
            </div>

             <div class="trajet-list">
                     <ul class="ul-list">
                       
                       
                    
                        <li class="list-content">
                            <div class="content-cube">
                             <div class="cube"></div>
                            </div>
                            <div class="trajet-description">
                               <div id="id" class="user user-trajet">TRAJET</div>

                               <div id="firstName" class="user user-mail">       
                                    <p>Nom</p>
                                    <div>jdkjd</div>
                                </div>
                               <div id="lastName" class="user user-nom">           
                                        <p>telephone</p>
                                        <div></div>
                               </div>
                               <div id="phoneNumber" class="user user-nom">  
                                    <p>telephone</p>
                                    <div>22 33 55 6 5 4 </div>
                               </div>
					
                            
                                <div class="user user-prenom">
                                        <p>depart</p>
                                        <div class="adr">
                                            2 rue Saint jean vannes
                                        </div>
                                </div>
                                <div class="user user-prenom">
                                       <p>arrivée</p>
                                        <div class="adr">2 rue Saint jean vannes</div> 
                                </div>
                                <div class="user duree">
                                    <p>duree<p>
                                    <div>2 heures</div>
                                </div>
                               <div class="user user-phone"> 
                                        <p>date de depart : </p>
                                        <div>12/12/2018</div>
                                </div>
                               <div class="user user-adress "> 
                                        <p>nom de place  :</p> 
                                        <div>2</div> 
                                </div>
                             <div class="user user-adress "> 
                                    <p>perimetre :</p> 
                                    <div>${pt.getTrajet().getPerimetre()} km</div>
                            </div>
                         
                           <div class="trajet-match">
                                <a class="button btn-trajet href="user/valideMatch/">Voir trajet</a>
                            </div> 
                            <div class="trajet-match match">
                                <a class="button btn-match" href="user/valideMatch/">Matcher !!</a>
                            </div> 

                             <div class="file-detail"><span class="btn-detail"></span></div>
                            <div class="br"></div>
                        </li>
                        
                     </ul>
             </div>
             <div class="user-foot">
                  <div class="maxsize-user">
                        <div class="maxsize-title">
                            <strong class="infos">Total</strong>
                            <strong class="infos infos-request">
                                nombre de trajet : 24
                            </strong>
                        </div>
                    </div>   
             </div>
        </div>

  </div>