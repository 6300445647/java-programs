import java.util.*;
class combine_string{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1= sc.next();
		System.out.println(getPrint(s,s1));
	}
	public static String getPrint(String s,String s1){
		if(s1.length()>s.length()){
			return (s.concat(s1.concat(s)));
		}
		else{
			return (s1.concat(s.concat(s1)));
		}
	}
}