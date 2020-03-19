
public class qTest {

	public static void main(String[] args) {
		int[] array = { 3, 3, 3, 4, 4, 5, 5 };
		System.out.println(mode(array));

	}

	public static int mode(int[] array) {
		int constant = 0;
		for(int x = 0; x < array.length; x++) {
			for(int y = x + 1; y < array.length; y++) {
				if(array[x] == array[y]) {
					constant = array[x];
				}
			}
		}
		return constant;
	}

}
