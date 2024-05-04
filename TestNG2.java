package testNGtestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNG2 {
	
  @Test
  public void d() {
	  System.out.println("Iam in first class method d");
  }
  @Ignore
  
  @Test
  
  public void e() {
	  System.out.println("Iam in first class method e");
	  
  }
	  @Test
	  
	  public void f() {
		  System.out.println("Iam in first class method f");
  }
}

