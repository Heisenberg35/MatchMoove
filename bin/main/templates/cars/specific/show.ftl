<div>
	<div>${i.getId()}</div>
        <#if i.getMarque()??>
        	<div>${i.getMarque()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getModele()??>
        	<div>${i.getModele()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getNombreDePlace()??>
        	<div>${i.getNombreDePlace()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getImmatriculation()??>
        	<div>${i.getImmatriculation()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>