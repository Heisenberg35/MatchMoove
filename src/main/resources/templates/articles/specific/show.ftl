<div>
	<div>${i.getId()}</div>
        <#if i.getTitle()??>
        	<div>${i.getTitle()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getDescription()??>
        	<div>${i.getDescription()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getDate()??>
        	<div>${i.getDate()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>