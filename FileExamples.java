import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;


public class FileExamples {

	public static void main(String[] args) throws Exception{
		File f = new File("src//FileExamples.java");
		System.out.println("Does this file exist? " + f.exists() + ". \nAbsolute path is " + f.getAbsolutePath());
	
		BufferedWriter bw = Files.newBufferedWriter(Paths.get("src/test.txt"),StandardOpenOption.APPEND); //Step 1: Open the file
		//bw.write("Bugs Bunny is a great cartoon. Bella is amazing and Bella is also great!");
		bw.write("Bugs Bunny 123 main Street Statesboro");//Step 2: Write to the file
		bw.newLine();
		bw.write("Daffy Duck 456 E Main Street Statesboro"); 
		bw.newLine();
		bw.write("Elmer Fudd 789 W Main Lane Statesboro");
		bw.newLine();
		bw.close();//Step 3: Close the file
		
		//Reading a text from a file
		ArrayList<String> info = new ArrayList<String>(); //To make sure that you have only unique elements
		BufferedReader br = Files.newBufferedReader(Paths.get("src/test.txt")); //This just opens the file
		//to read the file do
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);//Step 2: read a line from the text file
			if (!info.contains(line)) {
				info.add(line);
			}
			line = br.readLine();
		}
		System.out.println("Number of elements in arraylist is " + info.size());
	
		//br.close();//Step 3: close the file
		
		
}
	
	//everytime you rerun this program. It deletes the old file and creates a new one.
	//if you want to keep the file the way it is and just add to the existing file, you use the method, StandardOpenOption.APPEND
}
