package InnerClassP;

	//Top level class definition
	class MyOuterClassDemo {
	 int x = 10;

	 // inner class definition
	 class MyInnerClassDemo {
	    public int y;

		public void seeOuter () {
	    	  y = 5;
	    }
	  } // close inner class definition
	} // close Top level class definition

public class PrivateMemberInnerClass {
	public static void main(String[] args) {
	
		MyOuterClassDemo pm = new MyOuterClassDemo();
		MyOuterClassDemo.MyInnerClassDemo pio =  pm.new MyInnerClassDemo();
		System.out.println(pio.y + pm.x);
	}

}

