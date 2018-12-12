<#import "/spring.ftl" as spring/>
  <div class="list-message">
                    <h2>Messages relatifs aux trajets</h2>
                    <div class="messages-content">
                        <ul>
                     <#if messages?has_content>
                     	<#list messages as message> 
                            <li class="contents"> 
                                <input id="id-mess" type="hidden" name="id" value="${message.getId()}">
                                    <div class="ct sender-user">

                                        <div class="sender">Nom de l'expéditeur</div>
                                    </div>
                                    <div class="ct title">Numéro du trajet</div>
                                    <div class="ct content-descriptions">
                                       <p>Ecrivez ici votre message !</p>
                                    </div>
                                     <div class="btn btn-seen-delete deleteMess">
                                        <a  id="delMessage" href="#">Supprimer</a>

                                        <div class="sender">${message.getProfil().getFirstname()}</div>
                                    </div>
                                    <div class="ct title">${message.getTrajet().getNom()}</div>
                                    <div class="ct content-descriptions">
                                       <p>${message.getContent()}</p>
                                    </div>
                                     <div class="btn btn-seen-delete deleteMess">
                                        <a  id="delMessage" href="/user/delmessage/${message.getId()}">DELETE</a>

                                    </div>
                            	</li>
                           </#list> 
                         </#if>  	
                        </ul>
                    </div>
   </div>
 
  