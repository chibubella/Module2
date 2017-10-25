
public class Enumerations {
	private static Enumerations myObj;

	enum Names{Mary, John, Doe};
	public static void main(String[] args) throws Exception {
		myObj = null;
		myObj.useTheName("Aaron");
		
	}
	
	String useTheName (String s) throws Exception{
		if (s.equalsIgnoreCase("Mary")|| s.equalsIgnoreCase("Doe")) {
			//do something
			return s;
		}
		else throw new Exception();
	}

	//Enumeration creates easier comparison than stacked if statements
	Names useTheName (Names s) throws Exception {
		return s;
	}
}

//equalsIgnoreCase makes the String not case-sensitive.