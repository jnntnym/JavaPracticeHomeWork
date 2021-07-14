package homeWork2;

//7. Print 999 to -888 by 100 intervals using do while loop.
public class Hw07 {

	public static void main(String[] args) {

		int i = 999;
		do {
			System.out.println(i);
			i = i - 100;

		} while (i >= -888); // we need -999 to print up to -888 with 100 interval?
	}
}
