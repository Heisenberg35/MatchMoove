<div>
	<div>${i.getId()}</div>
        <#if i.getTitle()??>
        	<div>Titre : ${i.getTitle()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getDescription()??>
        	<div>Description : ${i.getDescription()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getDate()??>
        	<div>Date : ${i.getDate()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getCompte()??>
        	<div>Compte : ${i.getCompte().getEmail()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>