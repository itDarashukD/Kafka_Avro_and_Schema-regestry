1. mvn clean install to create the Event model
2. run all docker containers by "docker-compose up -d --build"
3. wait for docker containers runs, and Schema-registry also runs (about 7 minutes)
4. open the Confluent Control-center http://192.168.99.111:9021/
5. make sure that Brocker is working
6. run this microservice
7. send Event by Postman

