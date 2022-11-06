package PageObject;

import org.junit.Assert;
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

    //локаторы на все вопросы "Вопросы о важном"
    private final By firstQuestion = By.id("accordion__heading-0");
    private final By secondQuestion = By.id("accordion__heading-1");
    private final By thirdQuestion = By.id("accordion__heading-2");
    private final By fourthQuestion = By.id("accordion__heading-3");
    private final By fifthQuestion = By.id("accordion__heading-4");
    private final By sixthQuestion = By.id("accordion__heading-5");
    private final By seventhQuestion = By.id("accordion__heading-6");
    private final By eighthQuestion = By.id("accordion__heading-7");

    //локаторы на все ответы "Вопросы о важном"
    private final By firstAnswer = By.xpath(".//div[@id='accordion__panel-0']/p");
    private final By secondAnswer = By.xpath(".//div[@id='accordion__panel-1']/p");
    private final By thirdAnswer = By.xpath(".//div[@id='accordion__panel-2']/p");
    private final By fourthAnswer = By.xpath(".//div[@id='accordion__panel-3']/p");
    private final By fifthAnswer = By.xpath(".//div[@id='accordion__panel-4']/p");
    private final By sixthAnswer = By.xpath(".//div[@id='accordion__panel-5']/p");
    private final By seventhAnswer = By.xpath(".//div[@id='accordion__panel-6']/p");
    private final By eighthAnswer = By.xpath(".//div[@id='accordion__panel-7']/p");

    //метод открывающий главную страницу по ссылке
    public void openUrl() {
        driver.get(mainPageUrl);
    }

    //метод, нажимающий на кнопку для принятия куки
    public void clickCookieButton() {
        driver.findElement(cookieButton).click();
    }

    public void checkFirstQuestion() {
        driver.findElement(firstQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(firstAnswer).isDisplayed());
    }

    public void checkSecondQuestion() {
        driver.findElement(secondQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 2ой вопрос", driver.findElement(secondAnswer).isDisplayed());
    }

    public void checkThirdQuestion() {
        driver.findElement(thirdQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(thirdAnswer).isDisplayed());
    }

    public void checkFourthQuestion() {
        driver.findElement(fourthQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(fourthAnswer).isDisplayed());
    }

    public void checkFifthQuestion() {
        driver.findElement(fifthQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(fifthAnswer).isDisplayed());
    }

    public void checkSixthQuestion() {
        driver.findElement(sixthQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(sixthAnswer).isDisplayed());
    }

    public void checkSeventhQuestion() {
        driver.findElement(seventhQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(seventhAnswer).isDisplayed());
    }

    public void checkEighthQuestion() {
        driver.findElement(eighthQuestion).click();
        Assert.assertTrue("Отсутствует ответ на 1ый вопрос", driver.findElement(eighthAnswer).isDisplayed());
    }

}
