package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSD {

    WebDriver driver = null;

    @Given("Google browser is open")
    public void google_browser_is_open() {
        System.setProperty("webdriver.chrome.driver", "/home/crazdrms/Projects/Automation/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://google.com");
    }

    @When("User types the search keyword")
    public void user_types_the_search_keyword() {
        driver.findElement(By.name("q")).sendKeys("Shorelinecity Church dallas");
    }

    @When("Hits enter")
    public void hits_enter() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("User navigates to search results")
    public void user_navigates_to_search_results() {
        driver.getPageSource().contains("SC ONLINE");
        driver.close();
        driver.quit();
    }

}
