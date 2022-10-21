# Taller1-AYGO

This workshop was carried out with the purpose of making an introduction of virtualization and distributed programming.

## Context Diagram
<img src="https://lucid.app/publicSegments/view/7c67494f-0ca4-4345-a8be-523042ec4f8f/image.png">

Log-service is in charge of receiving a string and then storage it in a mongo data base, also will return the last 10 strings storaged in the data base with the creation date. On the other hand the App-lb-round-service is in charge of displaying a form to the user with one field called contentString where the user should type a text and after should press submit. Once the button has been pressed the service will run the round robin algorith to determine which Log-service the request is going through. Finally the last 10 strings storaged will be showed to the user in a Json format. Each service will have its own image in a dokcer Hub and the services will be in a docker container in a EC2 virtual machine and can be accessed with the public aws url. The containers will be created with a docker-compose file.

## Entry Points

### **Log-service**

| Method | Path               | Description          | Parameters                          |
|--------|--------------------|----------------------|-------------------------------------|
| POST   | /string            | This endpoint storages a string in a mongo database and returns the last 10 strings storaged | UserDataDto: Request body with only 1 parameter (stringContent)|

### **App-lb-round-robin**

| Method | Path               | Description          | Parameters                          |
|--------|--------------------|----------------------|-------------------------------------|
| GET   | /web-service            | This endpoint returns the form to be showed to the user | |
| POST   | /web-service            | This endpoint storages a string in a mongo database and returns the last 10 strings storaged through one of the Log-service instances| WebServiceRequestDto: Request body with only 1 parameter (stringContent)|

## Technology Stack

- ![Java_version](https://img.shields.io/badge/Java-17-lightgrey)
- ![Spring_Boot](https://img.shields.io/badge/SpringBoot-2.7.4-green)
- ![Spring_Boot](https://img.shields.io/badge/Mongo-4.0.8-green)
- ![Spring_Boot](https://img.shields.io/badge/Docker-20.10.17-blue)

