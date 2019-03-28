import java.util.*;
class a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		a a1 = new a();
		System.out.println(a1.getOut(s,s1));
	}
	public String getOut(String s,String s1){
		if((s.substring(s.length()-1,s.length())).equals(s1.substring(0,1))){
			return s+s1.substring(1,s1.length());
		}
		else{
			return s+s1;
		}
	}     
}