<#import "/spring.ftl" as spring/>


<div class="container vostrajet">

   <!--////////////////////////////////////////////////////-->
   <!--            vos message 			                  -->
   <!--////////////////////////////////////////////////////-->
   			<div id="claque"  class="claque">  

                <div id="btn-close" class="btn-close">
                    <span></span>
                 </div>
                 <div id="contenu" >
                 		
                 </div>
    			
   			</div>

   <!--////////////////////////////////////////////////////-->
   <!--             list de vos trajet                     -->
   <!--////////////////////////////////////////////////////-->
   
   <#if pts?has_content>
   	<#list pts as pt>
   		<#if pt.getTrajet().getArchive() != true> 
     <div class="list-trajet-user">
                <div class="list-trajet">
                    <h2>trajet user</h2>
                </div>
                <div class="trajet-content">
                    <ul>
                        <li class="content">
                         <input type="hidden" name="id" value="${pt.getTrajet().getId()}">
                            <div class="title">${pt.getTrajet().getNom()}</div>
                            <div class="content-description">
                                <div id="date" class="date">${pt.getTrajet().getDateDepart()}</div>
                                
                          <#assign id= 0>    
                   		  <#list pt.getProfil().getAdresses() as adr> 
                   		  
                   		         <#assign depart = adr.getStringAdr()>
                        		<#assign arrive = adr.getStringAdr()>      
                              <#if id == 0>  
                                <div id="depart" class="depart"> ${pt.getTrajet().getIsDirection()? then(depart,arrive)}</div>
                                 <div>vers</div>
                               <#else>
                                <div id="arrivied" class="arrivied"> ${pt.getTrajet().getIsDirection()? then(depart,arrive)} </div>
                            </div>
                           </#if>
                        <#assign id++>
                     </#list> 
                     
                     		
                            <div class="listUser">
                                <h3>Passagers : </h3>
                                <ul>
                                    <li> federic larcher</li>
                                    <li> julien larcher</li>
                                </ul>
                            </div>

							
                            <div class="btn btn-delete deleteTrajet">
                                <a href="/user/deleteTrajet/${pt.getTrajet().getId()}">Supprimer</a></div>
                            <div id="deleteMessage" class="btn btn-seen-mess voirMess">
                                <a href="">messages</a>
                            </div>

                            <div id="voirTrajet" class="voirTrajet">
                                <p>voir le trajet</p>
                              <div class="hamb">
                                  <span></span>
                              </div>
                            </div>
                            <input id="secu" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </li>
                    </ul>
                </div>
			</div>
			</#if>
 		</#list> 
    </#if>  
   <!--////////////////////////////////////////////////////-->
   <!--             votre map de trajet                    -->
   <!--////////////////////////////////////////////////////-->

		<div class="container-map">
		   <div class="box">
		       <div id="map"></div>
		   </div>
		</div>   
   
   
   
   
   <!--////////////////////////////////////////////////////-->
   <!--             script                                 -->
   <!--////////////////////////////////////////////////////-->
	<script type="text/javascript" src="<@spring.url '/javascript/mapVosTrajet.js'/>"></script>
    <script type="text/javascript" src="<@spring.url 'https://maps.googleapis.com/maps/api/js?key=AIzaSyDixKXD0laxdblzB7LZpzGk5U-AhQEH4SY&libraries=places&callback=initMap'/>"></script>
	<script type="text/javascript" src="<@spring.url '/javascript/jquery-3.2.1.min.js'/>"></script>
	 <script type="text/javascript" src="<@spring.url '/javascript/vosTrajet.js'/>"></script>
	 
	 
	 