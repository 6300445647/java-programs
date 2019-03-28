import java.util.*;
calss program6;
void getPrint(int x){
if(x<=12){
system.out.println("gud morning");
}
if(x>12 && x<=18){
System.out.println("good afternoon");
}
if(x>18 && x<=24){
System.out.println("goog night");
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
program6 p6 =new program6();
p6.getPrint(x);
}
}