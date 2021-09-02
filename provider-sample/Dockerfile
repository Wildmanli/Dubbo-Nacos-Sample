FROM java:8

MAINTAINER muxiao@histomed.com

ADD ./target/*.jar ./provider.jar

ENV JAVA_OPTS="\
-Dserver.port=18080"

EXPOSE 18080
ENTRYPOINT java ${JAVA_OPTS} -jar provider.jar