package homeWork3;
//5.Create an array with 6 string values and print them in separate lines
import java.util.Arrays;

public class Hw05 {

	public static void main(String[] args) {

		String [] st = {"I", "am", "Learning", "Java", "From", "TalentTek"};
		
		for(int i=0; i<st.length; i++) {	// For loop: helps to print separate line
			System.out.println(st[i]);
		}
		
//		System.out.println(st[0]+"\n"+st[1]+"\n"+st[2]+"\n"+st[3]+"\n"+st[4]+"\n"+st[5]);	//traditional way	
		
		System.out.println(Arrays.toString(st));	// Print in a same line

//		String[] str = new String[6];

//		str[0]= "I";
//		str[1]= "Am";
//		str[2]= "Learning";
//		str[3]= "Java";
//		str[4]= "From";
//		str[5]= "TalentTek";
//		
//		System.out.println(str[0]);
//		System.out.println(str[1]);
//		System.out.println(str[2]);
//		System.out.println(str[3]);
//		System.out.println(str[4]);
//		System.out.println(str[5]);
		
//		System.out.println(str[0]+"\n"+str[1]+"\n"+str[2]+"\n"+str[3]+"\n"+str[4]+"\n"+str[5]);
		
	}

}
