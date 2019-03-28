import java.util.*;
class program15{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		//boolean b = sc.nextBoolean();
		program15 p15 = new program15(); 
		System.out.println(p15.getOut(x,y,z,b));
	}
	public boolean getOut(int x,int y,int z){
		return ((c>b)&&(c>a)?c:((b>a)?b:c));

	}
}
