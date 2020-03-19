/*Beatriz Gascón Lourenço
 * 34653592
 */

public class A3_34653592 {

	public static void main(String[] args) {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);

		int roll = (dice1 + dice2);

		if (roll == 7 || roll == 11) {
			System.out.println("You rolled a " + roll + ". You win!");
		} else if (roll == 2 || roll == 3 || roll == 12) {
			System.out.println("You rolled a " + roll + ". You lose");
		} else {
			System.out.println("You rolled a " + roll + ". Point is " + roll + ".");
			int thePoint = roll;

			do {
				dice1 = (int) (Math.random() * 6 + 1);
				dice2 = (int) (Math.random() * 6 + 1);
				roll = (dice1 + dice2);

				if (roll == 7) {
					System.out.println("You rolled a " + roll + ". Craps. You lose.");
				} else if (roll == thePoint) {
					System.out.println("You rolled a " + roll + ". You win!");
				} else {
					System.out.println("You rolled a " + roll + ".");
				}
			} while (roll != 7 && roll != thePoint);
		}

	}

}
