FROM openjdk:17-jdk-slim

WORKDIR /usrapp/bin

ENV PORT 9191

COPY /target/classes /usrapp/bin/classes
COPY /target/dependency /usrapp/bin/dependency

CMD ["java","-cp","./classes:./dependency/*","com.app.AppLBRoundRobin.AppLbRoundRobinApplication"]