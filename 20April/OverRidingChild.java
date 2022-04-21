package thursday;
class OverRiding {

	void display() {
		System.out.println("in OverRiding");
	}
}


class OverRidingChild extends OverRiding {
	void display() {
		System.out.println("in OverRidingChild");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding r=new OverRidingChild();
		OverRiding r1=new OverRiding();
		
		r.display();
		r1.display();
	}

}
