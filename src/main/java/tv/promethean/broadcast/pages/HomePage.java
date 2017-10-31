package tv.promethean.broadcast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ptvdemo:TomLikesSmallChips!@qa.broadcast.promethean.tv")

public class HomePage extends PageObject {

    @FindBy(xpath = ".//*[@ui-sref='authentication.signin']")
    public WebElementFacade signInButton;

    public void signInButton() {
        signInButton.click();
    }

    @FindBy(css = "input#usernameOrEmail")
    public WebElementFacade usernameInput;

    @FindBy(css = "input#password")
    public WebElementFacade passwordInput;

    @FindBy(xpath = "//button[@class='btn_orange pull-right']")
    public WebElementFacade confirmSignInButton;

    public void confirmSignInButton() {
        confirmSignInButton.click();
    }
}