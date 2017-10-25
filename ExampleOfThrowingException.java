
public class ExampleOfThrowingException {

	public static void main(String[] args) {

		try {
			doubleUp(5.0);
		}
		catch (Exception e) {
			System.out.println("Number must be between 10 and 20 " + e.getMessage());
		}
	}
	
	public static double doubleUp (double x) throws Exception {
		double result = 0;
		if (x>=10 && x<=20) {
			result =  x*2;
		}
		else throw new Exception();
		return result;
	}

}
