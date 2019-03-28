import java.util.*;
class program18{         
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		program18 p18 = new program18();
		System.out.println(p18.getOut(a,b));
	}
	public boolean getOut(int a,int b){
		if(a%10 == b%10){
			return true;
		}
		else
		return false;
	}
}