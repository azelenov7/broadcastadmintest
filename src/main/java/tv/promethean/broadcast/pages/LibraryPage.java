package tv.promethean.broadcast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LibraryPage extends PageObject {

    @FindBy (xpath = "//h1[contains(.,'Library')]")
    public WebElementFacade library;

    @FindBy (xpath = "//div[@class='cta_primary']")
    public WebElementFacade createNewButton;
}
