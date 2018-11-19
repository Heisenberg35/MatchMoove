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
    <div>profil</div>
    <input type="text" name="profil" value="<#if item?? && item.getprofil()??>${item.getprofil()}</#if>">
   
    
    <div>trajet</div>
    <input type="text" name="trajet" value="<#if item?? && item.getTrajet()??>${item.getTrajet()}</#if>">
   
    
    <div>nbrePlace</div>
    <input type="text" name="nbrePlace" value="<#if item?? && item.getNbrePlace()??>${item.getNbrePlace()}</#if>">
    
    
    <div>volumeMax</div>
    <input type="text" name="volumeMax" value="<#if item?? && item.getVolumeMax()??>${item.getVolumeMax()}</#if>">
    <div><input type="submit" value="Save"></div>
</form> 