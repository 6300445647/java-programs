import java.util.*;
class program2{
void num(int n){
if(n%2==0){
System.out.println("even number");
}
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
program2 p2=new program2();
p2.num(n);
}
}