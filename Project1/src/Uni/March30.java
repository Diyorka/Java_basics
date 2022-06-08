package Uni;

import java.util.ArrayList;
import java.util.Scanner;

public class March30 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        int[][] mat = {{10,3,4,5},
//                       {2,15,2,45},
//                       {42,53,20,2},
//                       {2,12,4,25}};
//        int sum=0;
//        for (int i = 0; i < 4; i++) {
//                sum+=mat[i][i];
//        }
//        System.out.println(sum);

//        int[] n = new int[10];
//        for (int i = 0; i < 10; i++) {
//            n[i]=sc.nextInt();
//        }
//        min(n);

        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Toyota");
        System.out.println(list);

//        int[] n = {1,4,5,1,2,5,2,5,6,8,3,2,4,1};
//        pary(n);

        }
    public static void prost(){
            int n1 = 2;
            int n2 = 2;
            for (int i = 2; i < 100; i++) {
                boolean yn = true;
                n1=i;
                for (int j = 2; j < i ; j++) {
                    if(i%j==0){
                        yn = false;
                        break;
                    }
                }
                if(yn){
                    if(n1 == n2+2){
                        System.out.println(n2+" "+n1);
                        n2=n1;
                    }else{
                        n2=n1;
                    }
                }
            }
        }
        public static void min(int[] n){
            int min = 999999999;
            int ind = -1;
            for (int i = 0; i < n.length; i++) {
                if(n[i]<min){
                    min=n[i];
                    ind=i;
                }
            }
            System.out.println(ind);
        }
        public static void reverse(String s){
            String[] s1 = s.split(" ");
            for (int i = 0; i < s1.length; i++) {
                String s2="";
                for (int j = s1[i].length()-1;j>=0; j--) {
                    s2+= s1[i].charAt(j);
                }
                s1[i]=s2;
                System.out.print(s2+" ");
            }
            }
        public static void ints(){
            int [] n = new int[100];
            for (int i = 0; i < 100; i++) {
                n[i]=(int)(Math.random()*10);
            }
            for (int i = 0; i < 10; i++) {
                int c=0;
                for (int j = 0; j < n.length; j++) {
                    if(i==n[j]){
                        c++;
                    }
                }
                System.out.println(i+" count: "+c);
            }
            }
        public static void pary(int n[]){
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            for (int i = 0; i < n.length; i++) {
                for (int j = 0; j < n.length; j++) {
                    if(i!=j && n[i]+n[j]==n1){
                        System.out.println(n[i]+" "+n[j]);
                    }
                }
            }
        }
        }


