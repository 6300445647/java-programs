import java.util.*;
public calss program6{
void timimgs(int x){
if(x<12){
System.out.println("good morning");
}
if(x>12 && x<18){
System.out.println("good afternoon");
}
if(x>18 && x<24){
System.out.println("good night");
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
program6 p6 = new program6();
p6.timings(x);
}
}