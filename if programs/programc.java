import java.util.*;
class programc{
public static void main(String[] args){
System.out.println("enter f to convert faharenheit value to cellisus value");
Scanner sc=new Scanner(System.in);
String input=sc.next();
if(input.equals("f")){
float f=sc.nextFloat();
int value=(int)((f-32)*0.5556);
System.out.println("cellisus value" +value);
}
}
}
