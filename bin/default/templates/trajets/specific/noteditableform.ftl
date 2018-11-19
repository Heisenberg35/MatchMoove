<input type="hidden" readonly name="items[${index}].id" value="<#if i?? && i.getId()??>${i.getId()}<#else>null</#if>">
<input type="text" readonly name="items[${index}].perimetre" value="<#if i?? && i.getPerimetre()??>${i.getPerimetre()}<#else>null</#if>">
<input type="text" readonly name="items[${index}].dateDepart" value="<#if i?? && i.getDateDepart()??>${i.getDateDepart()}<#else>null</#if>">