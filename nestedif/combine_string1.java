import java.util.*;
class combine_string1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		int s = a.length()+b.length();
		System.out.println(s);

		int s1 = (a.compareTo(b));
		String s2 =(s1==0) ? "yes":"no" ;
		System.out.println(s2); 

		String s3 = a.toUpperCase().charAt(0)+a.substring(1)+" "+b.toUpperCase().charAt(0)+b.substring(1);
		System.out.println(s3);  
	}
	//public static String getPrint(String a,String b){	
	//}
} 