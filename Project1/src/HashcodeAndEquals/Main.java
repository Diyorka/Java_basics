package HashcodeAndEquals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Diyor");
        Person person2 = new Person(1, "Diyor");
        Person person3 = new Person(3, "Aziz");

        map.put(person1, "1");
        map.put(person2, "2");
        map.put(person3, "3");

        set.add(person1);
        set.add(person2);
        set.add(person3);

        System.out.println(map);
        System.out.println(set);

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    // {object} -> {int}
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    /*
        Контракт hashcode() equals()
        1) у двух проверяемых вызывается hashcode()
        если хэши разные - объекты точно разные.

        2) если хэши одинаковые -> equals(), так как возможно объекты разные(коллизия),
        но хэши одинаковые из-за ограничений int

        3) equals() выдает точный ответ

     */

}

