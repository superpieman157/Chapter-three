package exersizes;
import java.util.Scanner;
public class testPounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please put your weight in pounds");
		double pounds = inputDevice.nextDouble();
		
		poundsToKilos(pounds);
		poundsToOunces(pounds);
		poundsToMilligrams(pounds);
		
	}
public static void poundsToKilos(double pounds) {
	

	double kilos = pounds * 0.45359237;
	System.out.println("Your weight in kilos is " + kilos);
}
public static void poundsToOunces(double pounds) {
	
	double ounces = pounds * 16;
	System.out.println("Your weight in ounces is " + ounces);
}
public static void poundsToMilligrams(double pounds) {
	
	long milligrams = (long) (pounds * 453592);
	System.out.println("Your weight in milligrams is " + milligrams);
}
}
