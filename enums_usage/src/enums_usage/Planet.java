package enums_usage;

public enum Planet{

	EARTH(5.976e+24, 6.37814e6), 
	MARS(6.421e+23, 3.3972e6), 
	JUPITER(1.9e+27,   7.1492e7), 
	STATURN(5.688e+26, 6.0268e7), 
	URANUS(8.686e+25, 2.5559e7), 
	NEPTUNE(1.024e+26, 2.4746e7); //omit semicolon when no properties or methods present

	private double mass;
	private double radius;
	private static final double G = 6.67300E-11;
	
	//constructor should be package private / private since the constructor is called automatically and not by developer
	Planet(double mass, double radius){
		this.mass = mass;
		this.radius = radius;
	}
	
	double mass() {
		return this.mass;
	}
	
	double radius() {
		return this.radius;
	}
	
	double surfaceGravity() {
		return (G * this.mass )/ (this.radius * this.radius); 
	}
	
	double surfaceWeight(double otherMass) {
		return otherMass * surfaceGravity();
	}
	
	
	
}
