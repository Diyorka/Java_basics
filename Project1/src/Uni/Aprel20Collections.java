package Uni;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Aprel20Collections {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

//        for (int i = 0; i < 10000; i++) {
//            linkedList1.add(i);
//            linkedList.add(i);
//        }
//        linkedList.set(2,5);
//
//        if(linkedList.size()==linkedList1.size()) {
//            for (int i = 0; i < linkedList.size(); i++) {
//                if (linkedList.get(i).equals(linkedList1.get(i))) {
//                    continue;
//                } else {
//                    System.out.println("Не равны");
//                    break;
//                }
//            }
//        }else{
//            System.out.println("Ne ravny");
        //}

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

    }
}
