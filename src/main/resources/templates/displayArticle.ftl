<#import "/spring.ftl" as spring/>

<input type="hidden" readonly name="${article.getId()}" value="<#if article?? && article.getId()??>${article.getId()}<#else>null</#if>">
<label><#if article?? && article.getTitle()?? > ${article.getTitle()}<#else>null</#if> </label>
<label><#if article?? && article.getDate()?? > ${article.getDate()?string["yyyy-MM-dd"]}<#else>null</#if> </label>
<label><#if article?? && article.getDescription()?? > ${article.getDescription()}<#else>null</#if> </label>
