package inheretance;

public class MultipleInheretance {

	public static void main(String[] args) {

		System.out.println(InterfaceA.value);
		System.out.println(InterfaceB.value);
		//System.out.println(InterfaceC.value); //error occurs as the values are ambiguous
	}

}

interface InterfaceA{
	int  value = 10;
	void meth();
}

interface InterfaceD{
	int  value = 20;
}

interface InterfaceB extends InterfaceA{
	int  value = 20;
}

interface InterfaceC extends InterfaceB, InterfaceD{
	//int  value = 30; removed to resolve conflicts
}
