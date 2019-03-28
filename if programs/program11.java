import java.util.*;
class program11{
	public boolean getOutput(int x, int y,boolean b){
	if((x<0) && (y<0)&&b==false){
		return false;
	}
	if((x>0) && (y>0)&&b==false){
		return false;
	}

	if((x<0||x>0) && (y<0||y>0)&&(b == false||b==true)){
      return true;
	}
	if ((x<0||x>0)&&(y<0||y>0)&&b==false){
		return false;
	}
	return false;

}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	boolean b = sc.nextBoolean();
	program11 p11 = new program11();
System.out.println(p11.getOutput(x,y,b));
}
}

