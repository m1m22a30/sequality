/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void appHasAGreeting() {
    App classUnderTest = new App();
    Calculate cal = new Calculate();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    System.out.println("Sum of 2 and 3 is " + cal.sum(2, 3) + ".Average is " + x / 2 + ".\n");
    System.out.println("Sum of 1 to 10 is " + cal.sum2(1, 10) + ".Average is " + y / 10 + ".\n");
    System.out.println("Sum of odd of 1 to 10 is " + cal.suma(1, 10) + ".Sum of even is " + cal.sumeven(1, 10) + ".\n");
  }

  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
  }
}
