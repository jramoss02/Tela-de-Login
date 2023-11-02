# Projeto de Autenticação Java

Este é um projeto Java para demonstrar a autenticação de usuário e senha usando o processo de Desenvolvimento Orientado a Testes (TDD). O projeto inclui uma classe `Login` que permite a autenticação de usuários.

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

* Versão mais recente instalada das linguagens e ferramentas: `<Javascript>`
* Você tem uma máquina `<Windows / Linux / Mac>`

## Passos do Projeto

O projeto segue os seguintes passos:

1. **Escrever o teste unitário (JUnit) para a autenticação de usuário e senha:**

    - Criação de testes que abrangem diferentes cenários de autenticação, como sucesso, senha incorreta e usuário inexistente.

2. **Executar os testes unitários:**

    - Verificação de que os testes falham inicialmente, uma vez que a implementação real ainda não foi feita.

3. **Implementar a classe `Login`:**

    - Implementação da lógica de autenticação de usuário e senha na classe `Login`.

4. **Executar os testes unitários novamente:**

    - Verificação de que os testes passam após a implementação da classe `Login`.

5. **Documentação e Exportação do Javadoc:**

    - Documentação do código usando comentários Javadoc para que outros desenvolvedores possam entender como usar a classe `Login`.

## Uso

Para usar a classe `Login` em seu projeto, siga estas etapas:

1. Importe a classe `Login` no seu código:

    ```java
    import com.example.auth.Login;
    ```

2. Crie uma instância da classe `Login`:

    ```java
    Login login = new Login();
    ```

3. Use o método `authenticate` para autenticar um usuário:

    ```java
    boolean authenticated = login.authenticate("nomeDeUsuario", "senha");
    ```

## Exemplo de Autenticação

Aqui está um exemplo de como usar a classe `Login` para autenticar um usuário:

```java
import com.example.auth.Login;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        boolean authenticated = login.authenticate("usuarioteste", "senhateste");

        if (authenticated) {
            System.out.println("Autenticação bem-sucedida.");
        } else {
            System.out.println("Autenticação falhou.");
        }
    }
}

```

## 🛠️ Construído com


* [Netbeans](https://netbeans.apache.org/) - IDE utilizada.
* [Java](https://www.java.com/pt-BR/) - Linguagem de programação utilizada.
* [JUnit](https://junit.org/junit5/) - Framework.

## 🤝 Colaboradores

Pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="#">
        <img src="https://avatars.githubusercontent.com/u/77749469?v=4" width="100px;"/><br>
        <sub>
          <b>José Ramos</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
