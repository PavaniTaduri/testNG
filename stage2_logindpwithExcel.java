package testNGtestcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelApiTest;

public class stage2_logindpwithExcel {
	boolean res;
	String xlFilePath = "C:\\Users\\Administrator\\Downloads\\excel.xlsx";
	String sheetName = "Sheet1";
ExcelApiTest eat = null;
	
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
	

	/*
	 @DataProvider
	  public Object[][] logindp() {
	    return new Object[][] {
	      new Object[] { "tomsmith", "SuperSecretPassword!" },
	      new Object[] { "someuser", "somewrongpassword" },
	    };
	  }
  */
  
  
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

}



































































































































































































