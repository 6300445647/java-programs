import java.util.*;
class Emanager{
	public static boolean Jmanager(int exp){
		if(exp>10){
			return true;
		}
		return false;
	}
	public static boolean Smanager(int training){
		if(training>5){
			return true;
		}
		return false;
	}
	public static boolean Amanager(String s){
		if(s.equals("a")){
			return true;
		}
		return false;
	}
    public static void main(String[] args){
       System.out.println("Enter years of experience");
    	  Scanner sc = new Scanner(System.in);
          int exp = sc.nextInt();
        if(Jmanager(exp)){
           	System.out.println("Enter your training period ");
           	int training = sc.nextInt();
           	if(Smanager(training)){
           		System.out.println("Enter your current post");
           		String s = sc.next();
           		if(Amanager(s)){
                     System.out.println("Qualified to be promoted Manager");
           		}else{
           			System.out.println("Became A.manager first");
           		}
           	}else{
                 System.out.println("Need more experience");
           	}
        }else{
           	System.out.println("Need more training");
        }
    } 	
}