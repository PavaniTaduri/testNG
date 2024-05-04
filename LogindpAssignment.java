package testNGtestcases;

import org.testng.annotations.Test;

import utils.ExcelApiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class LogindpAssignment {
	static WebDriver driver;
	static boolean res;
	String xlFilePath = "C:\\Users\\Administrator\\Downloads\\excel.xlsx";
	String sheetName = "Sheet1";
ExcelApiTest eat = null;
	
	public LogindpAssignment(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver = driver;
}
	@Test (dataProvider = "dp")
	   	
  public void login(String u, String p) {
		
		System.out.println("Username:" + u + " Password " + p);
  
	res = u.equals("tomsmith") ? true : false;
	
	Assert.assertEquals(true,res);	
}
	@DataProvider(name="dp")
    public Object[][] userdata() throws Exception {
     	Object [][] data = readfromexcel(xlFilePath, sheetName);
          return data;
      
     }     
	
  
public Object[][] readfromexcel(String xlFilePath, String sheetName) throws Exception
{
    Object[][] excelData = null;
    eat = new ExcelApiTest(xlFilePath);
    int rows = eat.getRowCount(sheetName);
    int columns = eat.getColumnCount(sheetName);
             
    excelData = new Object[rows-1][columns];
     
    for(int i=1; i<rows; i++)
    {
        for(int j=0; j<columns; j++)
        {
            excelData[i-1][j] = eat.getCellData(sheetName, j, i);
        }
         
    }
    return excelData;
}


By username = By.id("username");
By password = By.id("password");
By loginbtn = By.cssSelector("#login > button");



public void fillUsername()
{
	driver.findElement(username).sendKeys();
}

public void fillPassword()
{
	driver.findElement(password).sendKeys();
}

public void clickLoginBtn()
{
	driver.findElement(loginbtn).click();
	
}
static By flashsuccess = By.xpath("//*[@class=\"flash success\"]");


// method to check if success msg is displayed
	
	public static boolean isLoginSuccess()
	{
try
{
	driver.findElement(flashsuccess);
	res = true;
}

catch (NoSuchElementException n)
{
	res = false;
}

return res;

	}
}





	


















