package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithExamples {
	
	
	
	WebDriver driver;
	
	@Given("^Move to login page$")
	public void move_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^user enters the \"([^\"]*)\"  and \"([^\"]*)\"$")
	public void user_enters_the_and(String userName, String password) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(userName);
		driver.findElement(By.name("txtPassword")).sendKeys(password);


	}
	
	@When("^login button$")
	public void login_button() throws Throwable {
	    
		driver.findElement(By.id("btnLogin")).click();
	    	}

	@Then("^verify loginscreen$")
	public void verify_loginscreen() throws Throwable {

		
		boolean text = driver.findElement(By.partialLinkText("Welcome Admin")).isDisplayed();
		System.out.println(text);
		Assert.assertTrue(text);
		
	}


}
