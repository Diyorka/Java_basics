package Uni;

public class Animal {
        String type = "default";
        String name = "default";
        int age = 0;
        double weight = 0;
        boolean isFly=true;
        boolean isWalk=true;
        boolean isSwim=true;

        void display(){
            System.out.println("Тип: " + type + ", Имя: " +name+
                                ", Возраст: "+ age +", Вес: "+ weight + ", Умеет летать: "+
                                isFly + ", Умеет ходить: " + isWalk + ", Умеет плавать: " + isSwim);
        }

        void rename(String n){
            name=n;
        }

        void holiday(int h){
            weight+=0.1*h;
        }

    }

