# spring-cloud-gatway-oauth
Using SPGW as the entry point of authentication under OAuth2.0


## Run on Localhost

To be able to run the project on localhost, make sure you've followed the next steps.

### Backend alias
#### if windows, go to => C:\Windows\System32\drivers\etc

The following lines must be added in ```/etc/hosts``` to avoid having the browser create the cookies for the same
URL overriding values from the different backends.
```
127.0.0.1       auth-keycloak
127.0.0.1       service-gateway
127.0.0.1       user-service
```

### Keycloak and DB
```docker
docker-compose up
```