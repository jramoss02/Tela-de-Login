/**
 * @author José Ramos
 * @version 1.01
 * @since Release 1.0
 * Ponto de entrada do projeto de autenticação.
 */
public class LoginScreen {
    /**
     * Método principal para demonstrar a autenticação.
     *
     * @param args Os argumentos da linha de comando (não são usados neste exemplo).
     */
    public static void main(String[] args) {
        // Realiza a autenticação de usuário com um nome de usuário e senha.
        Authentication authentication = new Authentication();
        boolean authenticated = authentication.authenticate("usuarioteste", "senhateste");

        if (authenticated) {
            System.out.println("Autenticação bem-sucedida.");
        } else {
            System.out.println("Autenticação falhou.");
        }
    }
}
