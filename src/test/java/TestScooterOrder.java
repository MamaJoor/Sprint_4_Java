import PageObject.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class TestScooterOrder {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void orderWithTopButton() {

        OrderPage orderPage = new OrderPage(driver);

        orderPage.openUrl();
        orderPage.clickCookieButton();
        orderPage.clickTopOrderButton();

        orderPage.setFirstName("Артем");
        orderPage.setSecondName("Жданов");
        orderPage.setAddress("Фролова, 15");
        orderPage.setMetro("Соколники");
        orderPage.setPhoneNumber("79121234567");
        orderPage.clickContinueButton();

        orderPage.setOderTime("09.11.2022");
        orderPage.chooseBlackScooter();
        orderPage.setRentalPeriodOneDay();
        orderPage.setComment("Продам гараж");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        orderPage.checkOrderPlacedSuccessfully();
    }

    @Test
    public void orderWithBottomButton() {

        OrderPage orderPage = new OrderPage(driver);

        orderPage.openUrl();
        orderPage.clickCookieButton();
        orderPage.clickBottomOrderButton();

        orderPage.setFirstName("Ждан");
        orderPage.setSecondName("Артемов");
        orderPage.setAddress("Цвиллинга, 7");
        orderPage.setMetro("Лубянка");
        orderPage.setPhoneNumber("777777777777");
        orderPage.clickContinueButton();

        orderPage.setOderTime("13.02.2023");
        orderPage.chooseGreyScooter();
        orderPage.setRentalPeriodTwoDays();
        orderPage.setComment("Захватите с собой пиццы");
        orderPage.clickOrderButton();
        orderPage.clickYesButton();
        orderPage.checkOrderPlacedSuccessfully();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
