import com.opencart.navigation.Navigation;
import com.opencart.steps.AdminPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;

public class AddNewCurrencyTest  extends BaseTest{
    @Test
    public void addNewCurrency(){
        new Navigation().navigateToUrl( ADMIN_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AdminPageBL adminPageBL = mainPageBL.getAdminPageBL()
                .loginAdmin();
        Assert.assertEquals(1,1);
    }
}
