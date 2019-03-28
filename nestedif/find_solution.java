import java.util.Scanner;
class find_solution {
	 static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		//FindSolution fs = new FindSolution();
		System.out.println("Enter username");
		String username = scan.next();

		System.out.println("Enter password");
		String password = scan.next();

		if (checkUserName(username)){
			if (checkUserPassword(password)){
				System.out.println("Login successfull");
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

}
 class UserData {

	static final String userName = "java";
	static final String password = "java123";
}

