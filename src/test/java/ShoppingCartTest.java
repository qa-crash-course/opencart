import com.opencart.navigation.Navigation;
import com.opencart.steps.HeaderPageBL;
import com.opencart.steps.ProductPageBL;
import com.opencart.steps.ShoppingCartBL;
import org.testng.annotations.Test;

import static com.opencart.enums.ShoppingCartVerifyProductByName.AppleCinema;
import static com.opencart.enums.ShoppingCartVerifyProductByName.MacBook;
import static com.opencart.enums.URLs.BASE_URL;

public class ShoppingCartTest extends BaseTest {
    @Test
    public void addProductToShoppingCartWithAvailableOptionsTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        ProductPageBL productPageBL = new ProductPageBL();
        HeaderPageBL headerPageBL = productPageBL.clickOnProductNameButtonWithAddOptions()
                .availableProductOptions();
        headerPageBL.verifyAddToCartTitle(AppleCinema.getValue());
    }

    @Test
    public void removeProductFromShoppingCartWithAvailableOptionsTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        ProductPageBL productPageBL = new ProductPageBL();
        ShoppingCartBL shoppingCartBL = productPageBL.clickOnProductNameButtonWithAddOptions().availableProductOptions()
                .goToShoppingCartStore()
                .clickOnRemoveButton()
                .verifyRemoveButton();
    }

    @Test
    public void addProductToShoppingCartWithoutAvailableOptionsTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        ProductPageBL productPageBL = new ProductPageBL();
        HeaderPageBL headerPageBL = productPageBL.clickOnProductNameButtonWithoutAddOptions();
        headerPageBL.verifyAddToCartTitle(MacBook.getValue());
    }

    @Test
    public void removeProductFromShoppingCartWithoutAvailableOptionsTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        ProductPageBL productPageBL = new ProductPageBL();
        ShoppingCartBL shoppingCartBL = productPageBL.clickOnProductNameButtonWithoutAddOptions()
                .withoutProductOptions()
                .goToShoppingCartStore()
                .clickOnRemoveButton()
                .verifyRemoveButton();
    }
}
