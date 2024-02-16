package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Login_map {
    WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "DriverChrome/chromedriver_win.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @After
    public void teardown() {

        driver.quit();
    }
}

   /* @Given("^user is on Register Page$")
    public void user_is_on_login_page() {
        
        driver.get("https://www.saucedemo.com/");
    }


    @When("title login page is Free CRM")
    public void title_login_page_is_free_crm() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Swag Labs", title);

    }
    @When("Multiple username and password")
    public void multiple_username_and_password(DataTable credentials) throws InterruptedException {
        for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			driver.findElement(By.id("user-name")).sendKeys((CharSequence) data.get("username"));
			driver.findElement(By.id("password")).sendKeys((CharSequence) data.get("password"));
            driver.findElement(By.id("login-button")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-burger-menu-btn")));
            driver.findElement(By.id("react-burger-menu-btn")).click();
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element1 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
            driver.findElement(By.id("logout_sidebar_link")).click();
        }

    }
    @Then("Close the browse")
    public void close_the_browse() {
        driver.quit();
    }



}
*/