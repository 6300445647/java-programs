import java.util.*;
class stringMethod2{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
    stringMethod2 sm2 = new stringMethod2();
    System.out.println("enter string");
    String s1 = sc.next();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int len = s1.length();
    System.out.println("length of string:"+   len);
    if((a>=0 && b>0 )&& (b<len)){
    System.out.println(s1.substring(a,b));    
}
else 
  System.out.println("invalid output");
}
}