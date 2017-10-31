package tv.promethean.broadcast.viewer;

import tv.promethean.broadcast.steps.ViewerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
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

        viewer.go_to_the_library_page();
        viewer.go_to_the_analytics_page();
        viewer.go_to_the_channels_page();
    }
}

