package homeWork2;
/*
 * 8. Declare three integer variables and print true & false for below operators
    1. > more than
    2. < less than
    3. == equal to
   4. && (and)
   5. | | (or)
   6. >= more than equal
   7. <=less than equal
 */

public class Hw08 {

	public static void main(String[] args) {

		int n1, n2, n3;

		n1 = 10;
		n2 = 15;
		n3 = 10;

		System.out.println(n2 > n1); // true
		System.out.println(n2 < n1); // false

		System.out.println(n1 == n3); // true

		System.out.println(n1 == n3 && n1 == n2); // false :both condition need to be true for && operation
		System.out.println(n1 == n3 || n1 == n2); // true: when any one condition is true

		System.out.println(n2 >= n1); // true : when any one condition is true
		System.out.println(n2 <= n3); // false: at least one condition need to be true

	
	}

}
