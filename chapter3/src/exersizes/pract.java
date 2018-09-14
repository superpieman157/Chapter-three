package exersizes;
import java.util.Scanner;
public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Please input a number ");
		double x = inputDevice.nextInt();
		
		System.out.println("Please input another number ");
        double y = inputDevice.nextInt();;
        
        displayTwiceNumber(x, y);
        
        displayNumberPlusFive(x, y);
        
        displayPercent(x, y);
	}
public static void displayTwiceNumber(double x, double y) {
	
	double x2;
	double y2;
	
	x2 = x * 2;
	y2 = y * 2;
	System.out.println("x = " + x2 + " y = " + y2);
	
}
public static void displayNumberPlusFive(double x, double y) {
	
	double x5;
	double y5;
	
	x5 = x + 5;
	y5 = y + 5;
	System.out.println("x = " + x5 + " y = " + y5);
}
public static void displayPercent(double x, double y) {
	double compute;
	compute = (x / y) * 100;
	System.out.println(x + " devided by " + y + " = " + compute + "%");
	
}
}
