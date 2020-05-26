package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleCostsPage extends BasePage{

    @FindBy(xpath = "//a[@title='Create Vehicle Costs']")
    public WebElement createButton;

}
