package WrapperClassExample;

public class UnboxingTest {
	   public static void main(String args[]) {
	      Integer obj = new Integer(10); // Creating Wrapper class object
	      int num = obj.intValue(); // Converting the wrapper object to primitive datatype
	      System.out.println(num + " " + obj);
	   }
	}