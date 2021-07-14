package homeWork1;
//6.Print "more" & "than" from String "Nothing is more effective than sincere" using split concept

public class Hw06 {

	public static void main(String[] args) {

		String str = "Nothing is more effective than sincere";
		
		String[] sp = str.split(" ");
		
		System.out.println(sp[2]+" "+sp[4]);
		
	}

}
