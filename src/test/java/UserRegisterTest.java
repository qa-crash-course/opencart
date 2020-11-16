import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RegisterPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.*;

public class UserRegisterTest extends BaseTest {

    @Test
    public void registerUserWithValidParameters() {

        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();
        registerPageBL.verifyUserRegistration();
    }
}
