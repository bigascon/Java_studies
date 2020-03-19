// Beatriz Gascón Lourenço
// 34653592

import java.util.Scanner;

public class A1_34653592 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("For how many seconds was the object falling?");
		double seconds = input.nextDouble();
		double a = 9.81; 
		double t = seconds;
		double x = 0.5 * a * (t * t);
		double xfeet = x * 3.28; 
		System.out.println ("The object's position after " + seconds + " seconds, is " + x + 
				" meters, or " + xfeet + " feet. ");
	}
}
