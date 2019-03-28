import java.util.*;
class stringMethod6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stringMethod6 sm6 = new stringMethod6();
		System.out.println(sm6.getOut(s));
		//html strings (ex:<i>given string</i>)

		//String s1 = sc.next();
		//String s2 = sc.next();
	    //String s3 = "<"+s+">"+s1+"</"+s+">";
}		//System.out.println(s3);
        //checking first nd last 2 chars equal or not:true or false

    public String getOut(String s){
          if(s.substring(0,2).equals(s.substring(s.length()-2))){
		return "true";
		 }
		 else{
		return "false";
	}
}
}
