package abstract_classes;

public abstract class Animal {
	private String name;
	public Animal() {
		super();
		name = "Animal";
	}
	public abstract void makeSound();
	public void eat() {
		System.out.println("I am eating - " + this.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
