package tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        //Configuration.holdBrowserOpen = true;
        Configuration.timeout = 5000;

    }

    @AfterEach
    void afterEach() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }

}