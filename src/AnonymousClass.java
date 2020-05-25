import java.util.Timer;
import java.util.TimerTask;

class AnonymousClass extends TimerTask {

    private long start;

    @Override
    public void run () {
        System.out.print("Task invoked: " +
            (System.currentTimeMillis() - start) + " ms");
        System.out.println(" - " + Thread.currentThread());
    }

    public static void main() {
        Timer timer = new Timer("Timer");
        TimerTask task = new AnonymousClass(start);
        task.start = System.currentTimeMillis();
        long delay = 1000L;
        timer.schedule(task, delay);
        timer.cancel();
    }
}
