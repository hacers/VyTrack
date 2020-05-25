package pages;

import utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarEventInfoPage extends BasePage{

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


}
