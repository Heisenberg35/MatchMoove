<div>
	<div>${i.getId()}</div>
        <#if i.getNumero()??>
        	<div>${i.getNumero()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getRue()??>
        	<div>${i.getRue()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getCp()??>
        	<div>${i.getCp()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getVille()??>
        	<div>${i.getVille()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>