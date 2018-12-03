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
    <div>Titre</div>
    <input type="text" name="title" value="<#if item?? && item.getTitle()??>${item.getTitle()}</#if>" required>
    <div>Description</div>
    <input type="text" name="description" value="<#if item?? && item.getDescription()??>${item.getDescription()}</#if>" required>
    <div>Date</div>
    <input type="date" name="date" value="<#if item?? && item.getDate()??>${item.getDate()}</#if>" required>
    
    <#if comptes??>
    <div>Choisir le compte</div>
    <select name="compte" required>
        <#list comptes as c>
            <option value="<#if item?? && item.getCompte()??>${item.getCompte().getId()}<#else>${c.getId()}></#if>"><#if item?? && item.getCompte()??>${item.getCompte().getEmail()}<#else>${c.getEmail()}</#if></option>
        </#list>
    </select>
    </#if>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <div><input type="submit" value="Save"></div>
</form> 