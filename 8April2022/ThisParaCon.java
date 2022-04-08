package mypack1;
import java.util.*;
public class ThisParaCon {
	
	ThisParaCon(){
		this(2);
		System.out.println("Para");
	}
	ThisParaCon(int a){
		System.out.println(a);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		ThisParaCon t=new ThisParaCon();
	}

}
