<div>
	<table class="table">
		<thead>
			<tr>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Telephone</th>
				<th>Adresses</th>
				<th>Actions</th>
				
			</tr>
		</thead>
		<tbody>
		<#if items??>
			<#list items as elt>
			<tr>
				<td><#if elt.getFirstname()??>${elt.getFirstname()}<#else>NULL</#if></td>
				<td><#if elt.getLastname()??>${elt.getLastname()}<#else>NULL</#if></td>
				<td><#if elt.getPhoneNumber()??>${elt.getPhoneNumber()}<#else>NULL</#if></td>
				<td><#if elt.getAdresses()??>
					<#list elt.getAdresses() as a>
						<#if a.getDomicile() == true><div>DOMICILE</div></#if>${a.getNumero()} ${a.getRue()} ${a.getCp()} ${a.getVille()}</#list></#if></td>
				<td><a href="${detailPath}/edit/${elt.getId()}">Show</a></td>
			</#list>
		</#if>
			</tr>
		</tbody>
	</table>
</div>



<!--<div>${i.getId()}</div>
        <#if i.getFirstname()??>
        	<div>Nom : ${i.getFirstname()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getLastname()??>
        	<div>Prenom : ${i.getLastname()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getPhoneNumber()??>
        	<div>Telephone : ${i.getPhoneNumber()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>--------------------------------------------</div>
        <#if i.getAdresses()??>
        	<div>--------------------------------------------</div>
        	<#list i.getAdresses() as a>
        		<div>ADRESSE</div>
        		<div>Numero : ${a.getNumero()}</div>
        		<div>Rue : ${a.getRue()}</div>
        		<div>Code Postal : ${a.getCp()}</div>
        		<div>Ville : ${a.getVille()}</div>
				<#if a.getDomicile() == true><div>DOMICILE</div></#if>
				<div>--------------------------------------------</div>
        	</#list>
        </#if>
        <#if i.getCars()??>
        	<div>--------------------------------------------</div>
        	<#list i.getCars() as c>
        		<div>VOITURE</div>
        		<div>Marque : ${c.getMarque()}</div>
        		<div>Modele : ${c.getModele()}</div>
        		<div>Nombre de places : ${c.getNombreDePlace()}</div>
        		<div>Numero d'immatriculation : ${c.getImmatriculation()}</div>
        		<div>--------------------------------------------</div>
        	</#list>	
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>-->
