import java.util.Scanner;

public class A4_34653592 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Would you like to see an X or an O?");
		String shape = scan.nextLine();
		System.out.println("What size should it be?");
		int size = scan.nextInt();

		switch (shape) {
		case "X":

			if (size % 2 == 0) {
				for (int s = 0; s < size / 2; s++) { // outer loop
					for (int a = 0; a < s; a++) { // inner loop for before the asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					for (int x = 0; x < -2 * s - 2 + size; x++) { // inner loop for between asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					for (int a = 0; a < s; a++) { // inner loop for after asterisks
						System.out.print(" ");
					}
					System.out.println();
				}
				for (int s = size / 2; s > 0; s--) { // outer loop for second half of 'x'
					for (int a = 0; a < s - 1; a++) { // inner loop for before the asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					for (int x = 0; x < -2 * s + size; x++) { // inner loop for between asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();

				}

			} else {
				for (int s = 0; s < size / 2 + 1; s++) { // outer loop
					for (int a = 0; a < s; a++) { // inner loop for before the asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					for (int x = 0; x < -2 * s - 2 + size; x++) { // inner loop for between asterisks
						System.out.print(" ");
					}
					if (s != size / 2) {
						System.out.print("*");
					}
					for (int a = 0; a < s; a++) { // inner loop for after the asterisks
						System.out.print(" ");
					}
					System.out.println();
				}
				for (int s = size / 2; s > 0; s--) { // outer loop for second half of 'x'
					for (int a = 0; a < s - 1; a++) { // inner loop for before the asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					for (int x = 0; x < -2 * s + size; x++) { // inner loop for between asterisks
						System.out.print(" ");
					}
					System.out.print("*");
					System.out.println();

				}

			}
			break;
		case "O":

			for (int i = 0; i < size; i++) {
				if (i == 0 || i == size - 1) {
					for (int o = 0; o < size; o++) {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
					for (int o = 0; o < size - 2; o++) {
						System.out.print(" ");
					}
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}

}