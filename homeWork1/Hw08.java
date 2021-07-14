package homeWork1;
//"New technology is common, new thinking is rare"

//8. Declare above string a variable & find out the length of it
//9. Find out "common" & "thinking" from String using substring
//10.Find out "technology " & "rare" using split.

public class Hw08 {	// HW 08, 09 AND 10 

	public static void main(String[] args) {

		String str = "New technology is common, new thinking is rare";
		
		System.out.println(str.length()); // Q:8  Ans: 46
		
		System.out.println(str.substring(18, 24)); // Q:9 Ans: common

		System.out.println(str.substring(30, 38)); // Q:9 Ans: thinking
		
		String[]sp = str.split(" ");
		System.out.println(sp[1]+" "+sp[7]);	// Q:10 Ans: technology rare
		
		
		
	}
}
