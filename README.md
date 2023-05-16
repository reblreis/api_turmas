# API_Turmas - Documentação do Projeto
Este é o README do projeto API_Turmas, um aplicativo Spring Boot para gerenciar turmas de alunos.

## Bibliotecas Utilizadas
O projeto utiliza as seguintes bibliotecas:

Spring Web: biblioteca para criação de APIs RESTful no Spring.
Spring Boot DevTools: conjunto de ferramentas de desenvolvimento para agilizar o ciclo de desenvolvimento do Spring Boot.
PostgreSQL: driver JDBC para integração com o banco de dados PostgreSQL.
Lombok: biblioteca que automatiza a geração de código repetitivo, como getters, setters e construtores.
Endpoints
A API oferece os seguintes endpoints com as operações básicas (POST, PUT, DELETE e GET):

POST /api/turmas: cria uma nova turma.
PUT /api/turmas/{id}: atualiza os dados de uma turma existente.
DELETE /api/turmas/{id}: exclui uma turma pelo seu ID.
GET /api/turmas: obtém todas as turmas cadastradas.
GET /api/turmas/{id}: obtém os detalhes de uma turma pelo seu ID.
Documentação Swagger
A API possui uma documentação Swagger para facilitar o entendimento e teste dos endpoints. Acesse a documentação através do seguinte link: Documentação Swagger

## Detalhes da documentação:

Título: API para controle de turmas
Descrição: API Spring Boot com Spring Data para gerenciamento de turmas, alunos, professores e matrículas.
Versão: v1
Executando o Projeto
Para executar o projeto, siga as etapas abaixo:

Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
Faça o clone do repositório ou baixe o código-fonte.
Navegue até o diretório raiz do projeto.
Abra um terminal e execute o comando ./mvnw spring-boot:run para sistemas Unix, ou mvnw spring-boot:run para sistemas Windows.
Aguarde até que a aplicação seja iniciada. Você verá uma mensagem informando que a aplicação está sendo executada na porta 8082.
Testando a API com o Postman
Você pode utilizar o Postman para testar os endpoints da API seguindo a documentação do Swagger.

Abra o Postman.
Importe a coleção de requisições do Postman através do seguinte arquivo: API_Turmas_Postman_Collection.json
Após importar a coleção, você terá acesso a todas as requisições pré-configuradas.
Execute as requisições conforme necessário para interagir com a API.
Considerações Finais
Este é um exemplo básico de um projeto Spring Boot para gerenciar turmas de alunos. A documentação do Swagger e o uso do Postman facilitam o teste e a interação com a API. Sinta-se à vontade para modificar, estender e adaptar o projeto de acordo com suas necessidades.