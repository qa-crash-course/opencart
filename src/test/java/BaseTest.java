import com.opencart.driver.DriverRepository;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeSuite
    public void setup() {
        DriverRepository.downloadWebDriver();
    }

    @BeforeMethod
    public void createDriver() {
        DriverRepository.instanceWebBrowser();
    }

    @AfterMethod
    public void closeBrowser() {
        DriverRepository.closeBrowser();
    }
}
