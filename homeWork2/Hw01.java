package homeWork2;
//1.Using if-else concept buy an item which is priced $100 and less than $200 between 4 stores & make sure the third store has the item.
public class Hw01 {

	public static void main(String[] args) {

		int price = 100;

		int store1 = 150;
		int store2 = 175;
		int store3 = 100; // Here the price matched
		int store4 = 200;

		if (price == store1) {
			System.out.println("I can buy from this Store1");
		} else if (price == store2) {
			System.out.println("I can buy from this Store2");

		} else if (price == store3) {
			System.out.println("I can buy from this Store3");
		} else if (price == store4) {
			System.out.println("I can buy from this Store4");

		} else {
			System.out.println("I Can't buy, Price is not matched");
		}

	}
}
