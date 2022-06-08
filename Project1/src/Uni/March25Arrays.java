package Uni;

import java.util.Scanner;

public class March25Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(s.length());

//        int[] n = {0,0,1,1,2,2,3,4,5,6,7,7,8,8,9,10,11,14,14,15};
//        int c=0;
//
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]==0){c++;break;}
//        }
//
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j <n.length; j++) {
//                if(i!=j && n[i]==n[j]){
//                    n[j]=0;
//                }
//            }
//        }
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]!=0){
//                c++;
//            }
//        }
//        System.out.println(c);

     //   System.out.println(sum(sc.nextInt()));

    password("diyor12r2342");
    }
//    public static int sum(int n){
//        int sum=0;
//        while(n>0){
//            sum+=n%10;
//            n/=10;
//        }
//        return sum;


    public static void n() {
        int i = 0;
        int j = 0;
        while (i < 100) {
            boolean yn=true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    yn=false;
                    i++;
                    break;
                }
            }
            if(yn){
                if(j+2==i){
                    System.out.println(j+" "+i);
                    i++;
                }else{
                    j=i;
                    i++;
                }
            }
        }
    }
    public static void password(String p){
        boolean onlyld=true;
        if(p.length()<10){
            System.out.println("Less than 10 characters");
        }else{
            for (int i = 0; i < p.length(); i++) {
                if(Character.isDigit(p.charAt(i)) || Character.isAlphabetic(p.charAt(i))){
                    continue;

                }else{
                    System.out.println("Consists not only letters and digits");
                    onlyld=false;
                    break;
                }
            }
            if(onlyld){
                int digitc=0;
                for (int i = 0; i < p.length(); i++) {
                    if(Character.isDigit(p.charAt(i))){
                        digitc++;
                    }
                }
                if(digitc>=2){
                    System.out.println("Your password: "+p);
                }
            }

        }
    }
    }

