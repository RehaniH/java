package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		
		//equals operator checks for content
		String s1 = new String("contains");
		String s2 = new String("contains");
		System.out.println(s1.equals(s2));
		
		//objects with same content is not regarded as same
		Employee e1 = new Employee(1, "saman", 12000d);
		Employee e2 = new Employee(1, "saman", 12000d);
		System.out.println(e1.equals(e2));
		
		Set<Integer>set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(null);
		set.add(null);
		
		//set cannot have duplicate elements
		System.out.println(set);
		System.out.println(set.add(2));
		System.out.println(set.add(4));
		System.out.println(set);
		
		Iterator<Integer> iterator = set.iterator();
		
		//throws java.util.ConcurrentModificationException when modified after iterator is defined.
		set.add(5);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

class Employee{
	private int empNo;
	private String ename;
	private Double salary;
	
	public Employee(int empNo, String ename, Double salary) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
