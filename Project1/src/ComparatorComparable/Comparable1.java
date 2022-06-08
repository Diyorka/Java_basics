package ComparatorComparable;

import java.util.*;

public class Comparable1 {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Set<Animal> animalSet = new TreeSet<>();

        addElements(animalList);
        addElements(animalSet);

        System.out.println(animalList);
        System.out.println(animalSet);
    }
    private static void addElements(Collection collection){
        collection.add(new Animal(1, "Dog"));
        collection.add(new Animal(3, "Frog"));
        collection.add(new Animal(2, "Ca"));
        collection.add(new Animal(4, "Giraffe"));

    }
}
class Animal implements Comparable<Animal>{
    private int id;
    private String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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

    @Override
    public int compareTo(Animal o) {
        if(this.name.length() > o.getName().length()){
            return 1;
        }else if(this.name.length() < o.getName().length()){
            return -1;
        }else{
            return 0;
        }
    }
}