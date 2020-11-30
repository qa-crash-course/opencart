import com.opencart.navigation.Navigation;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.AdminMainPageBL;
import com.opencart.steps.CurrencyPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;

public class AddNewCurrencyTest extends BaseTest {
    @Test
    public void addNewCurrency(){
        new Navigation().navigateToUrl( ADMIN_URL.getValue());
        AdminMainPageBL adminMainPageBL = new AdminMainPageBL();
        AdminLoginPageBL adminLoginPageBL = adminMainPageBL.getAdminLoginPageBL()
                .loginAdminPerson();
        adminLoginPageBL.verifyAdminLogin();

        CurrencyPageBL currencyPageBL = adminMainPageBL.getNavigateMenuAdminPageBL()
                .clickOnSystemButton()
                .clickOnLocalisationButton()
                .clickOnCurrencyButton()
                .registerNewCurrency();
        currencyPageBL.verifyAddNewCurrency();
    }
}
