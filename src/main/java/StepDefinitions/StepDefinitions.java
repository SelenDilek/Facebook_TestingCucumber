package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    WebDriver driver ;


    @Given("^User go to facebook page$")
    public void user_go_to_facebook_page() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get("https://tr-tr.facebook.com/");
    }

    @And("^User verify title$")
    public void user_verify_title() throws Throwable {
        WebElement face  = driver.findElement(By.cssSelector("#pageTitle"));
        String actual = "Facebook - Giriş Yap veya Kaydol" ;
        String expected = face.getText();
        //Assert.assertEquals(actual,expected);

    }

    @And("^user click the create new account$")
    public void user_click_the_create_new_account() throws Throwable {
        throw new PendingException();
    }

    @And("^user enter informations as$")
    public void user_enter_informations_as() throws Throwable {
        throw new PendingException();
    }

    @And("^user select date of birth$")
    public void user_select_date_of_birth() throws Throwable {
        throw new PendingException();
    }

    @And("^user select gender$")
    public void user_select_gender() throws Throwable {
        throw new PendingException();
    }

    @And("^user click the sign in button$")
    public void user_click_the_sign_in_button() throws Throwable {
        throw new PendingException();
    }

    @And("^close the app$")
    public void close_the_app() throws Throwable {
        throw new PendingException();
    }


}
