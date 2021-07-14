package homeWork4;
//Q-1:Create a class with 4 static & non-static method & call them in another class main method
public class Hw_01 {

	public static void main(String[] args) {

	// Calling Static method from another class
		Hw01.test1();
		Hw01.test2();	// by class name
		
	// Calling non static method	
		Hw01 obj = new Hw01();
		obj.test3();
		obj.test4();	// by creating object
	
	}

}
