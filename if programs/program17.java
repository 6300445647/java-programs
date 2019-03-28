import java.util.*;
class program17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		program17 p17 = new program17();
		System.out.println(p17.getOut(a,b,c));
	}
	public String getOut(int a,int b,int c){
		if((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19)){
			return "true";
		}else
		return "false" ;	
	}
}