import com.opencart.navigation.Navigation;
import com.opencart.steps.AddToShoppingCartBL;
import com.opencart.steps.ShoppingCartBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class ShoppingCartTest extends BaseTest {
    //add product to shopping cart
    @Test
    public void addProductToShoppingCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        AddToShoppingCartBL addToShoppingCartBL = new AddToShoppingCartBL();
        ShoppingCartBL shoppingCartBL = addToShoppingCartBL.clickOnAddToShoppingCartButton()
                .clickOnShoppingCartButton();
        shoppingCartBL.verifyShoppingCartInformation();
    }

    //remove product from shopping cart
    @Test
    public void removeProductFromShoppingCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        AddToShoppingCartBL addToShoppingCartBL = new AddToShoppingCartBL();
        ShoppingCartBL shoppingCartBL = addToShoppingCartBL.clickOnAddToShoppingCartButton()
                .clickOnShoppingCartButton();
        shoppingCartBL.verifyShoppingCartInformation();
        shoppingCartBL.clickOnRemoveButton();
        shoppingCartBL.verifyRemoveButton();
    }
}
