FROM openjdk:8


ADD build/libs/jalgoarena-eureka-*.jar /opt/jalgoarena-eureka/jalgoarena-eureka.jar

EXPOSE 5000

ENTRYPOINT java -Dserver.port=5000 -jar /opt/jalgoarena-eureka/jalgoarena-eureka.jar