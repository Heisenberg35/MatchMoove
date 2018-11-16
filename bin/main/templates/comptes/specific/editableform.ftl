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
    <div>Adresse E-mail</div>
    <input type="email" name="email" value="<#if item?? && item.getEmail()??>${item.getEmail()}</#if>">
    <div>Mot de passe</div>
    <input type="password" name="password" value="<#if item?? && item.getPassword()??>${item.getPassword()}</#if>">
    
    <#if roles??>
    <select name="role">
        <#list roles as r>
            <option value=${r.getId()}>${r.getName()}</option>
        </#list>
    </select>
    </#if>
    <div><input type="submit" value="Save"></div>
</form> 