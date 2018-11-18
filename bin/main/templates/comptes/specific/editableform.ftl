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
    <div>Adresse E-mail</div>
    <input type="email" name="email" value="<#if item?? && item.getEmail()??>${item.getEmail()}</#if>" required>
    <div>Mot de passe</div>
    <input type="password" name="password" value="<#if item?? && item.getPassword()??>${item.getPassword()}</#if>" required>
    <div>Choisir le profil</div>
    <#if profils??>
    <select name="profil" required>
        <#list profils as p>
            <option value=${p.getId()}>${p.getFirstname() + " " + p.getLastname()}</option>
        </#list>
    </select>
    </#if>
    <div>Choisir le role</div>
    <#if roles??>
    <select name="role" required>
        <#list roles as r>
            <option value=${r.getId()}>${r.getName()}</option>
        </#list>
    </select>
    </#if>

    <div><input type="submit" value="Save"></div>
</form> 