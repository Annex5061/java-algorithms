package com.example.demo;

import java.util.*;

class example{
    public static void main(String[] args){

        // create linkedlist
        LinkedList<String> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // Add elements to LinkedList
        System.out.println("Options:");
        System.out.println("1. Enter element.\n2. Exit.");
        System.out.println("Enter choice: ");
        int ch = 1;
        ch = Integer.parseInt(sc.nextLine());
        do{
            switch(ch){
                case 1:
                    //insert the element.
                    System.out.println("Enter the element: ");
                    String element = sc.nextLine();
                    ll.add(element);
                    break;

                case 2:
                    //exit the loop,
                    ch=2;
                    System.out.println("Ending insertion into linked list...");
                    break;

                default:
                    //invalid choice:
                    System.out.println("Enter a valid input!");
                    break;
            }
            System.out.println("Enter choice: ");
            ch = Integer.parseInt(sc.nextLine());
        }while(ch!=2);
        System.out.println("LinkedList: " + ll);
    }
}