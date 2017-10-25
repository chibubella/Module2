
public class ExceptionHandling {
	static String s;
	
	public static void main(String[] args) {
		int [] x = new int [4];
		try {
		
		x[0] = 5;
		x[1] = 10;
		s.charAt(0);
		x[2] = 7;
		//int y = 2/0;
		x[3] = 12;
		x[4] = 15;
		System.out.println("The end");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("What you doing dude? That's out of bounds!");
		}
		catch (ArithmeticException e) {
			System.out.println("What you doing dude? Can't divide by zero!");
			
		}
		
		catch (NullPointerException e) {
			System.out.println("What you doing dude? There's no string!");
		}
		
		catch (Exception e)
		{
			System.out.println("What you doing dude? You made a mistake!");
		}
	}

}
