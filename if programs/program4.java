import java.util.*;
class program4{
void maximumNum(int x,int y){
if(x>y){
System.out.println("max number"+x);
}
if(x<y){
System.out.println("max number"+y);
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
program4 p4 = new program4();
p4.maximumNum(x,y);
}
}