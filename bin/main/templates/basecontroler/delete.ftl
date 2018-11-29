<#import "/spring.ftl" as spring/>
<#include "../utils/bootstrap.ftl"/>
<h1>${pageName}</h1>

<form class="text-center border border-light" action="${detailPath}/delete" method="POST">
<#include "..${detailPath}/specific/emptyshowform.ftl"/>
<input type="submit" value="Search">
 <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
</form> 

<div>
<#if items??>
<#assign index = 0>
<form action="${detailPath}/deletecriteria" method="POST">
    <#list items as i>
    <#include "..${detailPath}/specific/noteditableform.ftl"/>
    <#assign index++>
    </#list>
    <input type="submit" value="Delete">
     <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
</form>
</#if>
<#if notFound??>
    ${notFound}
</#if>
</div>

<div><a href="${detailPath}/index">Back</a></div>