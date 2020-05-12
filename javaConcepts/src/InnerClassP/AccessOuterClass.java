package InnerClassP;

//One advantage of inner classes, is that they can access attributes and methods of the outer class:

class OuterClass2 {
	  int x = 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}


public class AccessOuterClass {

	 public static void main(String args[]) {
		    OuterClass2 myOuter = new OuterClass2();
		    OuterClass2.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.myInnerMethod());
		  }

}
