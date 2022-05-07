package may6;

public class LCM240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lcm=240;
		int ratio_num1=3;
		int ratio_num2=4;
		
		int num1= (ratio_num1*lcm)/(ratio_num1*ratio_num2);
		int num2= (ratio_num2*lcm)/(ratio_num1*ratio_num2);
		
//		System.out.println(num1 +" "+num2);
		
		if(num1<num2) {
			System.out.println("Smaller number is : "+num1);
		}
		else {
			System.out.println("Smaller number is : "+num2);
		}
		
		
		
	}

}
