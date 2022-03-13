package basicprogramming;


public class Sample {
	
	public static void demo() {
		
	
	System.out.println(" using  static method");

	}

	public void test() {
		 
		System.out.println(" using non static method");
		
	}
	public static void main(String[] args) {
		demo();
		
		Sample ref= new Sample();
		ref.test();
	}
}
