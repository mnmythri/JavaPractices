package InnerClassP;


//Purpose of Nested class: to group classes that belong together, 
//which makes your code more readable and maintainable.
//To access the inner class, create an object of the outer class, 
//and then create an object of the inner class:


class OuterClass {
	  int x = 10;

	  class InnerClass {
	    int y = 5;
	  }
	}

	public class MyMainInnerClass {
	  public static void main(String[] args) {
		  
		// create an object of outer class
	    OuterClass myOuter = new OuterClass();
	    
	 // create an object of inner class Processor using outer class
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);
	  }
	}
