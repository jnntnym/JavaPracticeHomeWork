package homeWork3;
//8.Create an array list and add 5 integer values then print them in a same line and then add 3 more integer values then print again
import java.util.ArrayList;
import java.util.List;

public class Hw08 {

	public static void main(String[] args) {
		
		List num = new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		System.out.println(num);	// Print in a same line // For loop: Print in a multiple line
		
		num.add(60);
		num.add(70);
		num.add(80);
		
		System.out.println(num);	// Print in a same line // For loop: Print in a multiple line
		
	}

}
