docker rmi consumer:${1}
docker build -f ./Dockerfile -t consumer:${1} .
