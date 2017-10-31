package tv.promethean.broadcast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ChannelsPage extends PageObject {

    @FindBy(xpath = "//span[contains(.,'Library')]")
    public WebElementFacade libraryButton;

    public void libraryButton() {
        libraryButton.click();
    }

    @FindBy(xpath = "//div[@class='cta_primary ng-scope']")
    public WebElementFacade createNewButton;
}
