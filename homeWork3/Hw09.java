package homeWork3;
//9.Create an array list and add 10 integer values then print only 5 & 7 position values
import java.util.ArrayList;
import java.util.List;

public class Hw09 {

	public static void main(String[] args) {
		List num = new ArrayList<>();

		num.add(1);	// 0
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);	// 5
		num.add(7);
		num.add(8);	// 7
		num.add(9);
		num.add(10);

		System.out.println("5th position: " + num.get(5));
		System.out.println("7th position: " + num.get(7));
	}

}
