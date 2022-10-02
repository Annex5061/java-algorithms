 // Java Program for Method overloading
// By using Different Types of Arguments

// Class 1
// Helper class
class Helper {

	// Method with 2 integer parameters
	static int Multiply(int a, int b)
	{

		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{

		// Returns product of double numbers
		return a * b;
	}
}

// Class 2
// Main class
class basic {

	// Main driver method
	public static void main(String[] args)
	{

		// Calling method by passing
		// input as in arguments
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
	}
}

// Java program for Method Overloading
// by Using Different Numbers of Arguments

// Class 1
// Helper class
class abc {

	// Method 1
	// Multiplication of 2 numbers
	static int Multiply(int a, int b)
	{

		// Return product
		return a * b;
	}

	// Method 2
	// // Multiplication of 3 numbers
	static int Multiply(int a, int b, int c)
	{

		// Return product
		return a * b * c;
	}
}

// Class 2
// Main class
class simple {

	// Main driver method
	public static void main(String[] args)
	{

		// Calling method by passing
		// input as in arguments
		System.out.println(abc.Multiply(2, 4));
		System.out.println(abc.Multiply(2, 7, 3));
	}
}
