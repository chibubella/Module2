import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductOfTwoIntegers {

	public static void main(String[] args) {
		boolean done = false;
		while(!done) {
			Scanner scan = new Scanner(System.in); //create a scanner for user console input
				
			try 
			{
				System.out.println("Enter two integers to multiply ");
				int x = scan.nextInt();
				int y = scan.nextInt();
			
				done = true;
				System.out.println("The product of " + x +" and "+ y + " is " + (x*y));
			}
			
			catch (InputMismatchException e) {
				System.out.println("Entries must be integers");
			}
			scan.close();
		}
	}
	
	public static void main2 (String[] args) {
		boolean done = false;
		while(!done) {
			Scanner scan = new Scanner(System.in); //create a scanner for user console input
				System.out.println("Enter two integers to multiply ");
				int x = 0;
				int y = 0;
				if(scan.hasNextInt()) {
					x = scan.nextInt();
					if(scan.hasNextInt()) {
						y = scan.nextInt();
						done = true;
					}
					else System.out.println("You can only input integers");}
				else System.out.println("You can only input integers");
					
			done = true;
			System.out.println("The product of " + x +" and "+ y + " is " + (x*y));
			scan.close();
		}
		
}
}