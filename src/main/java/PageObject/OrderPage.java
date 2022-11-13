package PageObject;

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
    private final By rentalPeriodChoice = By.xpath(".//div[text() = '* Срок аренды']");
    private final By rentalPeriodOneDay = By.xpath(".//div[text() = 'сутки']");
    private final By rentalPeriodTwoDays = By.xpath(".//div[text() = 'двое суток']");
    private final By rentalPeriodThreeDays = By.xpath(".//div[text() = 'трое суток']");
    private final By rentalPeriodFourDays = By.xpath(".//div[text() = 'четверо суток']");
    private final By rentalPeriodFiveDays = By.xpath(".//div[text() = 'пятеро суток']");
    private final By rentalPeriodSixDays = By.xpath(".//div[text() = 'шестеро суток']");
    private final By rentalPeriodSevenDays = By.xpath(".//div[text() = 'семеро суток']");
    private final By colorBlack = By.id("black");
    private final By colorGrey = By.id("grey");
    private final By commentInput = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private final By orderButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[text() = 'Заказать']");
    private final By yesButton = By.xpath(".//button[text() = 'Да']");

    private final By successOrder = By.xpath(".//div[text() = 'Заказ оформлен']");

    public void openUrl() {
        driver.get(mainPageUrl);
    }

    //Метод выбора кнопки
    public void clickOrderButton(String location){
        if (location == "Top"){
            driver.findElement(topOrderButton).click();
        } else {
            driver.findElement(bottomOrderButton).click();
        }
    }

    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameInput).sendKeys(firstName);
    }
    //Метод для заполнения поля Фамилия
    public void setSecondName(String secondName) {
        driver.findElement(secondNameInput).sendKeys(secondName);
    }
    //Метод для заполнения поля Адрес
    public void setAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }
    //Метод для заполнения поля Метро
    public void setMetro(String metro) {
        driver.findElement(metroInput).sendKeys(metro, Keys.ARROW_DOWN, Keys.ENTER);
    }
    //Метод для заполнения поля Телефон
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
    public void setRentalPeriod(int days){
        driver.findElement(rentalPeriodChoice).click();
        if (days == 1) {
            driver.findElement(rentalPeriodOneDay).click();
        } else if (days == 2) {
            driver.findElement(rentalPeriodTwoDays).click();
        } else if (days == 3) {
            driver.findElement(rentalPeriodThreeDays).click();
        } else if (days == 4) {
            driver.findElement(rentalPeriodFourDays).click();
        } else if (days == 5) {
            driver.findElement(rentalPeriodFiveDays).click();
        } else if (days == 6) {
            driver.findElement(rentalPeriodSixDays).click();
        } else {
            driver.findElement(rentalPeriodSevenDays).click();
        }

    }

    public void chooseScooterColor(String color) {
        if (color == "Black") {
            driver.findElement(colorBlack).click();
        } else {
            driver.findElement(colorGrey).click();
        }
    }

    public void setComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment);
    }
    public void clickFinalOrderButton() {
        driver.findElement(orderButton).click();
    }
    public void clickYesButton() {
        driver.findElement(yesButton).click();
    }

    public void checkOrderPlacedSuccessfully() {
        Assert.assertTrue("Ошибка в оформлении заказа", driver.findElement(successOrder).isDisplayed());
    }


}
