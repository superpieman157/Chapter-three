package exersizes;
import java.util.Scanner;
public class quartToGallon {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub

		
		Scanner input = null;
		
		int quartsNeeded;
		System.out.println("How Many Quarts");
		quartsNeeded = input.nextInt();
		Scanner input1 = new Scanner(System.in);
		
		displayConversion(quartsNeeded);
		
	}
	public static void displayConversion(int quartsNeeded) {
		
		final int quartsInGallons = 4;
		int extraQuarts;
		int gallonsNeeded;
		
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		System.out.println("You have " + gallonsNeeded + " gallons and " 
				+ extraQuarts + " quarts left over");
		
	}

}
