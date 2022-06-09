package enums_usage;

public class DayEnumTest {

	Day day;
	DayEnumTest(Day day){
		this.day = day;
	}
	
	void displayStatus() {
		
		//enums could be used in switch statements like integers and chars.
		switch(day) {
		case MONDAY: System.out.println("It has been a long day");
		break;
		case FRIDAY: System.out.println("Relaxed and motivated");
		break;
		case SATURDAY:
		case SUNDAY: System.out.println("Weekends are the best !");
		break;
		default: System.out.println("Mid Week days are also awesome.");
		}
	}
	public static void main(String[] args) {
		DayEnumTest tuesday = new DayEnumTest(Day.TUESDAY);
		tuesday.displayStatus();
		
		DayEnumTest saturday = new DayEnumTest(Day.SATURDAY);
		saturday.displayStatus();
		
		DayEnumTest friday = new DayEnumTest(Day.FRIDAY);
		friday.displayStatus();
		
		
	}

}
