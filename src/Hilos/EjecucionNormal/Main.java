package Hilos.EjecucionNormal;

class Runner1{
    public void startRunning(){
        for (int i = 0; i < 10; i++){
            System.out.println("Running 1: "+ i);
        }
    }
}

class Runner2{
    public void startRunning(){
        for (int i = 0; i < 10; i++){
            System.out.println("Running 2: "+ i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        runner1.startRunning();
        runner2.startRunning();
    }
}
