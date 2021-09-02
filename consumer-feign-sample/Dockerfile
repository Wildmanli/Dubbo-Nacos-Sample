FROM java:8

MAINTAINER muxiao@histomed.com

ADD ./target/*.jar ./consumer-feign.jar

ENV JAVA_OPTS="\
-Dserver.port=18082"

EXPOSE 18082
ENTRYPOINT java ${JAVA_OPTS} -jar consumer-feign.jar