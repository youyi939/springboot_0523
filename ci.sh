#!/bin/bash
git pull
mvn clean package
#docker-compose down
#docker-compose up -d

java -jar target/springboot_0523-0.0.1-SNAPSHOT.jar