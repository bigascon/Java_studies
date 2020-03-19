import java.util.Scanner;

public class A5_34653592 {
	public static void main(String[] args) {

		// setup scanner & question
		Scanner scan = new Scanner(System.in);
		System.out.print("Password: ");
		String password = scan.nextLine();

		
		while (password.equals("endofinput") == false) { //while loop for asking for password
			if (password.length() < 8) { //length
				System.out.println("password must be greater than 8 characters");
			} else if (special(password) == false) { // special characters
				System.out.println("Can only contain alpha numeric characters");
			} else if (uppercase(password) == false) { //uppercase
				System.out.println("Must contain at least one uppercase letter");
			} else if (lowercase(password) == false) { //lowercase
				System.out.println("Must contain at least one lowercase letter");
			} else if (digit(password) == false) { //digits
				System.out.println("Must contain at least one numeric character");
			} else if(password.toLowerCase().contains("password")) { //word password
				System.out.println("Cannot contain the word 'password'");
			} else {
				System.out.println("Password is valid");
			}
			System.out.print("Password: ");
			password = scan.nextLine();
		}
	}

// Method for special characters
	public static boolean special(String password) {
		for (int x = 0; x < password.length(); x++) {
			char c = password.charAt(x);
			if (Character.isLetterOrDigit(c) == false) {
				return false;
			}
		}
		return true;
	}

//Method for uppercase letter
	public static boolean uppercase(String password) {
		for (int x = 0; x < password.length(); x++) {
			char c = password.charAt(x);
			if (Character.isUpperCase(c) == true) {
				return true;
			}

		}
		return false;
	}

//Method for lowercase letter
	public static boolean lowercase(String password) {
		for (int x = 0; x < password.length(); x++) {
			char c = password.charAt(x);
			if (Character.isLowerCase(c) == true) {
				return true;
			}
		}
		return false;
	}

//Method for numeric character
	public static boolean digit(String password) {
		for (int x = 0; x < password.length(); x++) {
			char c = password.charAt(x);
			if (Character.isDigit(c) == true) {
				return true;
			}
		}
		return false;
	}

}