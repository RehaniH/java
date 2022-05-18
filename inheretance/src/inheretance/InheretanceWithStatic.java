package inheretance;

public class InheretanceWithStatic {

	public static void main(String[] args) {
//		ClassA ab = new ClassB();
//		ab.display();
//		System.out.println();
		
//		ClassA ac = new ClassC();
//		ac.display();
//		System.out.println();
		
		ClassB bc = new ClassC();
		bc.display();

	}

}

class ClassA{
	static {
		System.out.println("Static block Class A");
	}
	
	{
		System.out.println("Instance block Class A");
	}
	
	public void display() {
		
		System.out.println("ClassA display method.");
	}
}//end class A

class ClassB extends ClassA{
	static {
		System.out.println("Static block Class B");
	}
	public void display() {
		super.display();
		System.out.println("ClassB display method.");
	}
	{
		System.out.println("Instance block Class B");
	}
}//end class B

class ClassC extends ClassB{
	static {
		System.out.println("Static block Class C");
	}
	{
		System.out.println("Instance block Class C");
	}
	public void display() {
		super.display();
		System.out.println("ClassC display method.");
	}
}//end class C