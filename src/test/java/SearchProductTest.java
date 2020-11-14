import com.opencart.navigation.Navigation;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.SearchProductPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.SearchPhrases.*;
import static com.opencart.enums.URLs.BASE_URL;

public class SearchProductTest extends BaseTest {
    @Test
    public void searchProductWithIncorrectSearchCriteria() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchProductPageBL searchProductPageBL = mainPageBL
                .getSearchPageBL()
                .makeSearch(DELL.getValue());
        searchProductPageBL.verifySearchResult(DELL.getValue());
    }

    @Test
    public void searchProductWithCorrectSearchCriteria() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        SearchProductPageBL searchProductPageBL = mainPageBL
                .getSearchPageBL()
                .makeSearch(MAC.getValue());
        searchProductPageBL.verifySearchResult(MAC.getValue());
    }
}
