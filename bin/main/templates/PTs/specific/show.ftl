<div>
        <div>${i.getId()}</div>
        <#if i.getNbrePlace()??>
        <div>${i.getNbrePlace()}</div>
        <#else>
        <div>NULL</div>
        </#if>
        <#if i.getVolumeMax()??>
        <div>${i.getVolumeMax()}</div>
        <#else>
        <div>NULL</div>
        </#if>
        <#if i.getTrajet()??>
        <div>${i.getTrajet()}</div>
        <#else>
        <div>NULL</div>
        </#if>
        <#if i.getprofil()??>
        <div>${i.getprofil()}</div>
        <#else>
        <div>NULL</div>
        </#if>
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
    </div>