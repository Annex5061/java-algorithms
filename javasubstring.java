package day3;

import java.util.*;

class javasubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any String value = ");
        String S = in.nextLine();
        System.out.println("Enter the start point = ");
        int start = in.nextInt();
        System.out.println("Enter the end point = ");
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
