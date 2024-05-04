package testNGtestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class usttestNG2{
  @Test
  public void c() {
	  System.out.println("c SECOND CLASS is executing");
  }
  
  @BeforeSuite
  public void runbeforeAll() {
	  System.out.println("BEFORE SUITE FROM SECOND CLASS");
  }
	  
	  @BeforeClass
	  public void befClass()
	  {
		  System.out.println("RUNNING BEFORE CLASSES FROM SECOND ustTestNG"); 
	  }
	  
	  @Test
	  
	  public void d()
	  {
		  System.out.println("d second class is executing");
	  
  }
}
