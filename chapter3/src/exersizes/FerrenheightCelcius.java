package exersizes;
import java.util.Scanner;
public class FerrenheightCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tempAtEight;
        double ferrenheight;
        
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter temp at eight in ferrenheight");
		ferrenheight = inputDevice.nextDouble();
        
        double celcius = (ferrenheight - 32) / 1.8;
        
        System.out.println("Here Is Temp At Eight In Ferrenheit: " + ferrenheight + " And here is temp at eight in celcius " + celcius);
        
        
        double tempAtNoon;
        double ferrenheightAtNoon;
        
        Scanner inputDeviceAtNoon = new Scanner(System.in);
        System.out.println("Please enter temp at noon in ferrenheight");
		ferrenheightAtNoon = inputDeviceAtNoon.nextDouble();
        
        double celciusAtNoon = (ferrenheightAtNoon - 32) / 1.8;
        
        System.out.println("Here Is Temp At Noon In Ferrenheit: " + ferrenheightAtNoon + " And here is temp at noon in celcius " + celciusAtNoon);
        
        
        double tempAtNine;
        double ferrenheightAtNine;
        
        Scanner inputDeviceAtNine = new Scanner(System.in);
        System.out.println("Please enter temp at nine in ferrenheight");
		ferrenheightAtNine = inputDeviceAtNine.nextDouble();
        
        double celciusAtNine = (ferrenheightAtNine - 32) / 1.8;
        
        System.out.println("Here Is Temp At Nine In Ferrenheit: " + ferrenheightAtNine + " And here is temp at nine in celcius " + celciusAtNine);
	}

}
