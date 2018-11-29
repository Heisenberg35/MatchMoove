<#import "/spring.ftl" as spring/>
<#include "../utils/bootstrap.ftl"/>
<h1>${pageName}</h1>

<form class="text-center border border-light" action="${detailPath}/find" method="POST">
<#include "..${detailPath}/specific/emptyshowform.ftl"/>
<input type="submit" value="Search">
 <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
</form> 

<div>
<#if items??>
    <#list items as i>
        <#include "..${detailPath}/specific/show.ftl"/>
    </#list>
</#if>
<#if notFound??>
    ${notFound}
</#if>
</div>

<div><a href="${detailPath}/index">Back</a></div>