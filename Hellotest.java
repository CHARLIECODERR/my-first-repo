public class HelloTest {
  public static void main(String[] args){
    if (Hello.isPositive(5)) {
      System.out.println("Test Passed : 5 is  positive");
    } else {
       System.out.println("Test failed");
    }
    if (Hello.isPositive(-3)) {
       System.out.println("Test Passed : -3 is  pnot ositive");
    } else {
       System.out.println("Test failed");
    }
  }
}
