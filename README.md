# test rest api docker

<p><h4>1- Construir el proyecto</h4></p>
    <p>mvn clean package -P gclp </p>
<p><h4>2- Crear imagen docker</h4></p>
  <p>docker build -t restapidocker .</p>
<p><h4>3- Correr imagen</h4></p>
  <p>docker run -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" restapidocker</p>
