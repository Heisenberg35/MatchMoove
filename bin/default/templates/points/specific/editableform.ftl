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
    <div>longitude</div>
    <input type="text" name="longitude" value="<#if item?? && item.getLongitude()??>${item.getLongitude()}</#if>">
    
    <div>altitude</div>
    <input type="text" name="altitude" value="<#if item?? && item.getAltitude()??>${item.getAltitude()}</#if>">
   
    <div>trajet</div>
    <input type="text" name="trajet" value="<#if item?? && item.getTrajet()??>${item.getTrajet()}</#if>">
    <div><input type="submit" value="Save"></div>
</form> 