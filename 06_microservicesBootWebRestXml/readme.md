http://localhost:8080/06_microservicesBootWebRestXml/hi1
http://localhost:8080/06_microservicesBootWebRestXml/hi2

Accept: application/json

{
  "name": "Peanuts",
  "location": "California",
  "mascotte": null,
  "players": [
    {
      "name": "Snoopy",
      "position": "shortstop"
    },
    {
      "name": "Charlie Brown",
      "position": "pitcher"
    }
  ]
}

Accept: application/xml

<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<team>
	<location>California</location>
	<name>Peanuts</name>
	<players>
		<name>Snoopy</name>
		<position>shortstop</position>
	</players>
	<players>
		<name>Charlie Brown</name>
		<position>pitcher</position>
	</players>
</team>
