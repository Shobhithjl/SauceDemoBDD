package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition 
{
	WebDriver driver;
	LoginPageObjects lp;
	
	@Given("user is in Login page")
	public void user_is_in_login_page() 
	{
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		driver = new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() 
	{
//		driver.findElement(By.id("")).sendKeys("");
//		driver.findElement(By.id("")).sendKeys("");
		lp = new LoginPageObjects(driver);
		lp.enterUN();
		lp.enterPwd();
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() 
	{
	    lp.clickLogin();
	}

	@Then("user should be redirected to Home page")
	public void user_should_be_redirected_to_home_page() 
	{
		lp.displayHamberger();
	}
}
