import java.util.*;
class program10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		program10 p10 = new program10();
		int output=p10.getOutput(n);
		System.out.println(output);
	}
	public int getOutput( int a){
		int i = 21;
		if(a>21){
           return ((i-a)*(-2));
       }
	else
		return i-a;
}
}