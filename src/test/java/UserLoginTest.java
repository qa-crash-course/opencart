import com.opencart.navigation.Navigation;
import com.opencart.pages.BasePage;
import com.opencart.pages.LoginPage;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserLoginTest extends BasePage {

    @Test
    public void loginUserWithAccurateParametrs(){
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        loginPageBL.verifyUserLogin();
    }

}
