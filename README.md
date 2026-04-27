☕ Workshop Spring Boot + MongoDB

Este projeto consiste no desenvolvimento de uma API REST utilizando Spring Boot integrado ao MongoDB, construído como parte do curso Java COMPLETO - Programação Orientada a Objetos + Projetos, ministrado pelo professor Nélio Alves na Udemy.

O foco do projeto é aplicar conceitos modernos de desenvolvimento backend, como criação de APIs RESTful, uso de banco de dados NoSQL e organização em camadas.

🚀 Funcionalidades
CRUD completo de usuários
CRUD de posts
Associação entre usuários e posts
Comentários em posts
Busca por texto e intervalo de datas
Tratamento de exceções personalizadas
Retorno padronizado de erros (HTTP)
🧠 Conceitos Aplicados

Este projeto explora na prática:

Arquitetura em camadas (Controller, Service, Repository)
API REST com Spring Boot
Integração com MongoDB
DTO (Data Transfer Object)
Tratamento de exceções
Injeção de dependência
Boas práticas de desenvolvimento backend
📂 Estrutura do Projeto
src/main/java
└── com.sauloseena.workshopmongo
    ├── config
    │   └── Instantiation.java
    │
    ├── domain
    │   ├── User.java
    │   └── Post.java
    │
    ├── dto
    │   ├── UserDTO.java
    │   ├── AuthorDTO.java
    │   └── CommentDTO.java
    │
    ├── repository
    │   ├── UserRepository.java
    │   └── PostRepository.java
    │
    ├── resources
    │   ├── UserResource.java
    │   └── PostResource.java
    │
    ├── resources.exception
    │   ├── ResourceExceptionHandler.java
    │   └── StandardError.java
    │
    ├── resources.util
    │   └── URL.java
    │
    ├── services
    │   ├── UserService.java
    │   └── PostService.java
    │
    └── services.exception
        └── ObjectNotFoundException.java

🌐 Endpoints Principais

👤 Usuários
GET /users → Lista todos os usuários
GET /users/{id} → Busca usuário por ID
POST /users → Cria um usuário
PUT /users/{id} → Atualiza usuário
DELETE /users/{id} → Remove usuário

📝 Posts
GET /posts/{id} → Busca post por ID
GET /posts/titlesearch?text=... → Busca por título
GET /posts/fullsearch?text=...&minDate=...&maxDate=... → Busca avançada

🛠️ Tecnologias Utilizadas
Java
Spring Boot
Spring Data MongoDB
MongoDB
Maven

📚 Créditos

Projeto desenvolvido com base no curso do professor Nélio Alves, disponível na Udemy.

📈 Objetivo Pessoal

Este projeto faz parte da minha evolução como desenvolvedor backend, com foco em tecnologias amplamente utilizadas no mercado, como Spring Boot e bancos NoSQL, buscando construir APIs robustas, escaláveis e bem estruturadas.
