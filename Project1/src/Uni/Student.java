package Uni;

public class Student extends Person{
     int course = 1;

     public Student(String name,int height, int course){
        super(height,name);
        this.course=course;
     }

     void tell(){
         System.out.print(super.name+" ");
         System.out.print(super.height+" ");
         System.out.print(course);
     }
}
