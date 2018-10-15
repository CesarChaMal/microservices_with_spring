GET
http://localhost:8080/09_microservicesBootWebSpringDataHateoas/teams/

{
  "_embedded" : {
    "teams" : [ {
      "name" : "Peanuts",
      "location" : "California",
      "mascotte" : null,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/09_microservicesBootWebSpringDataHateoas/teams/1"
        },
        "team" : {
          "href" : "http://localhost:8080/09_microservicesBootWebSpringDataHateoas/teams/1"
        },
        "players" : {
          "href" : "http://localhost:8080/09_microservicesBootWebSpringDataHateoas/teams/1/players"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/09_microservicesBootWebSpringDataHateoas/teams/"
    },
    "profile" : {
      "href" : "http://localhost:8080/09_microservicesBootWebSpringDataHateoas/profile/teams"
    },
    "search" : {
      "href" : "http://localhost:8080/09_microservicesBootWebSpringDataHateoas/teams/search"
    }
  }
}

