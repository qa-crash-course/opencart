import com.opencart.navigation.Navigation;
import com.opencart.steps.EditAccountBL;
import com.opencart.steps.EditMyAccountInformationPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.RegisterPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class EditAccountTest extends BaseTest {
    @Test
    public void editAccount() {

        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        RegisterPageBL registerPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson();

        EditAccountBL editAccountBL = new EditAccountBL();
        EditMyAccountInformationPageBL editMyAccountInformationPageBL = editAccountBL.clickOnEditAccountButton()
                .editUserAccount();
        editMyAccountInformationPageBL.verifyUserEditInformation();
    }
}
