package abstract_classes;

public class AbstractMain {

	public static void main(String[] args) {
		//Animal animal = new Animal();//abstract classes cannot be instantiated
		Animal dog = new Dog();
		dog.eat();
		dog.setName("Rexy");
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat(true);
		cat.eat();
		//System.out.println(cat.isSleeping()); methods undefined / not declared in parent cannot be accessed
		cat.makeSound();
		
		Cat newCat = new Cat(false);
		newCat.eat();
		System.out.println("is a sleep: " + newCat.isSleeping());
		newCat.makeSound();
	}

}
