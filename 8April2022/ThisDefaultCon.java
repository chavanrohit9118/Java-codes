package mypack1;

public class ThisDefaultCon {
	ThisDefaultCon(){
		
		System.out.println("default");
	}
	ThisDefaultCon(int a){
		//this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDefaultCon t=new ThisDefaultCon(2);
	}

}
