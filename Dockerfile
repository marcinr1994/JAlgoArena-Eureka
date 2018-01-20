FROM openjdk:8

WORKDIR /opt/jalgoarena-eureka
ADD build/libs/jalgoarena-eureka-1.0.4.jar /opt/jalgoarena-eureka

EXPOSE 5000

CMD java -Dserver.port=5000 -jar /opt/jalgoarena-eureka/jalgoarena-eureka-1.0.4.jar