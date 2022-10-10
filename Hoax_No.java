//similar to smith no but we have to take only unique prime factors

import java.util.Scanner;
import java.lang.Math;

class Hoax{
    int num;
    int a=0, b=0;
    int [] li, li1;
    public Hoax(int n){
        num=n;
        li=new int[num];
    }
    public int[] factors(){
        int n=num;
        for(int i = 2; i <= Math.sqrt(n); i ++){
            while (n % i == 0) {
                li[a]=i;
                a++;
                n /= i;
            }
        }
        if(n>2){
            li[a]=n;
        }
        li1=new int[li.length];
        for(int i=0; i<li.length-1; i++){
            if(li[i]!=li[i+1]){
                li1[b]=li[i];
                b++;
            }
        }

        return li1;
    }
    public int sumDigits(){
        int n=num, sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    public int sumFactors(int[] li){
        int sum=0;
        for(int i=0; i<li.length; i++){
            if(li[i]!=0) {
                if(li[i]>9){
                    while(li[i]!=0){
                        int rem=li[i]%10;
                        sum+=rem;
                        li[i]/=10;
                    }
                }
                else {
                    sum += li[i];
                }
            }
        }
        return sum;
    }

}

public class Hoax_No {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a= sc.nextInt();
        Hoax s=new Hoax(a);
//        int[] li=s.factors();
//        for(int i=0; i<li.length; i++){
//            if(li[i]!=0){
//                System.out.println(li[i]);
//            }
//        }
        int sf=s.sumFactors(s.factors());
//        System.out.println(sf);
        int sd=s.sumDigits();
        if(sf==sd){
            System.out.println(a+" is a Hoax number.");
        }
        else{
            System.out.println(a+" is not a Hoax number.");
        }
    }
}
