curl --location 'localhost:9090/api/event/all'

curl --location --request PUT 'localhost:9090/api/event?id=1' \
--header 'Content-Type: application/json' \
--data '{
"title": "UFC",
"place": "Vegas",
"speaker": "Danna White",
"eventType": "Fight",
"dateEvent": "2023-09-15"
}'

curl --location 'localhost:9090/api/event' \
--header 'Content-Type: application/json' \
--data '{
"title": "UFC",
"place": "Vegas",
"speaker": "Danna White",
"eventType": "Fight",
"dateEvent": "2023-09-15"
}'