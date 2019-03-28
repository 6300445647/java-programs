import java.util.*;
public class programfc{
	public static void main(String[] args) {
	System.out.println("enter c to convert celcius to fahreinheit valus");
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	if(s.equals("c")){
		int i=sc.nextInt();
		float value=(float)((i*1.8)+32);
		System.out.println("fahreinheit value"+value);
	}

	}
}