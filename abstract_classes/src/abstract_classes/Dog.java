package abstract_classes;

public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Woof Woof\n");
	}
	
	public void displayDogBreed() {
		System.out.println("Doberman\n");
	}

}
