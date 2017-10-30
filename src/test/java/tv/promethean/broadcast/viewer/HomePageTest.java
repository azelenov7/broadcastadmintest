package tv.promethean.broadcast.viewer;

import tv.promethean.broadcast.steps.ViewerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class HomePageTest {

    @Managed(driver = "chrome")
    WebDriver browserDriver;

    @Steps
    ViewerSteps viewer;

    @Before
    public void open_browser() {

        viewer.open_home_page();
        browserDriver.manage().window().maximize();

    }

    @Test
    public void userShouldBeAbleToSignIn() {

        viewer.click_on_the_signin_button();
        viewer.fill_in_correct_credentials();
    }

    @Test
    public void userShouldBeAbleToNavigate() {

        viewer.click_on_the_library_button();
        viewer.click_on_the_analytics_button();

    }

}

