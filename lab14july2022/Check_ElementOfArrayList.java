/*
 * Q.2.	Accept two arraylist and 
 		check all the elements of second list in present in the first list or not 
 */
package lab14july2022;

import java.util.ArrayList;
import java.util.Objects;

public class Check_ElementOfArrayList {
	String name;
	String Dept;
		
public Check_ElementOfArrayList(String name, String dept) {
		super();
		this.name = name;
		Dept = dept;
	}

@Override
public String toString() {
	return " [name=" + name + ", Dept=" + Dept + "]";
}

@Override
public int hashCode() {
	return Objects.hash(Dept, name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Check_ElementOfArrayList other = (Check_ElementOfArrayList) obj;
	return Objects.equals(Dept, other.Dept) && Objects.equals(name, other.name);
}

public static void main(String[] args) {
	Check_ElementOfArrayList s1= new Check_ElementOfArrayList("Rajas","ETRX");
	Check_ElementOfArrayList s2= new Check_ElementOfArrayList("Rohit","ETRX");
	
	Check_ElementOfArrayList s3= new Check_ElementOfArrayList("Rajas","ETRX");
	Check_ElementOfArrayList s4= new Check_ElementOfArrayList("Rohit","ETRX");
	
		
	ArrayList<Check_ElementOfArrayList> al=new ArrayList<Check_ElementOfArrayList>();
	al.add(s1);
	al.add(s2);
	
	ArrayList<Check_ElementOfArrayList> al1=new ArrayList<Check_ElementOfArrayList>();
	al1.add(s3);
	al1.add(s4);
	
	System.out.println(al.containsAll(al1));	
}
}
