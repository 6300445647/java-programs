import java.util.*;
class program3{
void number(int n){
if(n%2!=0){
System.out.println("given num is odd");
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
program3 p3 = new program3();
p3.number(n);
}
}