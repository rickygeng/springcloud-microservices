FROM maven:3.6-jdk-8
WORKDIR	/usr/src/eurekaserver
#COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver.jar
COPY . .
# RUN mvn package -Dmaven.test.skip=true
EXPOSE 8761
EXPOSE 80 2222
# CMD ["java","-jar","target/eurekaserver-0.0.1-SNAPSHOT.jar"]
CMD ["mvn","spring-boot:run"]
