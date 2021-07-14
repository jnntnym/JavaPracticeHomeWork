package homeWork4_1; // this is another package
/*
 *Q:3 -Create different scenarios where you can use extends & class references (use at least three or more classes to create scenarios) 
 */

import homeWork4.Hw02_sameClass_01; // import the parent class

public class Hw03_extendClassDifferentPackage_02 extends Hw02_sameClass_01 { // here we extend the class

	public static void main(String[] args) {
	// When we extends the class under different package, we can able to call only
	// Public and Protected methods,
	// because Private works only same class and default works in same package

		test01(); 	// Public > Same Project
	//	test2(); 	// Private> Same Class, Not able to call, here error
		test03(); 	// Protected> Same Package, works when we extends
	// 	test04(); 	// default> Same Package, Not able to call, here error

	}

}
	