
Test if `deployments/config/application.properties` can be used to override default datasouirce properties 

Run db

    docker run --ulimit memlock=-1:-1 -it --rm=true --memory-swappiness=0 \
           --name postgres-quarkus-hibernate -e POSTGRES_USER=hibernate \
           -e POSTGRES_PASSWORD=hibernate -e POSTGRES_DB=hibernate_db \
           -p 5432:5432 postgres:10.5
           
build and run with docker

    mvn clean package && docker build -t qpap .
    docker run --rm -ti -p 8080:8080 --name qpap qpap 



To have the default datasource properties in the override file only yields build time error

    javax.enterprise.inject.UnsatisfiedResolutionException: Unsatisfied dependency for type javax.persistence.EntityManager and qualifiers [@Default]

At runtime the settings get overrided as one would expect

E.g override:

    quarkus.datasource.jdbc.url = jdbc:postgresql://localhost:5432/hibernate_db

with (replace localhost with host interface inside docker container)

    quarkus.datasource.jdbc.url = jdbc:postgresql://172.17.0.1:5432/hibernate_db
