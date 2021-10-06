package cs520.hw2.part1;

public class TuitionObjectStyle {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		Course course2 = new Course();
		
		course1.getCourseName();
		course1.getNumberofCredits();
		course1.getCostperCredit();
		course1.printTuitionDetails();

		course2.getCourseName();
		course2.getNumberofCredits();
		course2.getCostperCredit();
		course2.printTuitionDetails();
	}

}
