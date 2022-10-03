import java.util.Scanner;

public class _5factorial {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter a number 1: ");
		int n1 = reader.nextInt();
		int fact = 1;

		for (int i = 1; i <= n1; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial value is " + fact);

		reader.close();
	}
}