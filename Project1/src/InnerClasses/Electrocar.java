package InnerClasses;

public class Electrocar {
    private int id;

    //Вложенный не статический класс
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" +id+ "is starting");
        }
    }

    //Статический вложенный класс
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public Electrocar(int id){
        this.id=id;
    }

    public void start(){

        final int x=1;

        class someClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " +id+ " is starting");
    }

}
