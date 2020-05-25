import java.util.Timer;
import java.util.TimerTask;

class AnonymousClass extends TimerTask {
    @Override
    public void run () {
        System.out.print("Task invoked: " +
            (System.currentTimeMillis() - start) + " ms");
        System.out.println(" - " + Thread.currentThread());
        timer.cancel();
    }

    public static void main() {
        Timer timer = new Timer("Timer");
        long start = System.currentTimeMillis();
        TimerTask task = new AnonymousClass();

        long delay = 1000L;
        timer.schedule(task, delay);
    }
}
