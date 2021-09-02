FROM java:8

MAINTAINER muxiao@histomed.com

ADD ./target/*.jar ./consumer.jar

ENV JAVA_OPTS="\
-Dserver.port=18081"

EXPOSE 18081
ENTRYPOINT java ${JAVA_OPTS} -jar consumer.jar