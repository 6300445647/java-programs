import java.util.*;
class stringMethod3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		//string format <<word>>
		String s3 = s1.substring(0,2)+""+s2+""+s1.substring(2);
		System.out.println(s3);
	}
}