package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<>(); // не сохраняет порядок, наиболее быстрый, самый распространенный
//        Set<String> linkedHashSet = new LinkedHashSet<>(); // в каком порядке добавили, такой порядок и сохранит
//        Set<String> treeSet = new TreeSet<>(); // отсортированный порядок


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set1.add(i);
        }
        for (int i = 5; i < 15 ; i++) {
            set2.add(i);
        }

        // Union - объединение множеств
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        // Intersection - пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // оставляет элементы которые есть в обоих множествах
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);


    }

    private static void sets(Set<String> set){
        set.add("Mike");
        set.add("Diyor");
        set.add("Kolya");
        set.add("Aziz");

        for(String name : set){
            System.out.println(name);
        }
    }
}
