package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintionWithDataExample {

	WebDriver driver;

	@Given("^Launch Chrome browser and open the HRM application$")
	public void launch_Chrome_browser_and_open_the_HRM_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

	}

	@When("^customer enters the username in the username field \"([^\"]*)\"$")
	public void customer_enters_the_username_in_the_username_field(String userName) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(userName);
	}

	@When("^customer enters the password in the password field \"([^\"]*)\"$")
	public void customer_enters_the_password_in_the_password_field(String password) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password);

	}

	@Then("^customer click on the login button and validate if the user login is sucessful$")
	public void customer_click_on_the_login_button_and_validate_if_the_user_login_is_sucessful() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
		boolean text = driver.findElement(By.partialLinkText("Welcome Admin")).isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text);
	}

}
