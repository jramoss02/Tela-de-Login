/**
 * @author José Ramos
 * @version 1.01
 * @since Release 1.0
 * Classe que realiza a autenticação de usuário.
 */
public class Authentication {
    /**
     * Método para autenticar um usuário com um nome de usuário e senha.
     *
     * @param username O nome de usuário a ser autenticado.
     * @param password A senha correspondente ao nome de usuário.
     * @return true se a autenticação for bem-sucedida, false caso contrário.
     */
    public boolean authenticate(String username, String password) {
        // Simulação de lógica de autenticação
        if (username.equals("usuarioteste") && password.equals("senhateste")) {
            return true;
        }
        return false;
    }
}
