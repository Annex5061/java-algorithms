import java.util.Scanner;

public class marksToPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of hindi");
        float marks1 = sc.nextFloat();
        System.out.println("Enter marks of english");
        float marks2 = sc.nextFloat();
        System.out.println("Enter marks of mathematics");
        float marks3 = sc.nextFloat();
        System.out.println("Enter marks of science");
        float marks4 = sc.nextFloat();
        System.out.println("Enter marks of SST");
        float marks5 = sc.nextFloat();

        float total = marks1 + marks2 + marks3 + marks4 + marks5;
        System.out.println("Total marks = ");
        System.out.println(total);
        float average = (total / 5.0f);
        System.out.println("Average marks = ");
        System.out.println(average);
        float percentage = (total / 500.0f) * 100;
        System.out.print("Percentage = " + percentage);
        System.out.println(percentage);
    }
}