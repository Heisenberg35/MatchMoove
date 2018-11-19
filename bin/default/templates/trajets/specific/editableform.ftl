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
    <div>perimetre</div>
    <input type="text" name="perimetre" value="<#if item?? && item.getPerimetre()??>${item.getPerimetre()}</#if>">
    
    <div>dateDepart</div>
    <input type="text" name="dateDepart" value="<#if item?? && item.getDateDepart()??>${item.getDateDepart()}</#if>">
    
   
    
    <div><input type="submit" value="Save"></div>
</form> 