import java.util.*;
class TwoIpvalues5{
	public static boolean Equal(int a,int b){
       if(a==b){
      	return true;
        }
         else{
          return false;
        }
    }
     public static boolean Equalvalue(int a,int b){
     	if(a>b||a<b){
     		return true;
     	}
     	else{
     	return false;
     }
    }
	public static void main(String[]  args){
        System.out.println("Enter a and b values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(Equal(a,b)){
			System.out.println("a and b values are equal");
			if(Equalvalue(a,b)){
				System.out.println("a is greater than b");
			}
			else{
				System.out.println("b is greater thean a");
			}
		}
		else{
		System.out.println("a and b values are not equal");
         }	
	}

}                                 