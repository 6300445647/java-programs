import java.util.*;
class grade_of_student{
	public static void main(String[] args){
		System.out.println("Enter student marks");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
		int total=(a+b+c+d+e);
		int x = (total*100)/500;
		int y = x/10;
               System.out.println(total+":"+x+": "+y);
		switch(y){
            case 10:
            case  9:
              System.out.println(" grade A");
                break;
            case 8:
            case 7:
            case 6:
              System.out.println(" grade B");
                break;
            case 5:
            case 4:
              System.out.println(" grade c");
                break;
            case 3:
              System.out.println("fail & improve your peformance");
                break;
           
		} 

	}
} 