import com.opencart.navigation.Navigation;
import com.opencart.pages.BasePage;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.LogoutPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ACCOUNT_URL;
import static com.opencart.enums.URLs.BASE_URL;
public class UserLoginLogoutTest extends BaseTest {
    @Test
    public void loginUserWithAccurateParameters() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        loginPageBL.verifyUserLogin();
    }
    @Test
    public void logoutUser() {
        MainPageBL mainPageBL = new MainPageBL();
        LogoutPageBL logoutPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton();
        logoutPageBL.verifyUserLogout();
    }

}
