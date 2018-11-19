<div>
        <div>${i.getId()}</div>
        <#if i.getName()??>
        <div>${i.getName()}</div>
        <#else>
        <div>NULL</div>
        </#if>
        <#if i.getProfil()??>
        	<div>Profil : ${i.getProfil().getFirstname()} ${i.getProfil().getLastname()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
    </div>