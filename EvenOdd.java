import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        int v=0,c=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String a = sc.nextLine();

        for (i=0; i<=a.length; i++){
            if(String.charAt[i]=='a' || String.charAt[i]=='e'||String.charAt[i]=='i'||String.charAt[i]=='o'||String.charAt[i]=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("Vowels: "+ v);
        System.out.println("Consonents: "+ c);
    }
}
