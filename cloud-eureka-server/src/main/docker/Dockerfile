FROM linux/jdk1.8:latest

VOLUME /tmp

ADD cloud-eureka-server-1.0.0.jar /cloud-eureka-server.jar

EXPOSE 8761

RUN bash -c 'touch /cloud-eureka-server.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-eureka-server.jar"]