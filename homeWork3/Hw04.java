package homeWork3;
//4.Create three static and non static string, int & boolean variable at class level & call them in three static & non-static method

public class Hw04 {
	// 3 Static Variables
	static String str = "Static str";
	static int num = 150;
	static boolean b = true;
	
	// 3 Non Static Variables
	String str1 = "Non Static String";
	int num1 = 200;
	boolean b1 = false;
	
	// Static Method (Only Static allowed)
	public static void test1() {
		System.out.println("This is Static method");
		System.out.println("Static variables are:"+str+", "+num+", "+b);		//	we can call static variables under static method 
		
	//	System.out.println("Non Static variables are:"+str1+", "+num1+", "+b1);	//	we can not call non static variables under static method; here error
		
		System.out.println("**********************");
	}
	
	//Non Static method(Static + Non Static allowed)
	public void test2() {
		System.out.println("This is Non Static method");
		System.out.println("Static variables are:"+str+", "+num+", "+b);		// we can call static variables under non static method
		
		System.out.println("Non Static variables are:"+str1+", "+num1+", "+b1);	//we can call non static variables under non static method
	}

	public static void main(String[] args) {
		// Calling Static method
		test1();

		// Calling Non Static method 
		Hw04 obj = new Hw04();
		obj.test2();
	}

}
