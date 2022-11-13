package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //ссылка на главную страницу
    private final String mainPageUrl = "https://qa-scooter.praktikum-services.ru/";

    //Кнопка "Да все привыкли" для принятия куки
    private final By cookieButton = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    //метод открывающий главную страницу по ссылке
    public void openUrl() {
        driver.get(mainPageUrl);
    }

    //метод, нажимающий на кнопку для принятия куки
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void clickOnQuestion(int index) {
        By question = By.id("accordion__heading-" + index);
        driver.findElement(question).click();
    }

    public boolean answerVisibility(int index) {
        By answer = By.id("accordion__panel-" + index);
        return driver.findElement(answer).isDisplayed();
    }
}
