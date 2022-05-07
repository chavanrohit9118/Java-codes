package may6;
class Smartphone{
	void processor() {
		System.out.println("Smartphone has well-developed prossesor");
	}
}

class Poco_f1 extends Smartphone{
	void processor() {
		System.out.println("Poco f1 has sd845 processor");
	}
	void battery(){
		System.out.println("Poco f1 has 4000mAh battery");
	}
	
}
public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone sp=new Poco_f1();  
		Poco_f1 pf=(Poco_f1)sp;
		
		sp.processor();
		pf.battery();
		
	}

}
