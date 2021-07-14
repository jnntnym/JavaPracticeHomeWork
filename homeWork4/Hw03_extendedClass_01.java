package homeWork4;
/*
 *Q:3 -Create different scenarios where you can use extends & class references (use at least three or more classes to create scenarios)
 */

public class Hw03_extendedClass_01 extends Hw02_sameClass_01{

	public static void main(String[] args) {
	// When we extends the class under same package, we can able to call all methods except Private, 
	// because Private works only same class

		test01();	// Public >		Same Project
	//	test02();	// Private>		Same Class, Not able to call, here error
		test03();	// Protected>	Same Package
		test04();	// Default>		Same Package
		
	}

}
