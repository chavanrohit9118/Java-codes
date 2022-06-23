package lab23june2022;

import java.util.Comparator;

public class TotalMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.total_marks-o2.total_marks;
	}
	

}
