/**
 * Java program to  find Greatest Common Divisor or GCD of 
 * two numbers using Euclid’s method.*/
 import java.util.*;
public class GCD{
  
    public static void main(String args[]){
     
        //Enter two number whose GCD needs to be calculated.      
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number to find GCD");
        int num2 = sc.nextInt();
      
        System.out.println("GCD of two numbers " + num1 +" and " 
                           + num2 +" is :" + GCD(num1,num2));
      
      
    }
    private static int GCD(int num1, int num2) {
        //base case
        if(num2 == 0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }
  
}