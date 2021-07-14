package homeWork4;
/*
 * Q:4 -Create a method with passing two parameters and call twice with different values in the main method 
 */
public class Hw04 {
	
	public static void met1(String str, int num) {
		System.out.println("Name:"+str+", "+"Id:"+num);
		
	}
	public static void main(String[] args) {
		met1("Nayeem", 566);
		met1("John", 788);
	}

}
