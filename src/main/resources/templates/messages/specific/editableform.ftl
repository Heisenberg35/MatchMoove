<form class="text-center border border-light" action="${detailPath}/edit" method="POST">
<#if item??>
    
    <#if item.getId()??>
    <input type="hidden" name="id" value="${item.getId()}">
    <#else>
    <div>NA</div>
    </#if>
</#if>
    
    <div>content</div>
    <input type="text" name="content" value="<#if item?? && item.getContent()??>${item.getContent()}</#if>" required>
    <div>Date</div>
    <input type="date" name="date" value="<#if item?? && item.getDate()??>${item.getDate()}</#if>" required>
    
    <#if profils??>
    <div>Choisir le profil</div>
    <select name="profil" required>
        <#list profils as c>
            <option value="${c.getId()}" >${c.getFirstname()}  ${c.getLastname()}</option>
        </#list>
    </select>
    </#if>
     <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
    <div><input type="submit" value="Save"></div>
</form> 