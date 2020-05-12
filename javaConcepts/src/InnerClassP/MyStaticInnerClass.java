package InnerClassP;

//just like static attributes and methods, a static inner class does not have access to members of the outer class.

//An inner class can also be static, which means that you can access it without creating an object of the outer class.

class OuterClass1 {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}

	public class MyStaticInnerClass {
	  public static void main(String[] args) {
	    OuterClass1.InnerClass myInner = new OuterClass1.InnerClass();
	    System.out.println(myInner.y);
	  }
	}
	
	
