package Uni;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCl {
    public static void main(String[] args) {

        int n = 20;
        for (int i = 0; i < n; i++) {
            int ch = 0;
            int i2=i;
            while(i2>0) {
                ch+=i%10;
                i2=i2/10;
            }
            int ch2=0;
            if(ch>9) {
                while (ch > 0) {
                    ch2 += ch % 10;
                    ch = ch / 10;
                }
            }else{
                ch2=ch;
            }
            if(ch2==0 || ch2==3 || ch2==6 || ch==9){
                System.out.println(0);
            }else if(ch2==1||ch2==4||ch2==7){
                System.out.println(1);
            }else if(ch2==2||ch2==5|ch2==8){
                System.out.println(2);
            }
        }


    }
}
