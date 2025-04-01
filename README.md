# AgendaJava

## 📌 Sobre o Projeto

**AgendaJava** é uma aplicação de gerenciamento de agenda desenvolvida em Java que permite o registro, edição e exclusão de compromissos e contatos. A aplicação possui uma interface gráfica intuitiva desenvolvida com JavaFX para facilitar o uso.

## 🚀 Tecnologias Utilizadas

- **Java** (versão 17 ou superior)
- **JavaFX** (Interface Gráfica)
- **MySQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências)

## 📂 Estrutura do Projeto

```
AgendaJava/
│
├── src/                 # Código fonte da aplicação
├── resources/           # Arquivos de configuração e assets
├── README.md            # Documentação do projeto
├── pom.xml              # Arquivo de configuração do Maven
└── Main.java            # Classe principal para execução da aplicação
```

## 📦 Instalação

1. **Clone o repositório:**
```bash
$ git clone https://github.com/4rthurdev/AgendaJava.git
$ cd AgendaJava
```

2. **Importe o projeto em sua IDE preferida (Eclipse, IntelliJ, NetBeans) como um projeto Maven.**

3. **Configure o banco de dados MySQL:**
- Crie um banco de dados chamado `agenda`.
- Configure as credenciais de acesso no arquivo de configuração do projeto.

4. **Compile e execute o projeto pela IDE ou via Maven:**
```bash
$ mvn clean install
$ mvn javafx:run
```

## 💻 Uso

1. **Inicie o aplicativo:**
- Execute a classe principal `Main.java` ou utilize o comando Maven `mvn javafx:run`.

2. **Acesse as funcionalidades da aplicação:**
- Adicionar, editar e excluir compromissos.
- Adicionar, editar e excluir contatos.
- Visualizar compromissos e contatos salvos.

## 📈 Funcionalidades

- Registrar, editar e excluir compromissos.
- Registrar, editar e excluir contatos.
- Consultar compromissos e contatos por data ou nome.
- Visualizar todos os compromissos e contatos salvos.

## 📌 Próximos Passos

- Implementar autenticação de usuários.
- Melhorar o design da interface gráfica.
- Adicionar notificações e lembretes para compromissos.

## 📄 Licença

Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo `LICENSE`.

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma `Issue` ou enviar um `Pull Request`.

---

Desenvolvido por [Arthur Vasconcelos](https://github.com/4rthurdev).
