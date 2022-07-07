package lab7july2022;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin="";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		int realNum=num;
		
		while(realNum>0) {
			int rem =realNum%2;
			realNum=realNum/2;
			
			bin=rem+bin;
		}
		int binaryInt= Integer.parseInt(bin);
		System.out.println("Binary num of "+num +" is "+binaryInt);

	}

}
