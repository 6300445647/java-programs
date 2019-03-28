import
class program14{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	program14 p14=new program14();
	System.out.println(p14.getOutput(n));
}  
public boolean getOutput(int n){
	return ((n%3==0)||(n%5==0))?true:false;
}	
}

  
