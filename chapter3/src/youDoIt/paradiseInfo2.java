package youDoIt;
import java.util.Scanner;
public class paradiseInfo2 {

	public static void main(String[] args){
		double price;
		double discount;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter cutoff price for discount ");
		price = keyboard.nextDouble();
		
		System.out.println("Enter discount rate as a whole number ");
		discount = keyboard.nextDouble();
		
		savings = computeDiscountInfo(price, discount);
	}
	
public static void displayInfo(double price, double discount) {
		
		double savings;
		
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any servece order" + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's Savings of at least $" + savings);
    	   
       }

	private static double computeDiscountInfo(double price, double discount) {

		double savings;
		
		savings = price * discount / 100;
		return savings;
	}
	
}
