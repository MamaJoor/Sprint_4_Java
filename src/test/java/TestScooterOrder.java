import PageObject.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

@RunWith(Parameterized.class)
public class TestScooterOrder {

    private WebDriver driver;

    private final String location;
    private final String firstName;
    private final String secondName;
    private final String address;
    private final String metro;
    private final String userPhone;
    private final String date;
    private final int days;
    private final String color;
    private final String comment;

    public TestScooterOrder(String location, String firstName, String secondName, String address, String metro, String userPhone, String date, String color, String comment, int days) {
        this.location = location;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.metro = metro;
        this.userPhone = userPhone;
        this.date = date;
        this.color = color;
        this.comment = comment;
        this.days = days;
    }

    @Parameterized.Parameters
    public static Object[][] testOrder() {
        return new Object[][]{
                {"Top", "Артем", "Жданов", "Фролова, 15", "Соколники", "79121234567", "09.11.2022", "Black", "Продам гараж", 1},
                {"Bottom","Ждан", "Артемов", "Цвиллинга, 7", "Лубянка", "777777777777", "13.02.2023", "Grey", "Захватите с собой пиццы", 5}
        };
    }


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testBothButtons(){
        OrderPage orderPage = new OrderPage(driver);

        orderPage.openUrl();
        orderPage.clickCookieButton();
        orderPage.clickOrderButton(location);

        orderPage.setFirstName(firstName);
        orderPage.setSecondName(secondName);
        orderPage.setAddress(address);
        orderPage.setMetro(metro);
        orderPage.setPhoneNumber(userPhone);
        orderPage.clickContinueButton();

        orderPage.setOderTime(date);
        orderPage.chooseScooterColor(color);
        orderPage.setComment(comment);
        orderPage.setRentalPeriod(days);
        orderPage.clickFinalOrderButton();
        orderPage.clickYesButton();
        orderPage.checkOrderPlacedSuccessfully();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
