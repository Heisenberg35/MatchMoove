<div>
        <div>${i.getId()}</div>
        <#if i.getPerimetre()??>
        <div>${i.getPerimetre()}</div>
        <#else>
        <div>NULL</div>
        </#if>
         <#if i.getDateDepart()??>
        <div>${i.getDateDepart()}</div>
        <#else>
        <div>NULL</div>
        </#if>
        <#if i.getPoint()??>
        <#list i.getPoint() as p>
        <div>${p.getLongitude()}</div>
        <div>${p.getAltitude()}</div>
        </#list>
        <#else>
        <div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
    </div>