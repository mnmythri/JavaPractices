package Collections;

public class LinkedList {

	public static void main(String[] args) {
		Object o[] = new Object[100000];
		for(int i=0;i<o.length;i++) {
			o[i]=new Object();
		}
		LinkedList<Object> list = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (Object object : o) {
			list.add(o);
		}
		long end = System.currentTimeMillis();
		System.out.println("total time taken:"+(end - start));
		
	}

}