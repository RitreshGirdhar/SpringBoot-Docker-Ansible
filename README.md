# SpringBoot-Docker-Ansible

```$xslt
cd microservice1
mvn build
```

Once packaging is done. Please check the docker images 

```$xslt
docker image list
```

you will find below image 
```$xslt
sample-microservices/ms1              latest              b0d54cc0d358        3 minutes ago        151MB
```

we will try to copy and run this image on server via ansible script.

