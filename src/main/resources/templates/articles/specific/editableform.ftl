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
    <div>Titre</div>
    <input type="text" name="title" value="<#if item?? && item.getTitle()??>${item.getTitle()}</#if>">
    <div>Description</div>
    <input type="text" name="description" value="<#if item?? && item.getDescription()??>${item.getDescription()}</#if>">
    <div>Date</div>
    <input type="date" name="date" value="<#if item?? && item.getDate()??>${item.getDate()}</#if>">
    
    <#if comptes??>
    <select email="compte">
        <#list comptes as c>
            <option value=${c.getId()}>${c.getEmail()}</option>
        </#list>
    </select>
    </#if>
    <div><input type="submit" value="Save"></div>
</form> 