package static_keyword;

public class StaticBlockMain {
	
	static int a = 3;
	static int b;
	
	static void method(int x) {
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		System.out.println("In main method.");
		method(4);
		//System.out.println(getNumberValue(8)); error
		//static methods could only invoke static methods
	}
	
	static {
		System.out.println("Static block initialized");
		b = a * 4;
	}
	
	public int getNumberValue(int a) {
		return a*a;
	}
	
	{
		System.out.println("instance block");
	}

}
