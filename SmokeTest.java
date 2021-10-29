package example;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest {
  @Test
  public void smoke1() {
	  Reporter.log("smoke test 1", true);
  }
  @Test
  public void smoke2() {
	  Reporter.log("smoke test 2", true);
  }
}
