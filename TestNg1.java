package testNGtestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNg1 {
	
  @Test
  public void a() {
	  System.out.println("Iam in first class method a");
  }
  @Ignore
  
  @Test
  
  public void b() {
	  System.out.println("Iam in first class method b");
	  
  }
	  @Test
	  
	  public void c() {
		  System.out.println("Iam in first class method c");
  }
}

