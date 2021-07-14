package homeWork4;
/*
 *Q:7-Create a method with passing 5 integer parameters and implement if else example inside of the method and return the decision and call in the main method
 */

public class Hw07 {
	
	public static int met01(int n1, int n2, int n3, int n4, int n5) {
		int total = n1+n2+n3+n4+n5;

		if (total<100) {
			System.out.println("I am able to buy a product");
			
		} else {
			System.out.println("Out of my budget");

		}
		return total;
		
	}
	public static void main(String[] args) {
		
		met01(5, 10, 15, 20, 25);		// total = 75 < 100
	}									// I am able to buy a product

}
