# 🚧 EM CONSTRUÇÃO

# API Clínica Médica - Projeto de Estudo

Este repositório contém o desenvolvimento de uma API backend para um aplicativo de gerenciamento de uma clínica médica. O projeto é parte de meus estudos e visa consolidar conhecimentos em **Java**, **Spring Boot** e outras tecnologias relacionadas.

---

## 🚀 Funcionalidades Implementadas

- **Cadastro, listagem, atualização e exclusão de médicos.**
- **Cadastro, listagem, atualização e exclusão de pacientes.**
- **Agendamento de consultas.**
- **Cancelamento de consultas.**

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Maven**: Gerenciamento de dependências.
- **Spring Boot**: Desenvolvimento rápido de aplicações Java.
    - **Spring Web**: Para criação de endpoints RESTful.
    - **Spring Security**: Para implementação de segurança.
- **Lombok**: Redução de boilerplate no código.
- **MySQL**: Banco de dados relacional.
- **Flyway**: Gerenciamento de versões do banco de dados.
- **JWT (auth0)**: Para autenticação e validação de tokens.

---

## 📂 Estrutura do Projeto

A estrutura do projeto foi organizada para seguir boas práticas de desenvolvimento em Java. Abaixo, uma visão geral dos pacotes principais:

- **configs**: Configurações gerais da aplicação.
- **controller**: Controladores responsáveis pelos endpoints da API (médico, paciente, consulta, autenticação).
- **domain**: Contém as entidades principais, como `Medico`, `Paciente`, `Consulta`, e suas respectivas validações.
- **infra**: Configurações de infraestrutura, como segurança e tratamento de erros.
- **repository**: Interfaces para comunicação com o banco de dados.
- **service**: Lógica de negócio da aplicação.

---

## 🔒 Autenticação

A API utiliza autenticação baseada em **JWT (JSON Web Tokens)**. Apenas usuários autenticados conseguem acessar os endpoints protegidos. Para validar os tokens, foi utilizada a biblioteca **auth0** integrada ao Spring Security.

---

## 🎯 Próximos Passos

- Finalizar a implementação das funcionalidades de agendamento e cancelamento de consultas.
- Testes automatizados para os endpoints.
- Melhorias na documentação da API (com ferramentas como Swagger).
- Adicionar logs para rastreabilidade.

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos

- **Java 17** ou superior.
- **Maven** instalado.
- Um banco de dados **MySQL** configurado.

### Passos

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/api-clinica-medica.git
   
2. Acesse a pasta do projeto:
   ```bash
   cd api-clinica-medica
3. Configure o banco de dados no arquivo application.properties (src/main/resources):
   ```properties
    spring.datasource.url=jdbc:mysql://localhost/nome_do_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
4. Execute as migrações do banco de dados com o Flyway.
5. Compile e execute o projeto:
    ```bash
   mvn spring-boot:run
   ```
6. Testando a API: Utilize um programa de sua preferência, como Postman ou Insomnia, para realizar os testes nos endpoints:

Para login:

    URL: http://localhost:8080/login
    Método: POST

 ```json
    {
    "login": "login realizado no banco ",
    "senha": "senha cadastrada no banco"
    }
 ```
Para pacientes:

    URL: http://localhost:8080/pacientes
    Métodos disponíveis:
    POST - Cadastro de pacientes.
    GET - Listagem de pacientes.
    GET - Detalhar registro de um paciente (com ID http://localhost:8080/pacientes/{id}).
    PUT - Atualizar cadastro de paciente.
    DELETE - Excluir paciente.
Para médicos:

    URL: http://localhost:8080/medicos
    Métodos disponíveis:
    POST - Cadastro de médicos.
    GET - Listagem de médicos.
    GET - Detalhar registro de um médico (com ID http://localhost:8080/medicos/{id}).
    PUT - Atualizar cadastro de médico.
    DELETE - Excluir médico.
Para consultas:

    URL: http://localhost:8080/consultas (Em implementação)

## 📜 Licença
Este projeto é apenas para fins educacionais e não possui uma licença específica.

