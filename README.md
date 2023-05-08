# test rest api docker

<p><h4>1- Construir el proyecto</h4></p>
    <p>mvn clean package -Dmaven.test.skip=true -P gclp </p>
<p><h4>2- Crear imagen docker</h4></p>
  <p>docker build -t restapidocker .</p>
<p><h4>3- Correr imagen</h4></p>
  <p> sudo docker run --name springboot-rest1 --link postgres-rest:postgres-rest   -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" restapidocker</p>
