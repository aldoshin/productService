# productService https://www.javacodegeeks.com/2018/11/spring-microservices-docker-kubernetes.html

# Getting Started

### Docker postgeSQL container 

```docker run -d -p 5432:5432 --name my-postgres -e POSTGRES_PASSWORD=mysecretpassword postgres```

### Access the bash in postgresql  and create data base

```docker exec -it my-postgres bash```
```CREATE DATABASE mytestdb;```


# For Order service https://www.javacodegeeks.com/2018/11/spring-microservices-docker-kubernetes-2.html


```
docker exec -it my-postgres bash
root@e9e4447b9813:/# psql -U postgres
psql (12.0 (Debian 12.0-2.pgdg100+1))
Type "help" for help.

postgres=# CREATE DATABASE orders_db;
CREATE DATABASE
postgres=# GRANT ALL PRIVILEGES ON DATABASE orders_db TO postgres;
GRANT
postgres=#
```
