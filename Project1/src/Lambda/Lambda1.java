package Lambda;

interface Executable{
    int execute(int x, int y);
}

class Runner{
    public void run(Executable e){
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class Lambda1 {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x+y;
            }
        });
        //проще
        runner.run( (int x, int y) -> {
            return x+y;
        });
        //еще проще
        runner.run((x,y) -> x+y); //один аргумент можно в лямбде без скобок
    }
}
