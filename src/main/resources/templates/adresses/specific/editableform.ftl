<form action="${detailPath}/edit" method="POST">
<#if item??>
    <div>Id</div>
    <#if item.getId()??>
    <div>${item.getId()}</div>
    <input type="hidden" name="id" value="${item.getId()}">
    <#else>
    <div>NA</div>
    </#if>
</#if>
    <div>Numero</div>
    <input type="number" name="numero" value="<#if item?? && item.getNumero()??>${item.getNumero()}</#if>">
    <div>Adresse</div>
    <input type="text" name="rue" value="<#if item?? && item.getRue()??>${item.getRue()}</#if>">
    <div>Code postal</div>
    <input type="number" name="cp" value="<#if item?? && item.getCp()??>${item.getCp()}</#if>">
    <div>Ville</div>
    <input type="text" name="ville" value="<#if item?? && item.getVille()??>${item.getVille()}</#if>">
    <input type="radio" id="domicile" name="domicile" value="true" checked/>
  	<label for="domicile">Domicile</label>
  	<input type="radio" id="travail" name="domicile" value="false"/>
  	<label for="travail">Travail</label>
    
    <#if profils??>
    <select firstname="profil">
        <#list profils as p>
            <option value=${c.getId()}>${c.getFirstname()}</option>
        </#list>
    </select>
    </#if>
    <div><input type="submit" value="Save"></div>
</form> 