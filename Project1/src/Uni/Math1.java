package Uni;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
//        int c=0;
//
//        for (int i = 0; i < 10000; i++) {
//            int cub1 = (int) (Math.random() * 6);
//            int cub2 = (int) (Math.random() * 6);
//            int cub3 = (int) (Math.random() * 6);
//            if(cub1==5 || cub2==5||cub3==5){
//                c++;
//            }
//
//        }
//        System.out.println((double)c/10000);

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("p: ");
        double p = sc.nextDouble();
        double q = 1-p;
        double sum=0;
        System.out.print("k: ");
        int k = sc.nextInt();

        System.out.println((Math.pow(n*p,k)*Math.pow(Math.E,-(n*p)))/getFactorial(k));

    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
