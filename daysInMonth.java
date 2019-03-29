import java.util.*;
class daysInMonth{
	public static void main(String[] args){
		System.out.println("Enter any month name");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1=s.toLowerCase();

		switch(s1){
			case "jan":
			case "mar":
			case "may":
			case "jul":
			case "aug":
			case "oct":
			case "dec":
			      System.out.println("31 days");
			        break;
			case "apr": 
			case "jun":
			case "sep":
			case "nov":
			      System.out.println("30 days");
			        break;
			case "feb":
			      System.out.println("28 days");
			        break;
			default:
			      System.out.println("check your input.....");

		}
	}
}