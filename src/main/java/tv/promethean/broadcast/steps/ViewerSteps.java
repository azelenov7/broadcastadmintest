package tv.promethean.broadcast.steps;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tv.promethean.broadcast.pages.AnalyticsPage;
import tv.promethean.broadcast.pages.HomePage;
import tv.promethean.broadcast.pages.LibraryPage;

public class ViewerSteps extends ScenarioSteps {

    public HomePage homePage;
    public LibraryPage libraryPage;
    public AnalyticsPage analyticsPage;

    @Step
    public void open_home_page() {
        homePage.open();
    }

    @Step
    public void click_on_the_signin_button() {

        Log.info(homePage.signinButton.getAttribute("ui-sref"));
        Log.info(homePage.signinButton.getAttribute("class"));
        //homePage.waitForAngularRequestsToFinish();

        Log.info(homePage.signinButton.isDisplayed());
        Log.info(homePage.signinButton.isCurrentlyVisible());
        Log.info(homePage.signinButton.getAttribute("href"));
        homePage.openAt("https://qa.broadcast.promethean.tv/authentication/signin");
    }

    @Step
    public void fill_in_correct_credentials() {
        homePage.usernameInput.sendKeys("bctest@p33.org");
        homePage.passwordInput.sendKeys("Temp1234567!");
        homePage.confirmSignInButton.click();
        homePage.confirmSignInButton.click();
    }

    @Step
    public void click_on_the_library_button() {

        new WebElement(libraryPage).click();
        Log.info(libraryPage.library.getAttribute("Library"));
        Log.info(libraryPage.library.getAttribute("cta_primary"));
        //libraryPage.waitForAngularRequestsToFinish();

        Log.info(libraryPage.library.isDisplayed());
        Log.info(libraryPage.library.isCurrentlyVisible());

        Log.info(libraryPage.createNewButton.getAttribute("Create New"));
        Log.info(libraryPage.createNewButton.getAttribute("cta_primary"));
        //libraryPage.waitForAngularRequestsToFinish();

        Log.info(libraryPage.createNewButton.isDisplayed());
        Log.info(libraryPage.createNewButton.isCurrentlyVisible());
    }

    @Step
    public void click_on_the_analytics_button() {

        Log.info(analyticsPage.analytics.getAttribute("Analytics"));
        Log.info(analyticsPage.analytics.getAttribute("filter_data_header ng-binding"));

        Log.info(analyticsPage.analytics.isDisplayed());
        Log.info(analyticsPage.analytics.isCurrentlyVisible());

    }
}