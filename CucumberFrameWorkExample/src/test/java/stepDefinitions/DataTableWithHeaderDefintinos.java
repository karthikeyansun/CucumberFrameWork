package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithHeaderDefintinos {
	
	WebDriver driver;
	
	@Given("^Go to login page$")
	public void go_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^enter the below credentials$")
	public void enter_the_below_credentials(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<Map<String, String>> datawithheader = dataTable.asMaps(String.class, String.class);
		String username = datawithheader.get(0).get("username");
		String password = datawithheader.get(0).get("password");
		
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
	    
	}

	@When("^press the login button$")
	public void press_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^able to see the home page screen$")
	public void able_to_see_the_home_page_screen() throws Throwable {
		boolean text = driver.findElement(By.partialLinkText("Welcome Admin")).isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text);
	    
	}


	
	
}
