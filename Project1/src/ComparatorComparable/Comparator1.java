package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("frogggg");
        animals.add("catt");
        animals.add("birddd");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(150);
        numbers.add(17);
        numbers.add(84);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println(numbers);

    }
}


class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length()){
             return 1;
        }else if(o1.length()<o2.length()){
            return -1;
        }else{
            return 0;
        }
    }
}
