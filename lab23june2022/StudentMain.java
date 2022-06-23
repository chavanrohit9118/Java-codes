package lab23june2022;

import java.util.Arrays;

public class StudentMain {
	
	private static Student[] createArray() {
		Student s1 = new Student(8,"Rajas", "Physics",80);
		Student s2 = new Student(2,"Rohit", "Maths", 70);
		Student s3 = new Student(15,"Pranav", "Chemistry",69);
		Student s4 = new Student(4,"Shubham", "Physics", 66);
		Student s5 = new Student(20,"Vaibhav", "Maths", 77);
		
		Student[] arr = { s1,s2,s3,s4,s5};
		return arr;
	}
	
	private static void nameComp(Student[] arr) {
		Arrays.sort(arr, new NameComparator());;
		
		for(Student c: arr)
		{
			System.out.println(c+" ");
		}
		
		System.out.println("----------------------------");
		System.out.println();
	}
	
	private static void TotalMarksComp(Student[] arr) {
		Arrays.sort(arr, new TotalMarksComparator());;
		
		for(Student c: arr)
		{
			System.out.println(c+" ");
		}
		
		System.out.println("----------------------------");
		System.out.println();
	}



	public static void main(String[] args) {
		
		Student[] arr = createArray();

		nameComp(arr);
		TotalMarksComp(arr);
	}

}
