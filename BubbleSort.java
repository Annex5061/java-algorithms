import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<a.length; i++){
            a[i] = scan.nextInt();
        }
        System.out.println("Array before sorting: ");
        print(a);
        long start = System.nanoTime();
        bubble(a);
        long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Array after sorting: ");
        print(a);
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
    static void print(int[] a){
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void bubble(int[] a){
        int x = a.length;
        for(int i = 0; i<x-1; i++){
            int flag = 0;
            for (int j = 0; j<x-1; j++){
                if (a[j]> a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    flag++;
                }
            }
            if (flag == 0){
                break;
            }
        }
    }
}
