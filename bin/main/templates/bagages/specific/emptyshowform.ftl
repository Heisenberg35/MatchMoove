<div>Volume</div>
<input type="text" name="volume" value="">
<div>Trajet</div>
<input type="text" name="trajet" value="">
<div>Choisir le profil</div>
    <#if profils??>
    <select name="profil" required>
        <#list profils as p>
            <option value=${p.getId()}>${p.getFirstname() + " " + p.getLastname()}</option>
        </#list>
    </select>
    </#if>