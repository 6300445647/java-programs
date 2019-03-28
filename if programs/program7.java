import java.util.*;
class program7{
 void print(int x,int y){
if(x==y){
System.out.println("values are equal");
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
int y = sc.nextInt();
program7 p7 = new program7();
p7.print(x,y);
}
}