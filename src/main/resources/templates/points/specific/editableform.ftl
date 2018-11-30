<form class="text-center border border-light" action="${detailPath}/edit" method="POST">
<#if item??>
    <div>Id</div>
    <#if item.getId()??>
    <div>${item.getId()}</div>
    <input type="hidden" name="id" value="${item.getId()}">
    <#else>
    <div>NA</div>
    </#if>
</#if>
    <div>longitude</div>
    <input type="text" name="longitude" value="<#if item?? && item.getLongitude()??>${item.getLongitude()}</#if>">
    
    <div>altitude</div>
    <input type="text" name="altitude" value="<#if item?? && item.getAltitude()??>${item.getAltitude()}</#if>">
    
    <div>Choisir le trajet</div>
    <#if trajets??>
    <select name="trajet" required>
        <#list trajets as p>
            <option value=${p.getId()}>${p.getNom() }</option>
        </#list>
    </select>
    </#if>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Save"></div>
     <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
</form> 