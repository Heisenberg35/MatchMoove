<div>
	<div>${i.getId()}</div>
        <#if i.getEmail()??>
        	<div>${i.getEmail()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <#if i.getPassword()??>
        	<div>${i.getPassword()}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>