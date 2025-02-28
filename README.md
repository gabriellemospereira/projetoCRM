# 📌 Projeto CRM - Curso de Java (Nélio Alves/Udemy)

## 📖 Sobre o Projeto
Este é um projeto desenvolvido durante o curso de **Java** ministrado por **Nélio Alves** na Udemy. O objetivo é criar um **sistema CRM (Customer Relationship Management)** para gerenciamento de produtos em estoque, aplicando conceitos de **POO, banco de dados e boas práticas de desenvolvimento**.

## 🚀 Tecnologias Utilizadas
- **Java** 🟡
- **Spring Boot** 🌱
- **PostgreSQL/MySQL** 🗄️
- **JPA/Hibernate** 🏛️
- **REST API** 🌐
- **Maven** 📦
- **Swagger (Documentação da API)** 📜
- **Postman (Testes da API)** 🛠️

## ⚙️ Funcionalidades Implementadas
✅ Cadastro, listagem, atualização e remoção de produtos 🛒
✅ Controle de estoque 📦
✅ Persistência de dados com JPA/Hibernate 💾
✅ Consumo de API REST 📡
✅ Validações e tratamento de exceções ⚠️
✅ Boas práticas e organização do código 🏆

## 📂 Estrutura do Projeto
```
projetoCRM/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.projeto.crm/  # Pacotes principais
│   │   │   │   ├── controllers/  # Controladores REST
│   │   │   │   ├── entities/      # Modelos de dados
│   │   │   │   ├── repositories/  # Repositórios JPA
│   │   │   │   ├── services/      # Regras de negócio
│   │   │   ├── ProjetoCrmApplication.java  # Classe principal
│   │   ├── resources/
│   │   │   ├── application.properties  # Configurações
├── pom.xml  # Dependências Maven
```

## 🔧 Como Executar o Projeto
1️⃣ **Clone o repositório**:
```sh
git clone https://github.com/gabriellemospereira/projetoCRM.git
cd projetoCRM
```
2️⃣ **Configure o banco de dados** no arquivo `application.properties`
3️⃣ **Execute o projeto** usando o Maven ou no Spring Boot:
```sh
mvn spring-boot:run
```

## 📝 Contato
📧 **E-mail:** gabriellemospereira@gmail.com  
🔗 **GitHub:** [gabriellemospereira](https://github.com/gabriellemospereira)  

🚀 *Projeto desenvolvido para aprendizado e prática de Java e Spring Boot!*
