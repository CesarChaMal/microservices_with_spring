GET
http://localhost:8080/08_microservicesBootWebSpringDataRest/teams/

{
  "_embedded" : {
    "teams" : [ {
      "name" : "Peanuts",
      "location" : "California",
      "mascotte" : null,
      "players" : [ {
        "name" : "Charlie Brown",
        "position" : "pitcher"
      }, {
        "name" : "Snoopy",
        "position" : "shortstop"
      } ],
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/teams/1"
        },
        "team" : {
          "href" : "http://localhost:8080/teams/1"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/teams"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/teams"
    },
    "search" : {
      "href" : "http://localhost:8080/teams/search"
    }
  }
}

GET
http://localhost:8080/08_microservicesBootWebSpringDataRest/teams/1

{
  "name" : "Peanuts",
  "location" : "California",
  "mascotte" : null,
  "players" : [ {
    "name" : "Snoopy",
    "position" : "shortstop"
  }, {
    "name" : "Charlie Brown",
    "position" : "pitcher"
  } ],
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/teams/1"
    },
    "team" : {
      "href" : "http://localhost:8080/teams/1"
    }
  }
}


PUT
Accept: application/json
http://localhost:8080/08_microservicesBootWebSpringDataRest/teams/1

{
  "name" : "Peanuts",
  "location" : "California",
  "mascotte" : "Snoopy",
  "players" : [ {
    "name" : "Snoopy",
    "position" : "shortstop"
  }, {
    "name" : "Charlie Brown",
    "position" : "pitcher"
  }, {
    "name" : "Schroeder",
    "position" : "catcher"
  } ]
}


