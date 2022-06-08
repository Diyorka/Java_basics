package Uni;

public class Main {
    public static void main(String[] args) {

        Person Di = new Person(178,"Diyor");
        System.out.println(Di.name+"\'s height is "+Di.height);

        Person Diyor = new Person();
        System.out.println(Diyor.name);

        Person Daud = new Person("Daud");
        System.out.println(Daud.name);

        Student freshman = new Student("Diyor",178,1);
        freshman.tell();
        System.out.println();

        Animal tiger = new Animal();
        tiger.type = "тигр";
        tiger.name = "Артём";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Антон");
        tiger.display();

        Animal sparrow = new Animal();
        sparrow.type = "воробей";
        sparrow.name = "Капитан Джек";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();
        sparrow.holiday(2);
        sparrow.display();
    }

}



