package Enum;

public enum Animal {
    DOG("Собака"),CAT("Кот"),FROG("Лягушка");

    private String translation;
    Animal(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return translation;
    }
}
