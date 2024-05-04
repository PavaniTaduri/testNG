package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import HerokuPages.LandingPage;
import HerokuPages.LoginPage;

public class LoginPageTestCases {
	
	static WebDriver driver;
	static LoginPage lp;
	static LandingPage landingpage;
	boolean res;
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	
	@BeforeClass
	public void initDriver()
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		lp = new LoginPage(driver);
		landingpage = new LandingPage(driver);  	
	}
	
	
	@Test
  public void chkTitleOfLoginPage () {
	  
	 res= lp.chkTitle("The Internet");
	  
	Assert.assertEquals(true,res);  
  }
	@Test
	public void chkToSeeIfFooterIsThere ()
	{
		
		Assert.assertEquals(true, lp.chkPageFooter());
		
	}
	
	@Test
	public void chkToSeePasswordMasked()
	{
		Assert.assertEquals(true, lp.isPasswordMasked());
	}
	
	@Test
	public void doLogin()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSecretPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(true,landingpage.isLoginSuccess());
		
	}
	@Test
	public void doLoginNegativeSecurity()
	{
		lp.fillUsername("tomsmith");
		lp.fillPassword("SuperSPassword!");
		lp.clickLoginBtn();
		
		Assert.assertEquals(false,landingpage.isLoginSuccess());
		
	}
	
	
}