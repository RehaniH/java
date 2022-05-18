package basics;

public class Hello {

	public static void main(String[] args) {
		System.out.print("hello");
		System.out.println("a new line added after code");
		System.out.print("this is printed on next line");
		
	//	String[] stringargs = new String[5];
	//	main(stringargs); recursive -> runtime exception
		main();
		main(30);
//		System.out.println();
//		System.out.println();

	}
	
	public static void main() {
		System.out.println("Overloaded main method 1");	
	}
	
	public static void main(int a) {
		System.out.println("Overloaded main method 2 :" + a );	
	}

}
