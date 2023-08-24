# DIO - Trilha Java Básico - Desafio ContaBanco

[Link para DIO](https://www.dio.me)

## Autores

- [Juan Lucca](https://github.com/JuanLucca846)

## Passos do Desafio:

1. **Criação do Projeto**: Crie um projeto chamado `ContaBanco`.

2. **Classe `ContaTerminal`**: Dentro do projeto, crie a classe `ContaTerminal.java` para codificar o programa.

3. **Atributos da Conta**:

   - Número: Um número inteiro para identificar a conta.
   - Agência: Uma string para identificar a agência no formato "XXX-Y".
   - Nome do Cliente: Uma string com o nome do cliente.
   - Saldo: Um valor decimal representando o saldo da conta.

4. **Entrada de Dados via Terminal**:

   - O programa solicita ao usuário que insira os detalhes da conta, um por um, exibindo mensagens claras para cada campo. Por exemplo:
     - Programa: "Por favor, digite o numero da conta!"
     - Usuário: 1021 _(depois ENTER para o próximo campo)_

5. **Saída Formatada**:
   - Após inserir todas as informações, o programa exibe uma mensagem formatada, substituindo os campos `[Nome Cliente]`, `[Agencia]`, `[Numero]` e `[Saldo]` pelas informações inseridas pelo usuário.
   - A mensagem de saída deve ter o formato: "Ola [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agencia e [Agencia], conta [Numero] e seu saldo [Saldo] ja esta disponivel para saque."
   - Ex: "Ola Juan, obrigado por criar uma conta em nosso banco, sua agencia e 041-4, conta 1234 e seu saldo 1000.0 ja esta disponivel para saque."

## Tecnologias

- ![VSCode](https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)
- ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
