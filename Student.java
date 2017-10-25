
public class Student  implements Comparable <Student>{
	private String name;
	private double sc1,sc2,sc3;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSc1() {
		return sc1;
	}
	public void setSc1(double sc1) {
		this.sc1 = sc1;
	}
	public double getSc2() {
		return sc2;
	}
	public void setSc2(double sc2) {
		this.sc2 = sc2;
	}
	public double getSc3() {
		return sc3;
	}
	public void setSc3(double sc3) {
		this.sc3 = sc3;
	}
	@Override
	public int compareTo(Student other) {
		if((this.getSc1()+this.getSc2()+this.getSc3())/3 > (other.getSc1()+other.getSc2()+other.getSc3())/3){
			return -1;
		}
		if((this.getSc1()+this.getSc2()+this.getSc3())/3 < (other.getSc1()+other.getSc2()+other.getSc3())/3){
			return 1;
		}
		
		return 0;
	}

//we only return a negative number, positive number or 0
//returning a positive number means that you come before me. Pushes the object towards the end of the array.
//returning a negative number means that i should come before you. Pushes the object towards the beginning of the array.
//returning 0 means that you've found the position that you should be in.
}
