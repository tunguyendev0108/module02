package CreatThread;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My thread run is over");
    }
}
