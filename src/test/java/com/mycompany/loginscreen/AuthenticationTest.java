import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author José Ramos
 * @version 1.01
 * @since Release 1.0
 * Classe de testes para a classe Authentication.
 */
public class AuthenticationTest {
    @Test
    public void testAuthenticationSuccess() {
        Authentication authentication = new Authentication();
        assertTrue(authentication.authenticate("usuarioteste", "senhateste"));
    }

    @Test
    public void testAuthenticationFailureWrongPassword() {
        Authentication authentication = new Authentication();
        assertFalse(authentication.authenticate("usuarioteste", "senhaerrada"));
    }

    @Test
    public void testAuthenticationFailureWrongUsername() {
        Authentication authentication = new Authentication();
        assertFalse(authentication.authenticate("usuarioerrado", "senhateste"));
    }
}
