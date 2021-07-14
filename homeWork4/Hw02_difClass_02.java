package homeWork4;
/*
 *Q:2-Create public, private, protected & default methods & call them in different classes, Package class respectively
 */

public class Hw02_difClass_02 {

	public static void main(String[] args) {
		// This is different class

		// Called by Class name
			Hw02_sameClass_01.test01(); // Public > Same Project
		//	Hw02_sameClass_01.test02(); // Private> Same Class, Not able to call, here error
			Hw02_sameClass_01.test03(); // Protected> Same Package
			Hw02_sameClass_01.test04(); // Default> Same Package

			System.out.println();	// for new line

		// Called by creating object
			Hw02_sameClass_01 obj = new Hw02_sameClass_01();
			obj.test01(); // Public > Same Project
		//	obj.test02(); // Private> Same Class, Not able to call, here error
			obj.test03(); // Protected> Same Package
			obj.test04(); // Default> Same Package
	}

}
