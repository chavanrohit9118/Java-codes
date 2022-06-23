package lab23june2022;
import java.util.Scanner;
public class AreaOfReactangle {
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if(length >= 10 && length <=50) {
		this.length = length;
		}
		else {
			System.out.println("Lenght should be between 10 to 50");	
		}
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		if(breadth>=5 && breadth<=20) {
		this.breadth = breadth;
		}
		else {
			System.out.println("breadth should be between 5 to 20");
		}
	}
	
	public AreaOfReactangle(double length, double breadth) {
		setLength( length);
		setBreadth( breadth);
		
	}

	@Override
	public String toString() {
		return "AreaOfReactangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length between 10 to 50");
		double length=sc.nextDouble();

		
		System.out.println("Enter breadth between 5 to 20");
		double breadth=sc.nextDouble();

		
		AreaOfReactangle a=new AreaOfReactangle(length, breadth);
		
		double area = a.getLength()*a.getBreadth();
		
		if(area==0) {
			System.out.println("Enter valid measurements !!");
		}
		else {
		System.out.println("Area of rectangle is "+area);
		}
		sc.close();
	}
}
