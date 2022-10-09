//import required classes and packages  
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
//create DuckNumberExample class to check whether the given number is a Duck number or not  
public class DuckNumberExample {  
  
   // create checkNumber() method that returns true when it founds number Buzz   
   public static boolean checkNumber(int number) {  
  
      // use loop to repeat steps  
      while(number != 0) {  
  
         // check whether the last digit of the number is zero or not  
         if(number%10 == 0)  
            return true;    //return true if the number is Duck  
  
         // divide the number by 10 to remove the last digit  
         number = number / 10;  
      }  
  
      return false; //return false if the number is not Duck  
   }  
       // main() method start  
    public static void main(String args[])   
    {     
        int n1, n2;  
          
        //create scanner class object to get input from user  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter first number");  
          
        //store user entered value into variable n1  
        n1 = sc.nextInt();  
          
        //show custom message  
        System.out.println("Enter second number");  
          
        //store user entered value into variable n2  
        n2 = sc.nextInt();  
          
        if (checkNumber(n1))   
            System.out.println(n1 + " is a Duck number");   
        else  
            System.out.println(n1 + " is not a Duck number");   
        if (checkNumber(n2))   
            System.out.println(n2 + " is a Duck number");   
        else  
            System.out.println(n2 + " is not a Duck number");   
    }  
}  
Output

Duck Number Java
Let's implement one more program to get all the Duck number in a given range

FindAllDuckNumber.java

//import required classes and packages  
import java.util.*;   
import java.io.*;   
import java.util.Scanner;  
  
//create FindAllDuckNumber class to get all the Duck number in a given range  
class FindAllDuckNumber  
{  
    //main() method start  
    public static void main(String args[])  
    {  
        int range;  
          
        //create scanner class object  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter the value of range");  
          
        //store user entered value into variable range  
        range = sc.nextInt();  
  
        for(int i = 1; i <= range; i++)  
            if(checkNumber(i)){  
                System.out.println(i + " is a Duck number");  
            }  
    }  
  
    // create checkNumber() method that returns true when it founds number Buzz   
    public static boolean checkNumber(int number) {  
  
        // use loop to repeat steps  
        while(number != 0) {  
  
            // check whether the last digit of the number is zero or not  
            if(number%10 == 0)  
                return true;    //return true if the number is Duck  
  
            // divide the number by 10 to remove the last digit  
            number = number / 10;  
        }  
  
        return false;   //return false if the number is not Duck  
   }  
}  
