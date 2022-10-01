import java.util.Scanner;

public class oddOrEvenNumber {
    public static void main(String[] args) throws Exception {

        Scanner inputNumber = new Scanner(System.in);

        // Check whether a number is even or odd using if else statement
        System.out.print("Enter a number:\t");
        int num = inputNumber.nextInt();

        if (num % 2 == 0) {
            System.out.print(num + " is even");
        } else {
            System.out.print(num + " is odd");
        }

        inputNumber.close();
    }

}
