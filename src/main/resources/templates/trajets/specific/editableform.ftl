<form  class="text-center border border-light" action="${detailPath}/edit" method="POST">
<#if item??>
    <div>Id</div>
    <#if item.getId()??>
    <div>${item.getId()}</div>
    <input type="hidden" name="id" value="${item.getId()}">
    <#else>
    <div>NA</div>
    </#if>
</#if>  
    <div>nom</div>
    <input type="text" name="nom" value="<#if item?? && item.getNom()??>${item.getNom()}</#if>">
    
    <div>perimetre</div>
    <input type="text" name="perimetre" value="<#if item?? && item.getPerimetre()??>${item.getPerimetre()}</#if>">
    
    <div>dateDepart</div>
    <input type="date"  name="dateDepart" placeholder="date" value=<#if item?? && item.getDateDepart()??>"${item.getDateDepart()}"<#else>""</#if>>
    
    
   <div>heureDepart</div>

   <select name="heureDepart" required>
   <option selected value="<#if item?? && item.getHeureDepart()??>${item.getHeureDepart()}">${item.getHeureDepart()}</#if></option>
   <#list 0..23 as i>
   
     <#if i < 10 >
   	   <option value="0${i}">0${i}</option>
   	 <#else>
   	   <option value="${i}">${i}</option>
   	 </#if>
   </#list>
   </select> 
   
   <select name="minuteDepart" required>
   <option selected value="<#if item?? && item.getMinuteDepart()??>${item.getMinuteDepart()}">${item.getMinuteDepart()}</#if></option>
   <#list 0..11 as i>
     <#assign c = i*5>
   	 <#if c < 10 >
   	   <option value="0${c}">0${c}</option>
   	 <#else>
   	   <option value="${c}">${c}</option>
   	 </#if>
   </#list>
   </select>   
  
    <div><input type="submit" value="Save"></div>
</form> 