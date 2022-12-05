# springboot-websocket-rabbitmq-Demo

# RabbitMQ
- http://localhost:15672/#/
	- Username: guest <br>
	- Password: guest
- POST http://localhost:9090/api/v1/product/publish

# WebSocket
- WS URL: ws://localhost:9090/user
- App URL: http://localhost:9090/

# Docker Commands:
- docker --version
- docker pull rabbitmq:3-management
- docker images
- docker run -d -p 15672:15672 -p 5672:5672 --name rabbit-test-for-medium rabbitmq:3-management
- docker ps
- docker stop <containerId>
- docker start <containerId>

# References:
- https://www.javaguides.net/2022/07/spring-boot-rabbitmq-producer-and-consumer-example.html
- https://medium.com/@rameez.s.shaikh/build-a-chat-application-using-spring-boot-websocket-rabbitmq-2b82c142f85a

- https://code.imaginesoftware.it/rabbitmq-with-docker-on-windows-in-30-minutes-172e88bb0808

Websocket Client for Java:
- https://stackoverflow.com/questions/21194294/java-websocket-client-without-a-browser
- https://www.baeldung.com/websockets-api-java-spring-client
- https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-client/src/main

Distributed RabbitMQ:
- https://www.rabbitmq.com/distributed.html

Redis cluster:
- https://redis.io/docs/management/scaling/#:~:text=Redis%20Cluster%20provides%20a%20way,or%20are%20unable%20to%20communicate.
- https://www.youtube.com/watch?v=GEg7s3i6Jak

Docker to run multiple instances:
