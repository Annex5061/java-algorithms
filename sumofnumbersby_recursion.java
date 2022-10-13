import java.util.Scanner;

public class sumofnumbersby_recursion {

    static int f(int i, int j, int count) {
        int total;
        if (i > j) {
            System.out.println(count);
            return 0;

        } else {
            count=count+i;
            i++;
            f(i,j,count);

        }

        return 0;
    }



    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int inp = sc.nextInt();
        int i = 0; int j=inp;
        int count = 0;
        f(i,j,count);

    }
}
