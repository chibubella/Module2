import java.util.Comparator;

public class Score1Comparator implements Comparator <Student>{
	
	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getSc1() < student2.getSc1()) return -1;
		else if (student1.getSc1() > student2.getSc1()) return 1;
		else return 0;
	}

}
