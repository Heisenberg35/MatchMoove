 
   /***************************************
      variables  globle at function
    *****************************************/

  var map;
  var service;

  var infowindow;
  //var listVille = document.querySelectorAll('.ville a');

  var directionsService;
  var directionsDisplay;

  
    /***************************************
      class Point
    *****************************************/

  class Point {
    contructor(){
        this.lag = lag;
        this.lng = lng;
    }
    setLag(lag){
      this.lag = lag;
    }
    setLng(lng){
      this.lng = lng;
    }

    getLag(){
      return this.lag;
    }

    getLng(){
      return this.lng;
    }
  }
  /***************************************
     init my map
  *****************************************/
  function initMap() {

    /***************************************
      variables 
    *****************************************/

    directionsService = new google.maps.DirectionsService();
    directionsDisplay = new google.maps.DirectionsRenderer();

        //var origine1 = {lat:48.108358,lng: -1.714054}
        var origine1 = new google.maps.LatLng(48.108358,-1.714054);
        var origine2 = new google.maps.LatLng(47.933880, -2.412280);

    //supponsant que nous les recuperions par back avc class point and adresse
    //du dom des informations insert dans tab asso 
    
      var villes = {
      "Brest":{"lat": 48.383,"lon": -4.500},
      "Quimper":{"lat": 48.000,"lon": -4.100},
      "saint brieux":{"lat": 48.513618,"lon": -2.770696}
    };

    /***************************************
      chargement map
    *****************************************/
       
         map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: 48.108815, lng: -1.715279},
          zoom: 8
        });




 /*******************************************
           create requete recherche lieu di
    *****************************************/

//requete de recherche

 var request = {
    query: 'carrefour vannes',
    fields: ['formatted_address', 'name', 'rating', 'opening_hours', 'geometry'],
  };


//creation du marker de calback
  function createMarker(result,nom){

    new google.maps.Marker({
          position: {lat: result.geometry.location.lat(), lng: result.geometry.location.lng()},
          map: map,
          title: 'nom'
          });
  }

      /***************************************
           init des Marker
      *****************************************/

          var marker1 = new google.maps.Marker({
          position: origine1,
          map: map,
          title: 'rennes'
          });

          var marker2 = new google.maps.Marker({
          position: origine2,
          map: map,
          title: 'ploermel!'
          });

 
   /***************************************
           parcours  tab de villes
   *****************************************/

  // Nous parcourons la liste des villes
  for(ville in villes){
    var marker = new google.maps.Marker({
      // A chaque boucle, la latitude et la longitude sont lues dans le tableau
      position: {lat: villes[ville].lat, lng: villes[ville].lon},
      // On en profite pour ajouter une info-bulle contenant le nom de la ville
      title: ville,
      map: map
    }); 
  }
  
/***************************************
          service trajet
*****************************************/

/***************************************
          end function api
*****************************************/
  
}





