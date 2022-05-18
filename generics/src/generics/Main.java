package generics;

public class Main {

	public static void main(String[] args) {

		Box<String> box  = new Box<>();
		box.setValue("Some Value");
		
		Box<Float> box2 = new Box<>();
		box2.setValue(67.02f);
		
		Box<Integer> box3 = new Box<>();
		box3.setValue(45);
		
		String combined = box.getValue() + " "  +box2.getValue() +" " + box3.getValue();
		System.out.println(combined);
		
	}

}
