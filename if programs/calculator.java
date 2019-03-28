import java.util.*;
class calculator{
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("******calculation******");
		System.out.println("1.Addtion");
		System.out.println("2.Subtraction" );
		System.out.println("3.Divison");
		System.out.println("4.Modulus division");
		System.out.println("5.Multiplication");
		System.out.println("Enter any number for calculation");
		int n = sc.nextInt();
		System.out.println();
		if(n==1){
			// System.out.println(addition());
			calculator.addition();
		}
		//else if(n==2){
			// System.out.println(substraction());
			//substraction();
		//}
		}	
    
    public static void addition(){
    	int a,b;
    	  	Scanner sc=new Scanner(System.in);
    	System.out.println("addition");
    	System.out.println("first number");
    	a = sc.nextInt();
    	System.out.println("second number");
    	b = sc.nextInt();
    	if(a>0 && b>0){
    		System.out.println("sum:" +a+ "+" +b+ "=" +(a+b));
      
    }
    		if(a>0 && b<0){
    		System.out.println("sum:" +a+ "+" +"("+b+")"+ "=" +(a+b));
    	}
    	 if(a<0 && b>0){
    		System.out.println("sum:"+ "(" +a+ ")"+ "+" +b+ "=" +(a+b));
    	} 
    		if(a<0 && b<0){
    		System.out.println("sum:" +"(" +a+ ")"+ "+"+ "(" +b+ ")" +"=" +(a+b));
    	}	
    
}
}