package homeWork2;

//6. Print 1 to 1000 by 20 intervals using while loop.
public class Hw06 {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 1000) { // we need 1001 to print up to 1000 with 20 interval??
			System.out.println(i);
			i = i + 20;
		}
	}
}
