# productService

# Getting Started

### Docker postgeSQL container 

```docker run -d -p 5432:5432 --name my-postgres -e POSTGRES_PASSWORD=mysecretpassword postgres```

### Access the bash in postgresql  and create data base

```docker exec -it my-postgres bash```
```CREATE DATABASE mytestdb;```
