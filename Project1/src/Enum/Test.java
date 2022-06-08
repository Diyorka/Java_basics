package Enum;

public class Test {
    public static void main(String[] args) {
//        Animal animal = Animal.DOG;
//        System.out.println(animal.toString());

//        switch (animal){
//            case CAT:
//                System.out.println("Cat");
//                break;
//            case DOG:
//                System.out.println("Dog");
//                break;
//            default:
//                System.out.println("Frog");
//        }
        Season season = Season.SUMMER;
        Animal animal = Animal.CAT;
        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());
        System.out.println(frog.ordinal());
    }
}
