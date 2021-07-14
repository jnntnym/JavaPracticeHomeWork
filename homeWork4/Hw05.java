package homeWork4;
/*
 *Q:5 -Create a method with passing three integer parameters and multiply all values inside of the method and return the multiply value then call this method to the main method & add 100 with it and print 
 */

public class Hw05 {
	public static int test01(int a, int b, int c) {
		int total= a*b*c;
		System.out.println(total+100);	// 8 +100
		return total;
	}
	public static void main(String[] args) {
		test01(2, 2, 2);		//108
		
	}
	
}
 