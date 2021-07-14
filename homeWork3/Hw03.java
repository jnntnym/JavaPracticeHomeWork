package homeWork3;
//3.Create 6 static & non-static method- Call them in the main method
public class Hw03 {

	public static void test1() {
		System.out.println("This is test1- 1st Static method");
	}

	public static void test2() {
		System.out.println("This is test2- 2nd Static method");
	}

	public static void test3() {
		System.out.println("This is test3- 3rd Static method");
	}

	public void practice1() {
		System.out.println("This is practice1- 1st Non-Static method");
	}

	public void practice2() {
		System.out.println("This is practice2- 2nd Non-Static method");
	}

	public void practice3() {
		System.out.println("This is practice3- 3rd Non-Static method");
	}

	public static void main(String[] args) {
		// Calling Static Method

		test1();
		test2();
		test3();

		System.out.println("**************");
		// Calling Non Static Method

		Hw03 obj = new Hw03();

		obj.practice1();
		obj.practice2();
		obj.practice3();

	}

}
