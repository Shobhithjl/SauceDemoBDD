package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageObjects 
{
	@FindBy(id="react-burger-menu-btn")
	private WebElement menuHamburger;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement logoutLink;
	
	public DashboardPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void hamburgerClick()
	{
		menuHamburger.click();
	}
	
	public void logoutClick()
	{
		logoutLink.click();
	}
}
