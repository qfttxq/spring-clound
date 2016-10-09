FROM linux/jdk1.8:latest

VOLUME /tmp

ADD cloud-config-server-1.0.0.jar /cloud-config-server.jar

EXPOSE 8888

RUN bash -c 'touch /cloud-config-server.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cloud-config-server.jar"]