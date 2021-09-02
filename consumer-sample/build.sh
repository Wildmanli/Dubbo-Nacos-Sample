docker rmi registry.cn-shanghai.aliyuncs.com/histomed/test:${1}
docker build -t registry.cn-shanghai.aliyuncs.com/histomed/test:${1} .
docker login --username=docker@histomed registry.cn-shanghai.aliyuncs.com
docker push registry.cn-shanghai.aliyuncs.com/histomed/test:${1}