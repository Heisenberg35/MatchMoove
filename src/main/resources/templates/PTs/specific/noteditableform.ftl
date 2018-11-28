<input type="hidden" readonly name="items[${index}].id" value="<#if i?? && i.getId()??>${i.getId()}<#else>null</#if>">
<input type="text" readonly name="items[${index}].nbrePlace" value="<#if i?? && i.getNbrePlace()??>${i.getNbrePlace()}<#else>null</#if>">
<input type="text" readonly name="items[${index}].volumeMax" value="<#if i?? && i.getVolumeMax()??>${i.getVolumeMax()}<#else>null</#if>">
<a href="/trajets/edit/${i.getTrajet().getId()}"><#if i?? && i.getTrajet().getNom??>${i.getTrajet()}<#else>null</#if></a> >
