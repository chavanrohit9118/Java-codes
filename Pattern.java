package mock;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="JAVA";
		for(int i=0 ; i<s.length() ;i++) {
			for(int j=0 ; j<=i ; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println(" ");
		}
	}

}
