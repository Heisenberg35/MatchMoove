<div>nom</div>
<input type="text" name="nom" value="">
<div>perimetre</div>
<input type="text" name="perimetre" value="">
<div>dateDepart</div>
 <input type="date" name="dateDepart" value="">

<div>heureDepart</div>

   <select name="heureDepart" required>
   <#list 0..23 as i>
     <#if i < 10 >
   	   <option value="0${i}">0${i}</option>
   	 <#else>
   	   <option value="${i}">${i}</option>
   	 </#if>
   </#list>
   </select> 
   
   <select name="minuteDepart" required>
   <#list 0..11 as i>
     <#assign c = i*5>
   	 <#if c < 10 >
   	   <option value="0${c}">0${c}</option>
   	 <#else>
   	   <option value="${c}">${c}</option>
   	 </#if>
   </#list>
   </select>      
            
   
    
   
   