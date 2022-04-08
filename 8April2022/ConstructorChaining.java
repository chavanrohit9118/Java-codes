package mypack1;

public class ConstructorChaining {
	String name ;
	int roll ;
	int marks;
	int avg;
	
	ConstructorChaining(String name ,int roll ,int marks){
		this.name=name;
		this.roll =roll;
		this.marks= marks;
	}
	ConstructorChaining(String name ,int roll ,int marks,int avg){
		this(name, roll, marks);
		this.avg=avg;
		
	}
	void disp() {
		System.out.println(name+"\n"+roll+"\n"+marks+"\n"+avg+"\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining c1=new ConstructorChaining("ABC",1,2);
		ConstructorChaining c2=new ConstructorChaining("XYZ",5,6,7);
		c1.disp();
		c2.disp();
	}

}
