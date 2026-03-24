API de Gerenciamento de Projetos

Aplicação Spring Boot para controle de projetos com datas de início e término.

Tecnologias

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database

Estrutura do projeto

* models → entidades JPA
* repositories → acesso ao banco de dados
* services → regras de negócio
* controllers → endpoints REST

Endpoints

* POST /projetos
* GET /projetos
* GET /projetos/{id}
* PUT /projetos/{id}
* DELETE /projetos/{id}

Como testar

Os endpoints podem ser testados utilizando:

Postman
ou
Swagger: http://localhost:8080/swagger-ui/index.html
