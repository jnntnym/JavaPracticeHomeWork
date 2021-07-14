package homeWork4_1;

import homeWork4.Hw02_sameClass_01;

/*
 *Q:2-Create public, private, protected & default methods & call them in different classes, Package class respectively
 */
public class Hw02_difPackage_03 {

	public static void main(String[] args) {
		// This is different package class
		
		// Called by creating object
		Hw02_sameClass_01 obj = new Hw02_sameClass_01();
			obj.test01(); // Public > Same Project
		//	obj.test02(); // Private> Same Class, Not able to call, here error
		//	obj.test03(); // Protected> Same Package, Not able to call, here error
		//	obj.test04(); // Default> Same Package, Not able to call, here error
		
	}

}
