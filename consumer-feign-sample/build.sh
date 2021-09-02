docker rmi consumer-feign:${1}
docker build -f ./Dockerfile -t consumer-feign:${1} .
