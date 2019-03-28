import java.util.*;
class Login{
	public static boolean checkUsername(String username){
		if(username.equals("admin")){
			return true;
		}
		return false;
	}
	public static boolean checkPwd(String pwd){
		if(pwd.equals("admin123")){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		//Login a = new Login();
		String u = sc.next();
		if(checkUsername(u)){
			System.out.println("Enter pwd");
			String p = sc.next();
			if(checkPwd(p)){
				System.out.println("Login successfully");
			}
			else{
				System.out.println("check password");
			}
		}
		else{
			System.out.println("check username");
		}
	}
}