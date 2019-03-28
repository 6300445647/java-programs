import java.util.*;
class program12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		// boolean b =sc.nextBoolean();
		program12 p12 = new program12();
		System.out.println(p12.getOutput(a));
	}
	public boolean getOutput(int a){
          int x = 100;
          int y = 200;
          if((Math.abs(x-a))<=10 || (Math.abs(y-a))<=10){
          	return true;
          } 
          	return false;
	}   

}