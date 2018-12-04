<#import "/spring.ftl" as spring/>
<title>MatchMoove</title>
<#include "/utils/head.ftl"/>

<body data-spy="scroll" data-target=".navbar" data-offset="60">

 	<#include "/utils/header.ftl"/>
	<#include "/utils/menus/menuadmin.ftl"/>    
	
	
	  <!--////////////////////////////////////////////////////-->
      <!--           liste user		                          -->
      <!--////////////////////////////////////////////////////-->
	
	
	
	<#include "/viewlistuser/editlistuser.ftl"/> 
	
	  <!--////////////////////////////////////////////////////-->
      <!--            end		                          -->
      <!--////////////////////////////////////////////////////-->	
	
	
		
 	<#include "/utils/foot.ftl"/>
 	<#include "/utils/footer.ftl"/>
 	 <script type="text/javascript" src="<@spring.url  '/js/listeUsers.js'/>"></script>
	