/* Beatriz Gascón Lourenço
 * ID: 34653592
 */
import java.util.Scanner;

public class A8_34653592 {
	public static void main(String[] args) {

		int patrolBoat = 0;
		int destroyer = 0;
		int battleship = 0;

		char[][] guesses = { 
							 { '.', '.', '.', '.', '.', '.' }, 
							 { '.', '.', '.', '.', '.', '.' },
							 { '.', '.', '.', '.', '.', '.' }, 
							 { '.', '.', '.', '.', '.', '.' }, 
							 { '.', '.', '.', '.', '.', '.' },
							 { '.', '.', '.', '.', '.', '.' }, 
							 { '.', '.', '.', '.', '.', '.' }, 
							 { '.', '.', '.', '.', '.', '.' },
							 { '.', '.', '.', '.', '.', '.' },
							 };
		
		char [] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
		

		int[][] ships = new int[6][6];

		ships[0][0] = 2;
		ships[1][0] = 2;
		ships[1][4] = 3;
		ships[2][4] = 3;
		ships[3][4] = 3;
		ships[5][2] = 4;
		ships[5][3] = 4;
		ships[5][4] = 4;
		ships[5][5] = 4;

		// Scanner setup
		Scanner input = new Scanner(System.in);
		

		do {
			System.out.println("Please enter a guess in the form 'B5':");
			String guess = input.nextLine();
			guess = guess.toLowerCase();
			int row = (int) (guess.charAt(0) - (int) ('a'));
			int col = (int) (guess.charAt(1) - (int) ('1'));
			if (ships[row][col] > 0) {
				System.out.println(guess.toUpperCase() + " is a hit");
				System.out.println();
				guesses[row][col] = 'X';
				switch (guess) {
				case "a1":
				case "b1":
					patrolBoat++;
					if(patrolBoat == 2) {
						System.out.println("You sunk the Patrol boat");
					}
					break;
				case "b5":
				case "c5":
				case "d5":
					destroyer++;
					if(destroyer == 3) {
						System.out.println("You sunk the destroyer");
					}
					break;
				case "f3":
				case "f4":
				case "f5":
				case "f6":
					battleship++;
					if(battleship == 4) {
						System.out.println("You sunk the battleship");
					}
					break;
				}

			} else {
				System.out.println(guess.toUpperCase() + " is a miss");
				guesses[row][col] = 'O';
			}
			System.out.println();
			System.out.println( " " + " " + "1" + " " + "2" + " " + "3" + " " + "4" + " " + "5" + " " + "6");

			for (int x = 0; x < 6; x++) {
				System.out.print(letters [x] + " ");
				for (int j = 0; j < 6; j++) {
					System.out.print(guesses[x][j] + " " );
				}
				
				System.out.println();
			}
			
			System.out.println();
			System.out.println();
			
		} while (patrolBoat < 2 || destroyer < 3 || battleship < 4 ); 
		System.out.println("Game Over, you win!");
		
	}

}
