package inheretance;

public class MultiLevelInheretance {

	public static void main(String[] args) {
		A ab = new B();
		ab.display();
		ab.displayValue();
		
		System.out.println();
		A ac = new C();
		ac.display();
		ac.displayValue();
		
		System.out.println();
		System.out.println(A.CONSTANT_VALUE);
		System.out.println(B.CONSTANT_VALUE);
		System.out.println(C.CONSTANT_VALUE);
	}
}

class A{
	
	private int value = 10;
	public static int CONSTANT_VALUE = 1;
	protected void display() {
		System.out.println("Display method in A");
	}
	public void displayValue() {
		System.out.println("Value in A = " + this.value);
	}
}

class B extends A{
	protected int value = 20;
	//public static int CONSTANT_VALUE = 2; inhereted from A
	
	protected void display() {
		super.display();
		System.out.println("Display method of B");
	}
	public void displayValue() {
		System.out.println("Value in B = " + this.value);
	}
}

class C extends B{
	
	private int value = 30;
	public static int CONSTANT_VALUE = 3;
	
	//can increase visibility but not decrease
	public void display() {
		System.out.println("Display method of C");
		super.display();
	}
	
	public void displayValue() {
		System.out.println("Value of B in C = " + super.value);
		System.out.println("Value in C = " + this.value);
	}
}
