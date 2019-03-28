import java.util.*;
class Program1{

public static void main(String[] args){
System.out.println("Enter a True is input");
Scanner sc=new Scanner(System.in);
boolean value = sc.nextBoolean();

Program1 p1=new Program1();
p1.getprint(true);

System.out.println("end of main method");
}

void getprint(boolean a){
if(a){
System.out.println("hello");
}
}
}

