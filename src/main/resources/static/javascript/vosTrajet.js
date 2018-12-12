(function($){

	console.log("test vos trajet");

/**********************************************\
	variables
\**********************************************/	

	var voirMessage = document.querySelectorAll('.voirMess');
	var delMess = document.querySelector('.deleteMessage')

/**********************************************\
		Event Click "voir mess"    ok  xhr
\**********************************************/
	
	for(var i = 0 ; i< voirMessage.length;i++ ){
		
		voirMessage[i].addEventListener('click',function(e){
			e.preventDefault();
			e.stopPropagation();
			console.log(this);
				
			if($('#claque').hasClass('fadein')){
				setTimeout(function(){
						$('#claque').removeClass('fadein');		 
				},1000);
			}else{
				$('#claque').addClass('fadein');
			}
			console.log(' 1 event btn voir mess request');
			var id_trajet = this.parentNode.querySelector('input').value;
			var secu = this.parentNode.querySelector('#secu').value;
				initXhrPost('POST','/user/trajets/vosmessage',true);
				insertFormdataAppend(id_trajet,secu);
				
		});	
	}
	
	/*$('.btn-seen-mess').click(function(e){
		e.preventDefault();
		e.stopPropagation();
	
			
		if($('#claque').hasClass('fadein')){
			setTimeout(function(){
					$('#claque').removeClass('fadein');		 
			},1000);
		}else{
			$('#claque').addClass('fadein');
		}


		console.log(' 1 event btn voir mess request');
			//initXhrPost('GET','/user/deleteMessTrajet/'+idmess,true);
			initXhrPost('GET','/user/trajets/vosmessage',true);
			insertFormdataAppend(this);
					
			
	})*/
/**********************************************\
		Event Click message delete id  xhr
\**********************************************/



$('.deleteMess').click(function(e){
		e.preventDefault();
		e.stopPropagation();
		console.log(' 2 clicker delete message trajet en request');
		
		console.log('');

			//initXhrPost('GET','/user/deleteMessTrajet/'+idmess,true);
			//initXhr('GET','/user/delmessage',true);
			//insertFormdataAppend();
				//xhr.send();		
	})

/**********************************************\
	Request
\**********************************************/	
	
	var xhr = new XMLHttpRequest();


/**********************************************\
		Event Click close message
\**********************************************/
	
	$('.btn-close').click(function(e){
		e.preventDefault();
		console.log('clicker claque');
			
		if($('#claque').hasClass('fadein')){
					$('#claque').removeClass('fadein');	
					var contenu = document.querySelector('#claque #contenu').innerHTML = "";
		}else{
			$('#claque').addClass('fadein');
		}	
	})
/**************************************\
	2..function initXhrPost()
\**************************************/
	var initXhrPost = function(method,action,type){
		/*******************lié xhr à url httrequest*/
		xhr.open(method,action,type);
	}

	
/*****************************************\
	0.0.1 function insertFormdataAppend
\*****************************************/
	var insertFormdataAppend = function(id_trajet,secu){
		
		console.log('insert form data');
	
		var formdat = new FormData();
		

		//ici je  recupere id message 
		//and recupere  id trajet

			formdat.append('id',id_trajet);
			formdat.append('_csrf',secu);
			xhr.setRequestHeader("_csrf", secu);
		
			console.log(formdat);
			
			//readKeyValueFormData(formdat);
			XrhSendForm(formdat);	
		}	
/**************************************\
	3.2.function XrhSendFormPOST()
\**************************************/
	var XrhSendForm = function(formdat){
				
				xhr.send(formdat);		
	}
/**************************************\
	4..event readystatechange on xhr
\**************************************/
	xhr.addEventListener('readystatechange',function(e){

		console.log('event readystatechange');
		//debugger;

		console.log('status : '+this.status);
		console.log('readyState : '+this.readyState);
		
		//verication requete reussi
		if(this.status === 200 ){
			console.log('requete validate');

			if(this.readyState === 4){
				console.log('full data recept');
				console.log(this.readyState);
				
				//insert dans le dom si message envoyer
				
				alert('message a bien été recu');
				insertDomHTML(this);

			}
		}
	});	
	
/**************************************\
	5.1..insertDomHTML html message
\**************************************/
	var insertDomHTML = function (this_xhr){
		
		console.log("insert dom manuel");
		var contenu = document.querySelector('#claque #contenu');
		
		var url = this_xhr.responseURL;	
		console.log(url);

		//recupation file + son contenu possedant parameter nom
		//insert dans le dom

		//deleteNoeud();
		contenu.innerHTML = url + this_xhr.responseText; //serveur renvoie page php
		//contenu.appendChild(url + this_xhr.responseText);
		
	}

})(jQuery)