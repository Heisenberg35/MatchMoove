<div>
	
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
        	<div>Date : ${i.getDate()?string["yyyy-MM-dd"]}</div>
        <#else>
        	<div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
</div>