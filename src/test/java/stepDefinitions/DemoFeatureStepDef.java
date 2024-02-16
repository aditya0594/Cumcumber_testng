package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DemoFeatureStepDef {
	WebDriver driver;
	
	@Given("Precondition is given")
	public void precondition_is_given() {
		System.setProperty("webdriver.chrome.driver", "DriverChrome/chromedriver_win.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println("Precondition is given");
	}

	@When("Something is done")
	public void something_is_done() {
	    System.out.println("Something is done");
	}

	@Then("Something is expected")
	public void something_is_expected() {
	    System.out.println("Something is expected");
	}

	@Given("Another precondition is given")
	public void another_precondition_is_given() {
	   System.out.println("Another precondition is given");
	}

	@When("Something is done again")
	public void something_is_done_again() {
	    System.out.println("Something is done again");
	}

	@Then("Something is expected again")
	public void something_is_expected_again() {
	    System.out.println("Something is expected again");
	}


}