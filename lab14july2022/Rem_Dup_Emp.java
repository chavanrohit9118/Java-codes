/*
 *Q.1.	Accept and store 5 Employee object through arraylist. 
 		Delete the duplicate based on Emp_Name and Dept.
 */

package lab14july2022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Rem_Dup_Emp {
	String emp_name;
	String Dept;
	
	public Rem_Dup_Emp(String emp_name, String dept) {
		super();
		this.emp_name = emp_name;
		Dept = dept;	
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Dept, emp_name);
	}

	@Override
	public boolean equals(Object obj) {
		
		Rem_Dup_Emp other = (Rem_Dup_Emp) obj;
		return Objects.equals(Dept, other.Dept) && Objects.equals(emp_name, other.emp_name);
	}

	@Override
	public String toString() {
		return "[emp_name=" + emp_name + ", Dept=" + Dept + "]";
	}

	public static void main(String[] args) {
		
		Rem_Dup_Emp e1=new Rem_Dup_Emp("Rohit","ETRX");
		Rem_Dup_Emp e2=new Rem_Dup_Emp("Rajas","ETRX");
		Rem_Dup_Emp e3=new Rem_Dup_Emp("Bharat","EXTC");
		Rem_Dup_Emp e4=new Rem_Dup_Emp("Vishal","IT");
		Rem_Dup_Emp e5=new Rem_Dup_Emp("Rajas","ETRX");
		
		ArrayList<Rem_Dup_Emp> al = new ArrayList<Rem_Dup_Emp>();
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
				
		Set<Rem_Dup_Emp> al1 = new LinkedHashSet<Rem_Dup_Emp>();
		al1.addAll(al);
		
		for(Rem_Dup_Emp s : al1) {
			if(!al1.equals(al)) {
				System.out.println(s +" ");
			}
		}
		
	}
}
