package homeWork4;
/*
 * Q:2-Create public, private, protected & default methods & call them in different classes, Package class respectively
 */

public class Hw02_sameClass_01 {

	public static void test01() {
		System.out.println("This is Public Access Modifier > Same Project");

	}

	private static void test02() {
		System.out.println("This is Private Access Modifier > Same Class");

	}

	protected static void test03() {
		System.out.println("This is Protected Access Modifier > Same Package");

	}

	static void test04() {
		System.out.println("This is default Access Modifier > Same Package");
	}

	public static void main(String[] args) {	// Call from same class

		test01(); // Same Project
		test02(); // Same Class
		test03(); // Same Package
		test04(); // Same Package

	}

}
