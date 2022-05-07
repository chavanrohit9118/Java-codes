package may6;
import java.util.Scanner;
public class WordOccurenceCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		String s="Global warming is a hike in the average global temperature on earth. Burning of excess fossil fuel and the release of toxic fumes into the atmosphere is the major cause behind global warming. Global warming can have disastrous effects on living organisms. The impacts of global warming are widespread and unspecific.";
		System.out.println("String is : "+s);
		System.out.println("Enter word for counting: ");
		String w =sc.next();
		String compare="";
		int count =0;
		
		for (int i=0;i<s.length()-1;i++) {
			char ch= s.charAt(i);
			
			if(ch!=' ') {
				compare+=ch;
//				System.out.println(compare);
				
				if(compare.equalsIgnoreCase(w)) {
					count++;
//					System.out.println(count);
				}			
			}
			else {
				compare="";
			}	
		}		
		System.out.println("Count of user word is "+count);
		sc.close();
	}
}

