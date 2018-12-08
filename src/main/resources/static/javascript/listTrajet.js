(function($){
	console.log('test');

/**********************************************\
		Constantes
\**********************************************/

	const  resizeHeight = 260;
	const path ='${detailPath}';

/**********************************************\
		variables
\**********************************************/

	var li = document.querySelectorAll('.list-content');
	var btn_detail = document.querySelectorAll('.file-detail');
	var listuser = document.querySelector('.listuser');
	var containerMap = document.querySelector('.container-map');
	
	
	
	var offsetHeight = listuser.offsetHeight;
	var offsetHeightContainerMap = containerMap.offsetHeight;

	var bntTrajet = document.querySelector('.trajet-match');
	var claque = document.querySelector('.claque');
	



/**********************************************\
		method resize
\**********************************************/

	function resizeListUser(listuser,resultContain){

		console.log("function resizeHeight");

		if(resultContain){
			offsetHeight = offsetHeight + resizeHeight;
			offsetHeightContainerMap = offsetHeightContainerMap + 90;
			
			listuser.style.height = offsetHeight+'px' ;
			containerMap.style.height = offsetHeightContainerMap+'px' ;
			
			
		}else{
			offsetHeight = offsetHeight - resizeHeight;
			offsetHeightContainerMap = offsetHeightContainerMap - 90;
			
			listuser.style.height = offsetHeight+'px' ;
			containerMap.style.height = offsetHeightContainerMap+'px' ;
		}
	}

/**********************************************\
		method calcNbli
\**********************************************/

	function calcNbli(){
		console.log('calcNbli');
		if(li.length>1){
			offsetHeight = li.length*150;
			listuser.style.height = offsetHeight+'px' ;
		}	
	}	

	calcNbli();  //lancement au looder de la page

/**********************************************\
		Event Click
\**********************************************/
	
	for(var i=0;i< li.length;i++){

		btn_detail[i].addEventListener('click',function(e){
			e.preventDefault();
			console.log("event click");
			console.log(this);

			var parentLi = this.parentNode.parentNode;
			console.log(parentLi);

			if(parentLi.classList.contains('hidden-detail')){
				parentLi.classList.remove('hidden-detail');
				resizeListUser(listuser,false);
			}else{
				parentLi.classList.add('hidden-detail');
				resizeListUser(listuser,true);
			}
		});
	}

/**********************************************\
		Event Click modified
\**********************************************/
	
	$('.btn-modified').click(function(e){
		e.preventDefault();
		console.log('clicker btn-modified');
			
		if($('#claque').hasClass('fadein')){
			setTimeout(function(){
					$('#claque').removeClass('fadein');		 
			},1000);
		}else{
			$('#claque').addClass('fadein');
		}
		getInfosProfil(this);	
	})

function changeActionForm(){
		
		console.log("read new action form");
		
		//var clientAction = document.querySelector('#f-client');	
		var recup_path = $('#f-client').attr('action');

		recup_path.replace('edit','${detailPath}');
		console.log("recup_path0"+recup_path);
		
		console.log(recup_path);

		$('#f-client').attr('action',recup_path);
		console.log($('#f-client').attr('action'));
	}
	
	changeActionForm();



/**********************************************\
		Event Click close
\**********************************************/
	
	$('.btn-close').click(function(e){
		e.preventDefault();
		console.log('clicker claque');
			
		if($('#claque').hasClass('fadein')){
					$('#claque').removeClass('fadein');		 
		}else{
			$('#claque').addClass('fadein');
		}	
	})

})(jQuery);
