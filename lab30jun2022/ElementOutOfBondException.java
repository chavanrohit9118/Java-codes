package lab30jun2022;

public class ElementOutOfBondException extends Exception {

	public ElementOutOfBondException() {
		super();
		System.out.println("Number Shouldn't be greater than Last limit value");
	}
	

}
