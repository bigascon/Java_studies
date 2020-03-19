
public class qTest1 {

	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4 }, { 1 }, { 1, 2 }, { 1, 2, 3 } };
		printArray(numbers);

	}
	
	public static void printArray(int [][] array) {
		for(int x = 0; x < array.length - 1; x++ ) {
			for(int y = 0; y < array.length - 1; y++) {
				System.out.println(array[x][y]);
			}
		}
	}

}
