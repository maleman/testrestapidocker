# testrestapidocker

1- Construir el proyecto
    mvn clean package -P gclp
2- Crear imagen docker
  docker build -t resapidocker .
3- Correr imagen
  docker run -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" resapidocker
