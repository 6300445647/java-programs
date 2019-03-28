import java.util.*;
class stringMethod8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); 
		stringMethod8 sm8 = new stringMethod8();
		System.out.println(sm8.getOut(s));
	}
	public String getOut(String s){
		if(s.length()==0||s.length()==1){
			return "";
		}
		else if((s.charAt(0)=='x') && (s.charAt(s.length()-1)=='x')){
			    return s.substring(1,s.length()-1);
		    }
		else
		    if(s.charAt(0)=='x'){
		    	return (s.substring(1,s.length()));
		    }
		else
			if(s.charAt(s.length()-1)=='x'){
			return s.substring(0,s.length()-1);
		    }
		else
			return s;
	}	 	
}		
		


   
