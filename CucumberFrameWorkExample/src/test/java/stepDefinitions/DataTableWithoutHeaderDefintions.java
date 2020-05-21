package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderDefintions {

	WebDriver driver;

	@Given("^You are on the login page$")
	public void you_are_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();	   
	}

	@When("^you enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable dataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<String> credentials = dataTable.asList(String.class);
		String userName = credentials.get(0);
		String password = credentials.get(1);
		driver.findElement(By.name("txtUsername")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@When("^enter the login button$")
	public void enter_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^able to see the home page$")
	public void able_to_see_the_home_page() throws Throwable {
		boolean text = driver.findElement(By.partialLinkText("Welcome Admin")).isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text);

	}


}
