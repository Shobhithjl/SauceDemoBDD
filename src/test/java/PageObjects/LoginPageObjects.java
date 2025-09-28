package PageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects 
{
	@FindBy(id="user-name")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login-button")
	private WebElement btnLogin;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement itemHamburger;
	
	
	public LoginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterUN()
	{
		txtUserName.sendKeys("standard_user");
	}
	
	public void enterPwd()
	{
		txtPassword.sendKeys("secret_sauce");
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void displayHamberger()
	{
		assertTrue(itemHamburger.isDisplayed());
	}
	
	public void displayLoginPage()
	{
		assertTrue(txtUserName.isDisplayed());
	}
}
