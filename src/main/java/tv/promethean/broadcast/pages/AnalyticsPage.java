package tv.promethean.broadcast.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class AnalyticsPage extends PageObject {

    @FindBy (xpath = "Analytics")
    public WebElementFacade analytics;

}
