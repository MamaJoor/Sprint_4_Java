package PageObject;

//import org.junit.Assert;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private final String mainPageUrl = "https://qa-scooter.praktikum-services.ru/";

    private final By cookieButton = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    private final By topOrderButton = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[text() = 'Заказать']");
    private final By bottomOrderButton = By.xpath(".//div[@class = 'Home_FinishButton__1_cWm']/button[text() = 'Заказать']");

    private final By firstNameInput = By.xpath(".//input[@placeholder = '* Имя']");
    private final By secondNameInput = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By addressInput = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By metroInput = By.xpath(".//input[@placeholder = '* Станция метро']");
    private final By phoneNumberInput = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");

    private final By continueButton = By.xpath("//button[contains(@class, 'Button_Button__ra12g Button_Middle__1CSJM')]");
    private final By orderTimeInput = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private final By rentalPeriodChoice = By.xpath(".//div[@class='Dropdown-root']");
    private final By rentalPeriodOneDay = By.xpath(".//div[text() = 'сутки']");
    private final By rentalPeriodTwoDays = By.xpath(".//div[text() = 'двое суток']");
    private final By colorBlack = By.id("black");
    private final By colorGrey = By.id("grey");
    private final By commentInput = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private final By orderButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Заказать']");
    private final By yesButton = By.xpath(".//button[text() = 'Да']");

    private final By successOrder = By.xpath(".//div[text() = 'Заказ оформлен']");



    //метод нажимающий на верхнюю кнопку "заказать"
    public void clickTopOrderButton(){
        driver.findElement(topOrderButton).click();
    }

    //метод нажимающий на нижнюю кнопку "заказать"
    public void clickBottomOrderButton(){
        driver.findElement(bottomOrderButton).click();
    }

    public void openUrl() {
        driver.get(mainPageUrl);
    }

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    //Метод для заполнения поля * Фамилия
    public void setSecondName(String secondName) {
        driver.findElement(secondNameInput).sendKeys(secondName);
    }
    //Метод для заполнения поля * Адрес
    public void setAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }
    //Метод для заполнения поля * Метро
    public void setMetro(String metro) {
        driver.findElement(metroInput).sendKeys(metro, Keys.ARROW_DOWN, Keys.ENTER);
    }
    //Метод для заполнения поля * Телефон
    public void setPhoneNumber(String userPhone) {
        driver.findElement(phoneNumberInput).sendKeys(userPhone);
    }
    //Нажатие кнопки далее
    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }
    public void setOderTime(String date){
        driver.findElement(orderTimeInput).sendKeys(date);
    }
    public void setRentalPeriodOneDay(){
        driver.findElement(rentalPeriodChoice).click();
        driver.findElement(rentalPeriodOneDay).click();
    }
    public void setRentalPeriodTwoDays(){
        driver.findElement(rentalPeriodChoice).click();
        driver.findElement(rentalPeriodTwoDays).click();
    }
    public void chooseBlackScooter() {
        driver.findElement(colorBlack).click();
    }
    public void chooseGreyScooter() {
        driver.findElement(colorGrey).click();
    }
    public void setComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment);
    }
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public void checkOrderPlacedSuccessfully() {
        Assert.assertTrue("Ошибка в оформлении заказа", driver.findElement(successOrder).isDisplayed());
    }


}
