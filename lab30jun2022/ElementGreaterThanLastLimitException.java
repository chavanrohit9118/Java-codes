package lab30jun2022;

public class ElementGreaterThanLastLimitException extends Exception{

	public ElementGreaterThanLastLimitException() {
		super();
		System.out.println("Element should be less than last limit value");
	}
	
	

}
