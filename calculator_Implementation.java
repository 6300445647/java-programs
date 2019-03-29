import java.util.*;
class calculator_Implementation{
    public static void main(String[] args){
    	System.out.println("Enter any operator(+,-,%,*,/):");
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	System.out.println("Enter first number");
    	int a = sc.nextInt();
    	System.out.println("Enter second number");
    	int b = sc.nextInt();

    	switch(s){
    		case "+":
    		   System.out.println("addition:"+" "+(a+b));
    		     break;
    	   case "-":
    	   System.out.println("substraction:"+" "+(a-b));
    		     break;
    		case "%":
    		   System.out.println("div by modulus:"+" "+(a%b));
    		     break;
    		case "*":
    		   System.out.println("multipication:"+" "+(a*b));
    		     break;
    		case "/":
    		   System.out.println("divison:"+" "+(a/b));
    		     break;
            default:
               System.out.println("entered wrong input");
                break;
    	}
    }
}