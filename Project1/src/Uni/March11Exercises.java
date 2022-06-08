package Uni;

import java.util.*;

public class March11Exercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("How many times do you want to enter numbers?");
//        int n = sc.nextInt();
//        int i=0;
//        int c=0;
//        do{
//            int x=sc.nextInt();
//            if(x<=20 && x>=10){
//                c++;
//            }
//            i++;
//        }while(i<n);
//        System.out.println("В интервале [10,20]: " + c);
//        int n = (int)(Math.random()*100);
//        System.out.println("Let's play a game! There is an integer [0, 100]");
//        System.out.println("Try to guess it");
//        int k = sc.nextInt();
//        while(k!=n){
//            if(k>n){
//                System.out.println("Your int is higher");
//            }else{
//                System.out.println("Your int is lower");
//            }
//            k = sc.nextInt();
//        }
//        System.out.println("YES! You're right!");
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; n>0; i++) {
            c++;
            n=n/10;
        }
        System.out.println(c);

        }

        }

