import java.util.*;
class program19{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		program19 p19 = new program19();
		System.out.println(p19.getOut(a,b));
	}
	public int getOut(int a,int b){
		int x = Math.abs(a-10);
		int y = Math.abs(b-10);
		if(x == y{
			return 0;
		}
		if(x<y){
			return a;	
		}
		else{
			return b;
		}
	}
}