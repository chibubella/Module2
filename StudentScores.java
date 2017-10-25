import java.util.Arrays;

public class StudentScores {

	public static void main(String[] args) {
		//create students
		Student s1 = new Student();
		s1.setName("Bugs Bunny");
		s1.setSc1(90);
		s1.setSc2(80);
		s1.setSc3(100);
		
		Student s2 = new Student();
		s2.setName("Daffy Duck");
		s2.setSc1(95);
		s2.setSc2(70);
		s2.setSc3(75);
		
		Student s3 = new Student ();
		s3.setName("Elmer Fudd");
		s3.setSc1(100);
		s3.setSc2(100);
		s3.setSc3(80);
		
		//add to an array
		Student [] students = new Student [3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		//sort array using Arrays.sort
		//Arrays.sort(students);
		Arrays.sort(students, new Score1Comparator());
		Arrays.sort(students, new Score2Comparator());
		
		//display sorted array
		for ( int i = 0; i<students.length; i++) {
			System.out.println(students[i].getName());
		}
	}

}
