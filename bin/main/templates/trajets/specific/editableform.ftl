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
    <div>nom</div>
    <input type="text" name="nom" value="<#if item?? && item.getNom()??>${item.getNom()}</#if>">
    
    <div>perimetre</div>
    <input type="text" name="perimetre" value="<#if item?? && item.getPerimetre()??>${item.getPerimetre()}</#if>">
    
    <div>dateDepart</div>
    <input type="date" name="dateDepart" value="<#if item?? && item.getDateDepart()??>${item.getDateDepart()}</#if>">
    
    
    <select name="h" required>
            <option value="01">00</option>
            <option value="01">01</option>
    </select> 
    h 
   <select name="m" required>
            <option value="01">00</option>
            <option value="01">05</option>
    </select>
    <input type="hidden" name="heureDepart" value="">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Save"></div>
</form> 