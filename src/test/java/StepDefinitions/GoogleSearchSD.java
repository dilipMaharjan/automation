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
        String basePath = System.getProperty("user.dir");
        System.out.println(basePath);
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.navigate().to("https://google.com");
    }

    @When("^User types the (.*)$")
    public void user_types_the_searchKey(String searchKey) {
        driver.findElement(By.name("q")).sendKeys(searchKey);
    }

    @When("Hits enter")
    public void hits_enter() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("User finds result")
    public void user_finds_result() {
        driver.getPageSource().contains("SC ONLINE");
        driver.close();
        driver.quit();
    }

}
