# test rest api docker

<p><h4>1- Construir el proyecto</h4></p>
    <p>mvn clean package -Dmaven.test.skip=true -P gclp </p>
<p><h4>2- Crear imagen docker</h4></p>
  <p>sudo docker build -t restapidocker .</p>
<p><h4>3- Correr imagenes</h4></p>
<ul>
    <li>
        <p>sudo docker run -d --memory=1g --cpus=1 --name postgres-rest -e POSTGRES_PASSWORD=-123456. -e POSTGRES_USER=postgres -p 5433:5432  -v pgdata:/var/lib/postgresql/data postgres</p>
    </li>
    <li>
        <p>sudo docker run -d --memory=512m --cpus="0.5" --name springboot-rest1 --link postgres-rest:postgres-rest   -p 8080:8080 -e "JAVA_OPTS=-Ddebug -Xmx128m" restapidocker</p>
    </li>
</ul> 
