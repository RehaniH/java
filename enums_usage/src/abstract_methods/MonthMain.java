package abstract_methods;

public class MonthMain {

	public static void main(String[] args) {

		for (Month month : Month.values()) {
			System.out.println(month.toString().toLowerCase() + " : " + month.getNumbericalMonthValue() + " month");
		}
	}

}
