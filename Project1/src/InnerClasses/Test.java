package InnerClasses;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(111);
        electrocar.start();
        Electrocar.Battery battery = new Electrocar.Battery();

    }
}
