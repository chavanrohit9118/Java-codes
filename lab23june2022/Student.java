package lab23june2022;

public class Student {
	int roll_no;
	String name;
	String sub;
	int total_marks;
	
	
	public Student(int roll_no, String name, String sub, int total_marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.sub = sub;
		this.total_marks = total_marks;
	}


	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", sub=" + sub + ", total_marks=" + total_marks + "]";
	}
	
	

}
