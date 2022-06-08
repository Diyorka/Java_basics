package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(); //хуже при чтении(get)
        //head -> [5] -> [1] -> [2] -> [3] -> [4]...

        List<Integer> arrayList = new ArrayList<>(); //хуже при добавлении в начало/середину add(0, i)
        // [7][6][1][2][3][4][5]...

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
