import java.util.*;
class stringmethod7{
	public static void main(String[] args){
		scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		stringmethod7 sm7 = new stringmethod7();
		System.out.println(sm7.getOut(s,s1));
	}
	public String getOut(String s,String s1){
		if(s.substring(s.length()-1).equals(s1.substring(0,1))){
			return s+s1(1,s.length()-1);
		}
		else{
			return s+s1;
		}
	}
}