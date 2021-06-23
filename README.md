# Feature toggle service
Service provides REST endpoints for managing feature toggles.

### Local startup
To start service locally, DynamoDB should be running on the port 8000. (see https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DynamoDBLocal.html)
After that, to start service, execute:
```
 mvn spring-boot:run
```
### Endpoints

#### Create toggle
```
curl --location --request POST 'http://localhost:8081/feature-toggle/v1/stars.rating' \
--header 'Content-Type: application/json' \
--data-raw '{
"state": "OFF"
}'
```

#### Change state
```
curl --location --request PUT 'http://localhost:8081/feature-toggle/v1/stars.rating' \
--header 'Content-Type: application/json' \
--data-raw '{
    "state": "ON"
}'
```

### Get toggle
```
curl --location --request GET 'http://localhost:8081/feature-toggle/v1/stars.rating'
```

### Delete toggle
```
curl --location --request DELETE 'http://localhost:8081/feature-toggle/v1/stars.rating'
```

### List all toggles
```
curl --location --request GET 'http://localhost:8081/feature-toggle/v1/'
```
