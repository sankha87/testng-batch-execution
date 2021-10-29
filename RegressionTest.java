package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RegressionTest {
  @Test
  public void reg1() {
	  Reporter.log("regression 1", true);
  }
  @Test
  public void reg2() {
	  Reporter.log("regression 2", true);
  }
  @Test
  public void reg3() {
	  Reporter.log("regression 3", true);
  }
  @Test
  public void testReg() {
	  Reporter.log("testReg", true);
  }
}
