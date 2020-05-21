package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenHRMLoginPageDefinitions {
		WebDriver driver;
	
	@Given("^Open Chrome browser and launch the HRM application$")
	public void open_Chrome_browser_and_launch_the_HRM_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Program Files\\Automation\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	    
	}

	@When("^user enters the username in the username field$")
	public void user_enters_the_username_in_the_username_field() throws Throwable {
	    driver.findElement(By.name("txtUsername")).sendKeys("admin");
	    
	}

	@When("^user enters the password in the password field$")
	public void user_enters_the_password_in_the_password_field() throws Throwable {
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    
	}

	@Then("^user click on the login button and validate if the user login is sucessful$")
	public void user_click_on_the_login_button_and_validate_if_the_user_login_is_sucessful() throws Throwable {
	   driver.findElement(By.id("btnLogin")).click();
	   String title = driver.getTitle(); 
	   System.out.println(title);
	   
	   Assert.assertEquals(title, "OrangeHRM");
	}



}
