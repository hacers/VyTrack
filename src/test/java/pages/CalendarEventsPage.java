package pages;

import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    String xpath1;
    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//div[@class='btn btn-link dropdown-toggle']")
    public WebElement options;

    @FindBy(xpath = "//input[@value='1']")
    public WebElement number;

    @FindBy(xpath ="//button[@data-toggle='dropdown']")
    public WebElement button;

    @FindBy(xpath ="//tbody/tr/td[2]")
    public List<WebElement> title;

    public WebElement getTitle(String title){
        String xpath = "//td[contains(text(),'"+title+"')][@data-column-label='Title']";
        return Driver.get().findElement(By.xpath(xpath));

    }

    String mainPath ="//div[@class='responsive-block'][1]";
    public WebElement labels(int i){
        String xpath = mainPath+"/div["+i+"]/label";
        return Driver.get().findElement(By.xpath(xpath));

    }
    public WebElement divTexts(int i){
        String xpath = mainPath+"/div["+i+"]/div/div";
        return Driver.get().findElement(By.xpath(xpath));

    }

    @FindBy(xpath = "//div[@class='responsive-block'][1]/div[2]//p")
    public WebElement p;

    @FindBy(xpath = "//div[@class='responsive-block'][1]/div[6]//a")
    public WebElement a;

    @FindBy(xpath ="//div[@class='responsive-block'][1]/div[7]//span")
    public WebElement span;

    @FindBy(xpath ="//div[@class='responsive-block'][2]/div/label")
    public WebElement label;

    @FindBy(xpath ="//div[@class='responsive-block'][2]/div/div")
    public WebElement div;

    @FindBy(xpath ="//div[@class='btn-group dropdown']//input")
    public WebElement allCheck;
}