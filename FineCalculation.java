/* Beatriz Gascón Lourenço
Student ID: 34653592 */

import java.util.Scanner;

public class A2_34653592 {

	public static void main(String[] args) {

		// velocity
		Scanner scan = new Scanner(System.in);
		System.out.println("How fast was the vehicle going?");
		int fast = scan.nextInt();

		// Speed limit
		System.out.println("What was the speed limit?");
		int speed = scan.nextInt();

		// area
		System.out.println("Was it a school or construction zone? (1 for yes or 2 for no)");
		int area = scan.nextInt();

		int sub = fast - speed;

		switch (area) {
		case 1:
			if (sub >= 1 && sub <= 20) {
				System.out.println("Fine is $196");
			} else if (sub >= 21 && sub <= 40) {
				System.out.println("Fine is $253");
			} else if (sub >= 41 && sub <= 60) {
				System.out.println("Fine is $368");
			} else if (sub >= 61) {
				System.out.println("Fine is $483");
			} else if (sub <= -20) {
				System.out.println("Fine is $121");
			}
			break;
		
		case 2:
			if (sub >= 1 && sub <= 20) {
				System.out.println("Fine is $138");
			} else if (sub >= 21 && sub <= 40) {
				System.out.println("Fine is $196");
			} else if (sub >= 41 && sub <= 60) {
				System.out.println("Fine is $368");
			} else if (sub >= 61) {
				System.out.println("Fine is $483");
			} else if (sub <= -20) {
				System.out.println("Fine is $121");
			}
			break;

		}

	}

}
