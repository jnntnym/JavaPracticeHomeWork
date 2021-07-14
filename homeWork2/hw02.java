package homeWork2;
//2. Using switch concept find out Wednesday from a week, number the days 1-7

public class hw02 {

	public static void main(String[] args) {

		int day = 3; // Wednesday, week starts from Monday

		switch (day) {

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Weekdays not matched");
			break;
		}

	}

}
