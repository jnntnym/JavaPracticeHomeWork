package homeWork4;
/*
 * Q:6 -Create a method with passing three string parameter, add all string values inside of the method and return as string method and also call in the main method twice with different values
 */
public class Hw06 {

	public static String str01(String st1, String st2, String st3) {
		String myValue = st1+" "+st2+" "+st3;
		System.out.println(myValue);
		return myValue;
	}
	public static void main(String[] args) {
		str01("My Name", "is", "Nayeem");
		str01("My Name", "is", "Jony");
		
	}

}
