package tv.promethean.broadcast.pages;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@DefaultUrl("https://ptvdemo:TomLikesSmallChips!@qa.broadcast.promethean.tv")
@NamedUrls(
        {
                @NamedUrl(name = "login.popup", url = "https://qa.broadcast.promethean.tv/authentication/signin")
        }
)

public class HomePage extends PageObject {

    @FindBy(css = "div.landing-header-button-container div.landing-header-signin")
    public WebElementFacade signinButton;

    @FindBy(css = "input#usernameOrEmail")
    public WebElementFacade usernameInput;

    @FindBy(css = "input#password")
    public WebElementFacade passwordInput;

    @FindBy(css = "button.pull-right")
    public WebElementFacade confirmSignInButton;

}