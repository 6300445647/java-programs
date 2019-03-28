import java.util.*;
class stringMethod5{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	stringMethod5 sm5 = new stringMethod5();
	System.out.println(sm5.getOut(s));
	}
	public String getOut(String s){
    String s1 = s.substring(s.length()-2,s.length())+s.substring(0,s.length()-2); 
        return s1;
        }
         	
	//i/p:hello
    //o/p:lohel
}