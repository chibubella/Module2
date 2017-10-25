import java.util.Comparator;

public class Score2Comparator implements Comparator <Student>{
	@Override
	public int compare(Student student1, Student student2) {
		if (student1.getSc2() < student2.getSc2()) return -1;
		else if (student1.getSc2() > student2.getSc2()) return 1;
		else return 0;
	}

}
