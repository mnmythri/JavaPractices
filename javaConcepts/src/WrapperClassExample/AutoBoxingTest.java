package WrapperClassExample;

public class AutoBoxingTest {
	   public static void main(String args[]) {
	      int num = 10; // int primitive
	      Integer obj = Integer.valueOf(num); // creating a wrapper class object
	      System.out.println(num + " " + obj);
	   }
	}
