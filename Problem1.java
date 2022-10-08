package day5;

public class Problem1 {
    public static void main(String[] args) {
        // to print a pattern
        int n = 4;
        for (int i = n; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
