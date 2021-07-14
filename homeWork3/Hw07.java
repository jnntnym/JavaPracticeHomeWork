package homeWork3;
//7.Create an array list and add 10 string values then print them in separate lines
import java.util.ArrayList;
import java.util.List;

public class Hw07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List stv = new ArrayList<>();
		stv.add("A1");
		stv.add("A2");
		stv.add("A3");
		stv.add("A4");
		stv.add("A5");
		stv.add("A6");
		stv.add("A7");
		stv.add("A8");
		stv.add("A9");
		stv.add("A10");
		
		for(int i=0; i<stv.size(); i++)			// For loop and Get method for multiple line print
			System.out.println(stv.get(i));
		
	//	System.out.println(stv);				// Print in a same line
		
	}

}
