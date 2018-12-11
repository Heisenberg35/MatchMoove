<#import "/spring.ftl" as spring/>
<#include "../blocsCommuns/head.ftl"/>	
<#include "../blocsCommuns/headerUser.ftl"/>	

<link rel="stylesheet" type="text/css" href="<@spring.url '../css/default.css'/>"/>
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/bootstrap.min.css'/>"/>			
<link rel="stylesheet" type="text/css" href="<@spring.url '../css/formCreateUser.css'/>"/>	
<title>Proposer un trajet</title>
<h2>Bonjour ${compte.getProfil().getFirstname()} ${compte.getProfil().getLastname()}</h2>
<#if errors ?has_content>
	<div class="error">
		<#list errors.getAllErrors()as error>
		<p>Afin de valider votre formulaire, veuillez corriger le ou les erreurs suivantes :</p>
		<p>${error.getCode()}</p>
		</#list>
	</div>
</#if>

<#if compte.getProfil().getCars()?has_content >
	<div class="l-container l-client">
		<div class="forms form-client">
        	<div class="title-form"><h2>Creation Nouveau Trajet :</h2></div>
				<div class="form-creat" id="form-client">
					<form action="/user/proposertrajet" method="POST">
						<input type="hidden" name="profil.lastname" value="<#if compte?? && compte.getProfil().getLastname()??>${compte.getProfil().getLastname()}</#if>"/>
						<input type="hidden" name="profil.firstname" value="<#if compte?? && compte.getProfil().getFirstname()??>${compte.getProfil().getFirstname()}</#if>"/>
						<input type="hidden" name="profil.phoneNumber" value="<#if compte?? && compte.getProfil().getPhoneNumber()??>${compte.getProfil().getPhoneNumber()}</#if>"/>
   						<input type="hidden" name="profil.id" value="${compte.getProfil().getId()}"/>
						<br>
						<div class="form-group">
                        	<label class="label label-nom" for="nom">Nom du trajet :</label>
							<div class="input-group">
								<input class="form-control" type="text" placeholder="Nom du trajet" name="nom" required>
							</div>
                        </div>
						<div class="form-group">
							<label class="label label-nom" for="nbrePlace">Places disponibles :</label>
							<div class="input-group">
								<input class="form-control" type="number" min=1 placeholder="Nombre de place" name="nbrePlace" required>
							</div>
                        </div>
						<div class="form-group">
							<label class="label label-nom" for="isDirection">Choisir le trajet :</label>
								<select name="isDirection" required>
									<option value=""></option>
									<option value="1">Domicile vers Travail</option>
									<option value="0">Travail vers Domicile</option>
								</select>
                        </div>
						<div class="form-group">
							<label class="label label-nom" for="perimetre">P�rim�tre (en kms) :</label>
							<div class="input-group">
								<input class="form-control" type="number" min=0 name="perimetre" required>
							</div>
                        </div>
						<div class="form-group">
							<label class="label label-nom" for="dateDepart">Date de d�part :</label>
							<div class="input-group">
								<input class="form-control" type="date" placeholder="date d�part trajet" name="dateDepart" required>
							</div>
                        </div>
						<div class="form-group">
							<label class="label label-nom" for="heureDepart">Heure :</label>
							<select name="heureDepart">
								<#list 0..23 as i>
									<option value="${i}">${i}</option>
				 				</#list>      
							</select>
                        </div>
						<div class="form-group">
							<label class="label label-nom" for="minuteDepart">Minute :</label>
							<select name="minuteDepart">
								<#list 0..11 as i>
									<option value="${i*5}">${i*5}</option>
				 				</#list>     
							</select>
                        </div>
						<div class="form-group form-btn">
							<input type="hidden" name="archive" value="false"/>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <button id="valider" class="btn btn-success" name="valider" value="Save" type="submit">Valider 
                                <span class="glyphicon glyphicon-send"></span>
                            </button>
                            <button class="btn btn-danger" name="reset" type="reset">Reset
                                    <span class="glyphicon glyphicon-trash"></span>
                            </button>
                        </div>			
					</form>
				</div>
			</div>
		</div>
	</div>
<#else>
<p>Afin de pouvoir proposer un trajet, il faut d'abord dans la gestion du compte avoir ajouté un véhicule <a href="/user/gestioncompte">cliquez ici</a></p>
</#if>
	
	
<#include "../blocsCommuns/footer.ftl"/>