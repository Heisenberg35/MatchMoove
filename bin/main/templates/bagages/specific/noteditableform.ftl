<input type="hidden" readonly name="items[${index}].id" value="<#if i?? && i.getId()??>${i.getId()}<#else>null</#if>">
<<<<<<< HEAD
<input type="text" readonly name="items[${index}].volume" value="<#if i?? && i.getVolume()??>${i.getVolume()}<#else>null</#if>"><br>
<#if i?? && i.getTrajet()??><a href="/trajets/edit/${i.getTrajet().getId()}" >${i.getTrajet().getNom()}</a><br></#if>
<a href="/trajets/edit/${i.getTrajet().getId()}" >${i.getTrajet().getNom()}</a><br>

=======
<input type="text" readonly name="items[${index}].volume" value="<#if i?? && i.getVolume()??>${i.getVolume()}<#else>null</#if>">
<input type="text" readonly name="items[${index}].trajet" value="<#if i?? && i.getTrajet()??>${i.getTrajet().getNom()}<#else>null</#if>">
<input type="text" readonly name="items[${index}].profile" value="<#if i?? && i.getProfil()??>${i.getProfil().getFirstname()}+" "+${i.getProfil().getLastname()}<#else>null</#if>">
>>>>>>> lama
