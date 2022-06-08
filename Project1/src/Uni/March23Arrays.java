package Uni;

import java.util.Scanner;

public class March23Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"apple","monkey","hello","monkey","hand","apple","good"};
        int[] ar = {1,2,3,25,6,43,34,135,42,55,63,24,537,64};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(i==j){
//                    continue;
//                }else{
//                    if(arr[i].equals(arr[j])){
//                        System.out.println(arr[i]);
//                    }
//                }
//            }
//        }
//        int evenc=0;
//        int oddc=0;
//        for (int i = 0; i < ar.length; i++) {
//            if(ar[i]%2==0){
//                evenc++;
//            }else{
//                oddc++;
//            }
//        }
//        System.out.println();
//        System.out.println("Even:"+evenc);
//        System.out.println("Odd:"+oddc);

//        int[][] m1 = {{3,4,12},{53,2,4},{43,9,4}};
//        int[][] m2 = {{2,23,5},{35,34,17},{5,35,23}};
//        for (int i = 0; i < m1.length; i++) {
//            for (int j = 0; j < m2.length; j++) {
//                System.out.print(m1[i][j]+m2[i][j]+" ");
//            }
//            System.out.println();
//        }
//        double b = sc.nextDouble();
//        double h = sc.nextDouble();
//        System.out.println(areaPentagon(b,h));
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println(smallest(a,b,c));
        System.out.println(vowelCount("Hello World guys"));
        System.out.println(reversal(1458346));
    }

    //    Methods
    public static double areaPentagon(double b, double h){
        return ((b*h)/2)*5;

    }

    public static int smallest(int a, int b, int c){
        return Math.min(a,Math.min(b,c));
    }

    public static int vowelCount(String n){
        String vowels = "aouiey";
        int c=0;
        for (int i = 0; i < n.length(); i++) {
            if(vowels.contains(n.substring(i,i+1).toLowerCase())){
                c++;
            }
        }
        return c;
    }

    public static int reversal(int n){
        String s = "";
        while(n>0){
            s+=n%10;
            n/=10;
        }
        int s1 = Integer.parseInt(s);
        return s1;
    }
}
