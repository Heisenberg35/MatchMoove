<#import "/spring.ftl" as spring/>


<link rel="stylesheet" type="text/css" href="<@spring.url '/css/formCreateCompte.css'/>"/>

<h1> vue create user</h1>


    <form class="text-center border border-light" action="${detailPath}" method="POST">

   <!--////////////////////////////////////////////////////-->
   <!--             Gestion id hiden                        -->
   <!--////////////////////////////////////////////////////-->

    <#if item??>
            <div>Id</div>
            <#if item.getId()??>
            <div>${item.getId()}</div>
            <input type="hidden" name="id" value="${item.getId()}">
            <#else>
            <div>NA</div>
        </#if>
    </#if>

   <!--////////////////////////////////////////////////////-->
   <!--             group email , login                  -->
   <!--////////////////////////////////////////////////////-->
    
    <div class="form-group compte">
        
        <div>Adresse E-mail</div>
        <input type="email" name="email" value="<#if item?? && item.getEmail()??>${item.getEmail()}</#if>" required>
   
        <div>Mot de passe</div>
        <input type="password" name="password" value="<#if item?? && item.getPassword()??>${item.getPassword()}</#if>" required>

    </div>

    <!--////////////////////////////////////////////////////-->
   <!--     group validate     importan csrf sinon function pas -->
   <!--////////////////////////////////////////////////////-->

    <div class="group-form formvalidate">
     
     <input type="hidden"
            name="${_csrf.parameterName}"
            value="${_csrf.token}"/>
         <input type="submit" value="Save"></div>
    </div>
    
    <div class="error">
    	<#if isExistMail??>
	    	<#if isExistMail == true>
	    		<p> l'adresse mail existe </p>
	    	</#if>
    	</#if>
    	<#if form??>
	    	<#list form?keys as key> 
	   			<p>	${key}  = ${form[key]} </p>
	   				  
			</#list> 	
    	</#if>
    	
    </div>
     
</form> 

 