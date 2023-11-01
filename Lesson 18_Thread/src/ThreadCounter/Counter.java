package ThreadCounter;

public class Counter extends Thread {

    @Override
    public void run() {
        for (int i = 10;i >= 0;i--){
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
