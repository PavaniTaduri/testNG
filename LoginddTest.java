package testNGtestcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginddTest {
	
	boolean res;
	
	@DataProvider
	public  Object[][]  dp(){
		return  new Object[][]
				{
			new Object[] {"abc" , "dddd"},
			new Object[] {"tomsmith", "SuperSecretPassword!"},
				};
	}
  @Test(dataProvider = "dp")
  public void login(String u, String p) {
	  
	  System.out.println("username" + u + " Password " + p);
	  res = u.equals("tomsmith")? true : false;
	  Assert.assertEquals(true, res);
  }
}
