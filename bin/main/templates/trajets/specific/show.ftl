<div>
        <#if i.getNom()??>
        <div>${i.getNom()}</div>
        <#else>
        <div>NULL</div>
        </#if>
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
        <#if i.getHeureDepart()??>
<<<<<<< HEAD
        <div>${i.getHeureDepart()} :
=======
        ${i.getHeureDepart()}:
>>>>>>> lama
        <#else>
        NULL
        </#if>
        <#if i.getMinuteDepart()??>
        ${i.getMinuteDepart()}
        <#else>
        NULL
        </#if>
<<<<<<< HEAD
        </div>
=======
>>>>>>> lama
        <div>
            <a href="${detailPath}/edit/${i.getId()}">Show</a>
            <a href="${detailPath}/delete/${i.getId()}">Delete</a>
        </div>
    </div>