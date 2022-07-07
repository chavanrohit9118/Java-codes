package lab7july2022;


public class BeanClass_Student_main {

	public static void main(String[] args) {
		
		BeanClass_Student s1 =new BeanClass_Student("Rohit",10,"A",1);
		BeanClass_Student s2 =new BeanClass_Student("Vaibhav",10,"B",2);
		BeanClass_Student s3 =new BeanClass_Student("Sanket",10,"B",3);
		BeanClass_Student s4 =new BeanClass_Student("Rajas",10,"A",4);
		

		
		if(s1.equals(s4)) {
			System.out.println("Same");
//			System.out.println(s1.hashCode() +" " +s4.hashCode() );
		}
		else {
			System.out.println("not same");
		}

		
//		if(s1.equals(s4) && s1.hashCode()==s4.hashCode()) {
//			System.out.println(" Same and hashcode also same");
//			System.out.println(s1.hashCode() +" " +s4.hashCode() );
//		}
//		else {
//			System.out.println("not same");
//		}
		
				
	}

	
		
	

}
