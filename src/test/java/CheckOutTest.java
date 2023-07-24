import org.testng.annotations.Test;

public class CheckOutTest extends TestBase{

    @Test
    public void checkoutWorkFlow()
    {
        loginPage.loginForm();
        filterAndAddCartPage.clickOnfilter();
        filterAndAddCartPage.addToCart();
        filterAndAddCartPage.removeProduct();
        checkoutPage.checkOutFlow("Ahmed","Sobhy","11931");
    }
}
