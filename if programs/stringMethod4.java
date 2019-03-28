import java.util.*;
class stringMethod4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		//string "hello",O/p:"he"(first two chars of string)
		
		System.out.println(s.substring(0,2));
	}
}