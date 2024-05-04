package testNGtestcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ustTestNG1 {
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("RUNNING BEFORE CLASSES FROM FIRST usttestNG");
	}
  @Test(dependsOnMethods = "b")
  public void a() {
	  System.out.println("a is running");
  }
  @Test
  
  public void b() {
	  System.out.println("b is running");
  }
}
