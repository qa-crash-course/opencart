import com.opencart.navigation.Navigation;

import com.opencart.pages.AdminDashboardPage;
import com.opencart.steps.AdminDashboardPageBL;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.AdminMainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;

public class AdminLoginTest extends BaseTest{

    @Test
    public void adminLogin(){
        new Navigation().navigateToUrl( ADMIN_URL.getValue());
        AdminMainPageBL adminMainPageBL = new AdminMainPageBL();
        AdminLoginPageBL adminLoginPageBL = adminMainPageBL.getAdminLoginPageBL()
                .loginAdminPerson();

        AdminDashboardPageBL adminDashboardPageBL = adminMainPageBL.getAdminDashboardPageBL();
        adminDashboardPageBL.verifyAdminLogin();
    }
}