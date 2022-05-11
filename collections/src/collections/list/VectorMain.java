package collections.list;

import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> vector = new Vector<>();
		vector.add(new Student());
		vector.add(new Teacher());
		vector.add(new HOD());
		
		for (Object object : vector) {
			System.out.println(object);
		}
		
		System.out.println(vector.get(0));
	}

}

class Student{
	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

class Teacher{
	@Override
	public String toString() {
		return "Teacher [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

class HOD{
	@Override
	public String toString() {
		return "HOD [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}