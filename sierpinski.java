import java.util.*;
import java.io.*;
class sierpinski
{
    static void printSierpinski(int n)
    {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k + i < n; k++) {
                if ((k & i) != 0)
                    System.out.print(" "+" ");
                else
                    System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner s= new Scanner(System.in);  
        n= s.nextInt();  
        printSierpinski(n);
    }
}
 