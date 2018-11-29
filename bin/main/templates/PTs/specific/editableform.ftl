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
    <div>Choisir le profile</div>
    <#if profils??>
    <select name="profil" required>
        <#list profils as p>
        <#if p.getId()??>
            <option value= ${p.getId()}>${p.getFirstname()+" "+ p.getLastname() }</option>
        </#if>
        </#list>
    </select>
    </#if>
   
    
    <div>Choisir le trajet</div>
    <#if trajets??>
    <select name="trajet" required>
    
        <#list trajets as p>
          <#if p.getId()??>
            <option value=${p.getId()}>${p.getNom() }</option>
          </#if>
        </#list>

    </select>
    </#if>
   
    
    <div>nbrePlace</div>
    <input type="text" name="nbrePlace" value="<#if item?? && item.getNbrePlace()??>${item.getNbrePlace()}</#if>">
    
    
    <div>volumeMax</div>
    <input type="text" name="volumeMax" value="<#if item?? && item.getVolumeMax()??>${item.getVolumeMax()}</#if>">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Save"></div>
</form> 