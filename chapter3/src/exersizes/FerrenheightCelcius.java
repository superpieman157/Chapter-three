package exersizes;
import java.util.Scanner;
public class FerrenheightCelcius {
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter temp at eight in ferrenheight");
		double ferrenheight1 = inputDevice.nextDouble();
       
		
        Scanner inputDeviceAtNoon = new Scanner(System.in);
        System.out.println("Please enter temp at noon in ferrenheight");
		double ferrenheightAtNoon = inputDeviceAtNoon.nextDouble();
        
        Scanner inputDeviceAtNine = new Scanner(System.in);
        System.out.println("Please enter temp at nine in ferrenheight");
		double ferrenheightAtNine = inputDeviceAtNine.nextDouble();
        
		Temp(ferrenheight1, ferrenheightAtNoon, ferrenheightAtNine);
		
	}
	public static void Temp(double ferrenheight, double ferrenheightAtNoon, double ferrenheightAtNine) {
		
		 double tempAtEight;
	        double celcius = (ferrenheight - 32) / 1.8;
	        
	        System.out.println("Here Is Temp At Eight In Ferrenheit: " + ferrenheight + " And here is temp at eight in celcius " + celcius);
		
	        double tempAtNoon;
	        double celciusAtNoon = (ferrenheightAtNoon - 32) / 1.8;
	        
	        System.out.println("Here Is Temp At Noon In Ferrenheit: " + ferrenheightAtNoon + " And here is temp at noon in celcius " + celciusAtNoon);
	        
	        double tempAtNine;
	        double celciusAtNine = (ferrenheightAtNine - 32) / 1.8;
	        
	        System.out.println("Here Is Temp At Nine In Ferrenheit: " + ferrenheightAtNine + " And here is temp at nine in celcius " + celciusAtNine);
	}

}
