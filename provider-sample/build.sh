docker rmi provider:${1}
docker build -f ./Dockerfile -t provider:${1} .
