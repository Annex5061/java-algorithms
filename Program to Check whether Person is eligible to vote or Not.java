import java.util.*;
class Voting
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Name: ");
      String name=sc.nextLine();
      System.out.println("Enter your age: ");
      int age=sc.nextInt();
      if((age>=18)&&(age<=100))
      {
          System.out.println("Congratulation "+name+", You are eligible for Voting");
      }
      else
      {
          System.out.println("Sorry "+name+", You are not eligible for voting");
      }      
  }
}
