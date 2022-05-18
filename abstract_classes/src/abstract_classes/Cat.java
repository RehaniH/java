package abstract_classes;

public class Cat extends Animal{

	private boolean isSleeping;
	
	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

	public Cat(boolean isSleeping) {
		super();
		this.isSleeping = isSleeping;
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow\n");
	}
	
	public boolean isSleeping() {
		isSleeping = true;
		return isSleeping;
	}

}
