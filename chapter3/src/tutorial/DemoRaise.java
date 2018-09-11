package tutorial;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter salary");
		double salary = input.nextDouble();

        
        System.out.println("Demonstrating some raises");
        
       
        predictRaise(salary);
       
	}
	
	public static void predictRaise(double salary)
	{
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE;
		System.out.println("Current salary: " + salary + " After raise: " + newSalary);
	}

}
