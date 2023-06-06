# DockerKubernetesSpringBoot

crear ejecutable .jar saltandose los test
``` .\mvnw.cmd clean package -DskipTest ```

crear imagen en Docker
``` docker build -t cursos . -f .\msvc-cursos\Dockerfile ```

crear contenedor con Docker, puerto, variable .env, network, borrado automatico despues de stop y nombre de imagen
``` docker run -p 8002:8002 -d --env-file .\msvc-cursos\.env --name msvc-cursos --network spring --rm cursos ```
o ``` docker run -p 8002:8002 --name msvc-cursos -d --network spring cursos ```       

elimina contenedores detenidos
```docker kubernates prune ```

crear network Docker
``` docker network create spring ```

# docker-compose
ejecutar docker-compose dettach
``` docker-compose  up -d  ```

# DockerHub
DockerHub
```docker login ```

renombrar nombre imagen con el mismo nombre que se creo en dockerhub
```docker tag msvc-usuarios software1080/usuarios ```

subir cambios el contenedor en la nube
```docker push software1080/usuarios ```

# Amazon Linux 2 AMI EC2 install Docker and Docker compose

sudo yum update -y 

sudo amazon-linux-extras install docker 

sudo yum install docker 

sudo service docker start 

sudo curl -L https://github.com/docker/compose/releases/download/v2.18.1/docker-compose-linux-x86_64 -o /usr/local/bin/docker-compose

sudo chmod +x /usr/local/bin/docker-compose

docker-compose version

sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose
