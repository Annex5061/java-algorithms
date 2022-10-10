import java.util.Scanner;

class Details {
    public static void main(String args[])
    {
       System.out.println("Enter the required details: ");
       Scanner dtl=new Scanner(System.in);
       System.out.println("Enter your name: ");
       String name=dtl.nextLine();
       System.out.println("Enter your Mobile number: ");
      Long phone=dtl.nextLong();
       System.out.println("Enter your age: ");
       int age=dtl.nextInt();
       System.out.println("    WELCOME    ");
       System.out.println("   Nice to meet you "+ name);
       System.out.println("  Thank You for filling the details.    ");
       System.out.println(" We'll surely contact you on "+ phone + " for further details.    ");
    }
}