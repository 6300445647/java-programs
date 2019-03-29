import java.util.*;
class vowelOrConsonant{
	public static void main(String[] args){
		System.out.println("Enter any alphabet");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1=s.toLowerCase();
		char ch  =s1.charAt(0);

		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			   System.out.println("vowel");
                    break;
            default:
               System.out.println("consonant");
                     break;
		}

	}
}