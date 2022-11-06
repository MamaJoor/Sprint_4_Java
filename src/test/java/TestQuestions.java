import PageObject.MainPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class TestQuestions {

    private WebDriver driver;

    @Before
    public void  setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void checkFirstAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkFirstQuestion();
    }
    @Test
    public void checkSecondAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkSecondQuestion();
    }
    @Test
    public void checkThirdAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkThirdQuestion();
    }
    @Test
    public void checkFourthAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkFourthQuestion();
    }
    @Test
    public void checkFifthAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkFifthQuestion();
    }
    @Test
    public void checkSixthAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkSixthQuestion();
    }
    @Test
    public void checkSeventhAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkSeventhQuestion();
    }
    @Test
    public void checkEighthAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.checkEighthQuestion();
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
