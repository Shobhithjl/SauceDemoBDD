package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObjects.DashboardPageObjects;
import PageObjects.LoginPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoutStepDefinition
{
	DashboardPageObjects dp;
	LoginPageObjects lp;
	WebDriver driver;
	
	@Given("user is in Dashboard Page")
	public void user_is_in_dashboard_page() 
	{
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		driver = new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		lp = new LoginPageObjects(driver);
		lp.enterUN();
		lp.enterPwd();
		lp.clickLogin();
	}

	@When("user clicks on Logout link")
	public void user_clicks_on_logout_link() 
	{
		
		dp = new DashboardPageObjects(driver);
		dp.hamburgerClick();
	    dp.logoutClick();
	}

	@Then("Login page should get displayed")
	public void login_page_should_get_displayed() 
	{
		lp.displayLoginPage();
	}
}
