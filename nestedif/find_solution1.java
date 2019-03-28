import java.util.Scanner;

public class find_solution1{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter username");
		String username = scan.next();

		System.out.println("Enter password");
		String password = scan.next();

		if (checkUserName(username)){
			if (checkUserPassword(password)) {

				System.out.println("Login successfull");
				System.out.println("-----------------");
				System.out.println("Enter 1. Change username");
				System.out.println("Enter 2. Change password");
               
				int f = scan.nextInt();
				if (f == 1) {
					System.out.println("Enter desired username");
					String newUserName = scan.next();

					System.out.println("Username change from " + username + "to " + newUserName + " successfully");

				} 
				 else if (f == 2) {
					System.out.println("Enter desired password");
					String newUserName = scan.next();

					System.out.println("Username change from " + password + " to " + newUserName + " successfully");

				} 
			
				 else{
					System.out.println("please check your input...");
			
		}
	}
			 else{
				System.out.println("Check password");
			
		
	}
}

		else{
			System.out.println("Check username");
		}
	}

	public static boolean checkUserName(String username) {

		if (username.equals("java")) {
			return true;
		}
	     return false;
	}

	public static boolean checkUserPassword(String password) {

		if (password.equals("java123")) {
			return true;
		}
		return false;
	}

	public static String changePassword(String Pass) {
		return UserData.password=Pass;
	}

	public static String changeUsername(String Username) {
		return UserData.userName=Username;
	}
}
