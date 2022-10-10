// Java program to print
// sierpinski triangle.
import java.util.*;
import java.io.*;

class Sierpinski
{
	static void printSierpinski(int n)
	{
		for (int b = n - 1; b >= 0; b--) {

			// printing space till
			// the value of y
			for (int i = 0; i < b; i++) {
				System.out.print(" ");
			}

			// printing '*'
			for (int a = 0; a + b < n; a++) {

				// printing '*' at the appropriate
				// position is done by the and
				// value of x and y wherever value
				// is 0 we have printed '*'
				if ((a & b) != 0)
					System.out.print(" "
									+ " ");
				else
					System.out.print("* ");
			}

			System.out.print("\n");
		}
	}

	// Driver code
	public static void main(String args[])
	{
		int n = 16;

		// Function calling
		printSierpinski(n);
	}
}

