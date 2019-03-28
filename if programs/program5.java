import java.util.*;
class program5{
void positive(int x){
if(x>0){
 System.out.println(" given num is positive number");
} 
if(x<0){
System.out.println("given num is negative number");
}
if(x==0){
System.out.println("given num is zero");
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
program5 p5 = new program5();
p5.positive(x);
}
}