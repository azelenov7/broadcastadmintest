package tv.promethean.broadcast.steps;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import tv.promethean.broadcast.pages.AnalyticsPage;
import tv.promethean.broadcast.pages.ChannelsPage;
import tv.promethean.broadcast.pages.HomePage;
import tv.promethean.broadcast.pages.LibraryPage;

public class ViewerSteps extends ScenarioSteps {

    public HomePage homePage;
    public ChannelsPage channelsPage;
    public LibraryPage libraryPage;
    public AnalyticsPage analyticsPage;

    @Step
    public void open_home_page() {
        homePage.open();
    }

    @Step
    public void click_on_the_signin_button() {

        Log.info(homePage.signInButton.getAttribute("ui-sref"));
        Log.info(homePage.signInButton.getAttribute("class"));
        //homePage.waitForAngularRequestsToFinish();

        Log.info(homePage.signInButton.isDisplayed());
        Log.info(homePage.signInButton.isCurrentlyVisible());
        Log.info(homePage.signInButton.getAttribute("href"));
        homePage.signInButton();
    }

    @Step
    public void fill_in_correct_credentials() {

        homePage.usernameInput.sendKeys("bctest@p33.org");
        homePage.passwordInput.sendKeys("Temp1234567!");
        homePage.confirmSignInButton.click();
    }

    @Step
    public void go_to_the_library_page() {

        Log.info(channelsPage.libraryButton.getAttribute("Library"));
        Log.info(channelsPage.libraryButton.getAttribute("//a[@href='/library']"));
        //channelsPage.waitForAngularRequestsToFinish();

        Log.info(channelsPage.libraryButton.isDisplayed());
        Log.info(channelsPage.libraryButton.isCurrentlyVisible());

        Log.info(channelsPage.createNewButton.getAttribute("Create New"));
        Log.info(channelsPage.createNewButton.getAttribute("cta_primary"));
        //channelsPage.waitForAngularRequestsToFinish();

        Log.info(channelsPage.createNewButton.isDisplayed());
        Log.info(channelsPage.createNewButton.isCurrentlyVisible());
        channelsPage.libraryButton.click();
    }

    @Step
    public void go_to_the_analytics_page() {

        Log.info(libraryPage.analyticsButton.getAttribute("Analytics"));
        Log.info(libraryPage.analyticsButton.getAttribute("//a[@href='/analytics']"));
        //libraryPage.waitForAngularRequestsToFinish();

        Log.info(libraryPage.analyticsButton.isDisplayed());
        Log.info(libraryPage.analyticsButton.isCurrentlyVisible());

        Log.info(libraryPage.createNewButton.getAttribute("Create New"));
        Log.info(libraryPage.createNewButton.getAttribute("cta_primary"));
        //libraryPage.waitForAngularRequestsToFinish();

        Log.info(libraryPage.createNewButton.isDisplayed());
        Log.info(libraryPage.createNewButton.isCurrentlyVisible());
        libraryPage.analyticsButton.click();
    }

    @Step
    public void go_to_the_channels_page() {

        Log.info(analyticsPage.analytics.getAttribute("Analytics"));
        Log.info(analyticsPage.analytics.getAttribute("//h1[contains(.,'Analytics')]"));
        //analyticsPage.waitForAngularRequestsToFinish();

        Log.info(analyticsPage.analytics.isDisplayed());
        Log.info(analyticsPage.analytics.isCurrentlyVisible());

        Log.info(analyticsPage.channelsButton.getAttribute("Channels"));
        Log.info(analyticsPage.channelsButton.getAttribute("//i[@class='fa fa-video-camera']"));
        //analyticsPage.waitForAngularRequestsToFinish();

        Log.info(analyticsPage.channelsButton.isDisplayed());
        Log.info(analyticsPage.channelsButton.isCurrentlyVisible());
        analyticsPage.channelsButton.click();
    }
}