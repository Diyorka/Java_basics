package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Diyor"));
        people.add(new Person(3, "Kolya"));
        people.add(new Person(2, "Aziz"));

        Collections.sort(people, (Comparator<Person>) (o1, o2) -> {
            if(o1.getId()>o2.getId()){
                return 1;
            }else if(o1.getId()<o2.getId()){
                return -1;
            }else{
                return 0;
            }
        });
        System.out.println(people);
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
