package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//
//        list.remove(5);
//        System.out.println(list);
//
//        //мы проводим много удалений из листа
//
//        list = new LinkedList<>();

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(5);
        System.out.println(myLinkedList);

    }
}
