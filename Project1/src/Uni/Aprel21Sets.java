package Uni;

import java.util.*;

public class Aprel21Sets {
    public static void main(String[] args) {

//        ArrayDeque<Integer> ad = new ArrayDeque<>();
//        ad.add(1);
//        ad.add(7);
//        ad.add(10);
//        System.out.println(ad);
//
//
//        ad.pollFirst();
//        System.out.println(ad);
//
//        ArrayList<Integer> arrayList = new ArrayList<>(ad);
//        System.out.println(arrayList);
//
//        ad.clear();
//        System.out.println(ad);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Diyor");
        hashMap.put(2,"Aziz");

//        HashMap<Integer, String> hashMap1 = new HashMap<>(hashMap);
//        System.out.println(hashMap);
//        System.out.println(hashMap.size());
//        System.out.println(hashMap1);
//        System.out.println(hashMap.get(1));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(hashMap.containsKey(n)){
            System.out.println("Contains key");
        }
        String s = sc.next();
        if(hashMap.containsValue(s)){
            System.out.println("Contains value");
        }

        System.out.println(hashMap.keySet());



    }
}
