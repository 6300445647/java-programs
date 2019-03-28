import java.util.*;
//not nestedif program
class Allvalues6{
  public static boolean Allequal(int a,int b,int c,int d){
     if((a==b && a==c && a==d )&& (b==c && b==d) && (c==d)){
     	return true;
     }
     return false ;
   }
   public static boolean equal(int a,int d){
   	if(a==d){
   		return true;
   	}
   	return false;
   }
   public static boolean equalvalue(int a,int b,int c){
   	if((a==b && a==c)&&(b==c)){
   		return true;
   	}
   	return false;
   }
   public static void main(String[]args){
   	System.out.println("Enter A,B,C and D values");
   	Scanner sc = new Scanner(System.in);
   	int a=sc.nextInt();
   	int b=sc.nextInt();
   	int c=sc.nextInt();
   	int d=sc.nextInt();
   	if(Allequal(a,b,c,d)){
   		System.out.println("All values are same");
   		if(equal(a,d)){
   			System.out.println("A and D values are equal");
   			if(equalvalue(a,b,c)){
   				System.out.println("A,B and C values are same");
   			}
   			else{
   				System.out.println("A,B and C values are same");
   			}
   		}
   		else{
   			System.out.println("A and D values are not equal");
   		}          
   	}else{
   		System.out.println("All values are different");
   	}
   }	
}
