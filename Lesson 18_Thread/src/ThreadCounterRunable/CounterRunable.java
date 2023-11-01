package ThreadCounterRunable;

public class CounterRunable implements Runnable{
    @Override
    public void run() {
        CounterThread counter = new CounterThread();
        counter.run();
    }
}
