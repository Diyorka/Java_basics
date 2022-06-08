package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedAndTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // нет гарантии порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();// как добавляем, такой и порядок
        Map<Integer, String> treeMap = new TreeMap<>(); // сортировка по ключу

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);

    }

    public static void testMap(Map<Integer,String> map){
        map.put(39, "Diyor");
        map.put(56, "Kolya");
        map.put(134, "Aziz");
        map.put(0, "Aidar");
        map.put(1403, "Diyor");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() +" - "+ entry.getValue());
        }
    }
}
