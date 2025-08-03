FROM openjdk:17-jdk-slim

COPY target/spring-hibernate-h2-0.0.1-SNAPSHOT.jar spring-hibernate-h2.jar


#ENV JAVA_OPTS="-Djdbc_url=jdbc:oracle:thin:@host.minikube.internal:1521/orcl"
ENV SPRING_APP_PROPS=""
ENV MEM_OPTS=""
ENV GC_OPTS=""

ENTRYPOINT java -server $JAVA_OPTS $SPRING_APP_PROPS $MEM_OPTS $GC_OPTS -jar spring-hibernate-h2.jar