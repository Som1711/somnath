package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest02 {
  @Test (priority=1,invocationCount=2)
  public void A() {
	  System.out.println("A test");
  }
  @Test(priority=-1)
  public void Z() {
	  System.out.println("Z test");
  }
  @Test(priority=2)
  public void R() {
	  System.out.println("R test");
	  Assert.assertTrue(false);
  }
  @Test(priority=2,dependsOnMethods= {"R"})
  public void H() {
	  System.out.println("H test");
  }
  @Test(priority=3)
  public void N() {
	  System.out.println("N test");
  }
}
