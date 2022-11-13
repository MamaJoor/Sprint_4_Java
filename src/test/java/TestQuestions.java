import PageObject.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


@RunWith(Parameterized.class)
public class TestQuestions {

    WebDriver driver;

    private final int index;

    public TestQuestions(int index) {
        this.index = index;
    }

    @Parameterized.Parameters
    public static Object[][] testAnswer() {
        return new Object[][]{
                {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}
        };
    }

    @Before
    public void  setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void checkAnswers(){
        MainPage mainPage = new MainPage(driver);
        mainPage.openUrl();
        mainPage.clickCookieButton();
        mainPage.clickOnQuestion(index);
        boolean visibility = mainPage.answerVisibility(index);
        Assert.assertTrue(visibility);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
