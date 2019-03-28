import java.util.*;
class program13{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	program13 p13=new program13();
	System.out.println(p13.getOutput(n));
}  
public String getOutput(int n){
	return (n%2==0)?"even":"odd";
}	
}

  
