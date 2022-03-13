package block;

public class Block {
	{              //to call non static bloack we have to create object
		System.out.println("this is non static block");
	}
	
	static //it execute before main method
	{
		System.out.println("this is static block");
	}
	
	public void m1() {
		System.out.println("this is method");
	}
	Block(){
		System.out.println("this is constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("this is main method");
		
		Block b=new Block();
		b.m1();
	}

}
