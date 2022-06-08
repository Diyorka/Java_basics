package Uni;

import java.util.ArrayList;
import java.util.Scanner;

public class CF1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        adding(list);
        show(list);
        search(list);
    }
    public static void adding (ArrayList n){
        Scanner sc = new Scanner(System.in);
        n.add(sc.nextLine());
    }
    public static void show(ArrayList n){
        System.out.println(n);
    }
    public static void search(ArrayList n){
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        for (int i = 0; i < n.size(); i++) {
            if(n.get(i).equals(n1)){
                System.out.println(n.get(i));
            }
        }
    }
}