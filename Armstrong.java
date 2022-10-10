import java.util.Scanner;
public class ArmstrongNum {
	static int number, originalNumber, remainder, result = 0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArmstrongNum num = new ArmstrongNum();
		System.out.println("Enter the Number : ");
		number = s.nextInt();
		originalNumber=number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
	}
}
