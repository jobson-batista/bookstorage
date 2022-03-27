# Bookstorage Manager API ![enter image description here](https://img.shields.io/badge/version-1.0.0-yellowgreen)
### API RESTful para gerenciar uma livraria virtual.

### ✅ Status do Projeto
<h4 align="center"> 🚧 Em desenvolvimento ... 🚧 </h4>

### ✅ Requisitos para rodar o projeto
- [JDK 17](https://www.oracle.com/java/technologies/downloads/) 

### ✅ Features

-  Documentação da API usando o Swagger

### ✅ DEMO

- Executar `./mvnw spring-boot:run` na raiz do projeto.

### ✅ Principais Endpoints

#### Gerenciamento de Autores

|*Operação*|*HTTP Method*| *URI*|
|--|--|--|
| Criar um novo autor | POST | /api/v1/authors
| Listar todos autores | GET | /api/v1/authors
| Buscar autor por nome | GET | /api/v1/authors/{name} 
| Excluir autor por Id | DELETE | /api/v1/authors/{id}

#### Gerenciamento de Editoras

|*Operação*|*HTTP Method*| *URI*|
|--|--|--|
| Criar uma nova editora | POST | /api/v1/publishers
| Listar todas editoras | GET | /api/v1/publishers
| Buscar editora por Id | GET | /api/v1/publishers/{id} 
| Excluir autor por Id | DELETE | /api/v1/publishers/{id}

#### Gerenciamento de Usuários

|*Operação*|*HTTP Method*| *URI*|
|--|--|--|
| Criar um novo usuário | POST | /api/v1/users
| Criar token de autorização | POST | /authenticate
| Atualizar usuário por Id | PUT | /api/v1/users/{id} 
| Excluir usuário por Id | DELETE | /api/v1/users/{id}

#### Gerenciamento de Livros

|*Operação*|*HTTP Method*| *URI*|
|--|--|--|
| Criar um novo livro | POST | /api/v1/books
| Listar todos os livros | GET | /api/v1/books
| Buscar livros por Id | GET | /api/v1/books{id} 
| Atualizar usuário por Id | PUT | /api/v1/books/{id}
| Excluir livro por Id | DELETE | /api/v1/books/{id}
