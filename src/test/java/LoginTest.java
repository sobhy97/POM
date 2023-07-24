import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void fillLoginForm()
    {
        loginPage.loginForm();
    }
}
