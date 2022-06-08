package Uni;

import java.util.Scanner;

public class Aprel27OOP {
    Scanner sc = new Scanner(System.in);

    double coffee, sugar, milk;

    Aprel27OOP() {
        coffee = 1000;
        sugar = 1000;
        milk = 1000;
    }

    public void getCappucino() {
        if (sugar >= 100) {
            if (coffee >= 150) {
                if (milk >= 200) {
                    System.out.println("Take your Cappucino");
                    sugar -= 100;
                    coffee -= 150;
                    milk -= 200;
                } else {
                    System.out.println("Not enough milk! Do you want to add milk? (enter 'y' or 'n')");
                    String yn = sc.next();
                    if (yn.equals("y")) {
                        System.out.println("How much do you want to add?");
                        addMilk(sc.nextInt());
                    } else {
                        System.out.println("Bye");
                    }
                }
            } else {
                System.out.println("Not enough coffee! Do you want to add? (y/n)");
                String yn = sc.next();
                if (yn.equals("y")) {
                    System.out.println("How much do you want to add?");
                    addCoffee(sc.nextInt());
                } else {
                    System.out.println("Bye");
                }
            }
        } else {
            System.out.println("Not enough sugar! Do you want to add? (y/n)");
            String yn = sc.next();
            if (yn.equals("y")) {
                System.out.println("How much do you want to add?");
                addSugar(sc.nextInt());
            } else {
                System.out.println("Bye");
            }
        }
    }

    public void getLatte() {
        if (sugar >= 150) {
            if (coffee >= 150) {
                if (milk >= 150) {
                    System.out.println("Take your Latte");
                    sugar -= 150;
                    coffee -= 150;
                    milk -= 150;
                } else {
                    System.out.println("Not enough milk! Do you want to add milk? (enter 'y' or 'n')");
                    String yn = sc.next();
                    if (yn.equals("y")) {
                        System.out.println("How much do you want to add?");
                        addMilk(sc.nextInt());
                    } else {
                        System.out.println("Bye");
                    }
                }
            } else {
                System.out.println("Not enough coffee! Do you want to add? (y/n)");
                String yn = sc.next();
                if (yn.equals("y")) {
                    System.out.println("How much do you want to add?");
                    addCoffee(sc.nextInt());
                } else {
                    System.out.println("Bye");
                }
            }
        } else {
            System.out.println("Not enough sugar! Do you want to add? (y/n)");
            String yn = sc.next();
            if (yn.equals("y")) {
                System.out.println("How much do you want to add?");
                addSugar(sc.nextInt());
            } else {
                System.out.println("Bye");
            }
        }
    }

    public void addSugar(double sugar) {
        this.sugar += sugar;
    }

    public void addCoffee(double coffee) {
        this.coffee += coffee;
    }

    public void addMilk(double milk) {
        this.milk += milk;
    }



//    String make;
//    int year;
//    double speed;
//
//    Uni.Aprel27OOP(String make, int year, double speed){
//        this.make=make;
//        this.year=year;
//        this.speed=speed;
//    }
//
//    public String getMake() {
//        return make;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public double getSpeed() {
//        return speed;
//    }





//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAnimal() {
//        return animal;
//    }
//
//    public void setAnimal(String animal) {
//        this.animal = animal;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }



//    double radius;
//
//    Uni.Aprel27OOP(){
//        radius=1;
//    }
//    Uni.Aprel27OOP(double radius){
//        this.radius=radius;
//    }
//
//    public void getRadius(){
//        System.out.println(radius);
//    }
//
//    public void getArea(){
//        System.out.println(Math.PI*radius*radius);
//    }



//    public void getArea(){
//        System.out.println((side1*side2)/2);
//    }
//
//    public void getPerimeter(){
//        System.out.println(side1+side2+side3);
//    }

    //double num1,num2,num3;
//    double length,breadth;
//
//
//    public void setDim(double length, double breadth){
//        this.length=length;
//        this.breadth=breadth;
//    }
//
//    public void area(){
//        System.out.println(length*breadth);
//    }



//    Uni.Aprel27OOP(double num1, double num2, double num3){
//        this.num1=num1;
//        this.num2=num2;
//        this.num3=num3;
//    }
//
//    public void calculate(){
//        System.out.println((num1+num2+num3)/3);
//    }
}
