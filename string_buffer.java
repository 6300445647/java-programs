import java.util.*;
class string_buffer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		//String s = "platform";
	  //string_buffer sb = new string_buffer();
		StringBuffer sb1 = new StringBuffer(s);
		sb1.append(s1);
		System.out.println(sb1);
        sb1.insert(9,"is ");
        System.out.println(sb1);
        System.out.println(sb1.delete(9,12));
		sb1.trimToSize();
		System.out.println("sb capacity:"+sb1.capacity());
		System.out.println("sb length:"+sb1.length());

	}
}