/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    Calculate cal = new Calculate();
    double x = cal.sum(2, 3);
    double y = cal.sum2(1, 10);
    System.out.println(new App().getGreeting());
    System.out.println("Sum of 2 and 3 is " + cal.sum(2, 3) + ".Average is " + x / 2 + ".\n");
    System.out.println("Sum of 1 to 10 is "+cal.sum2(1,10)+".Average is "+x/2 +".\n")
  }
}
