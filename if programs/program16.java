import java.util.*;
class program16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		boolean b = sc.nextBoolean();
		program16 p16 = new program16();
		System.out.println(p16.getOut(x,y,z,b));

	}
	public boolean getOut(int x,int y,int z,boolean b){
		if((y>x &&z>y)&&b==false){
			return true;
		}
		if((y<z) && (b==true)){
			return true;
		}
		return false;
	}
}