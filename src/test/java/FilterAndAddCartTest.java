import org.testng.annotations.Test;

public class FilterAndAddCartTest extends TestBase{

    @Test
    public void filterAndCart()
    {
        loginPage.loginForm();
        filterAndAddCartPage.clickOnfilter();
        filterAndAddCartPage.addToCart();
        filterAndAddCartPage.removeProduct();
    }
}
