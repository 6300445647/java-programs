import java.util.*;
class stringMethod1{
    String s1 = "hello  ";
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	String s2 = sc.next();
	stringMethod1 sm1=new stringMethod1();
	//string format hello+given string(helloBob)
	System.out.println(sm1.s1+""+ s2);
}
}
    