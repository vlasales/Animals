import java.util.Timer;
import java.util.TimerTask;

class AnonymousClass extends TimerTask {

    privarte long start;

    @Override
    public void run () {
        System.out.print("Task invoked: " +
            (System.currentTimeMillis() - start) + " ms");
        System.out.println(" - " + Thread.currentThread());
    }

    void setStart(long start) {
        this.start = start;
    }

    public static void main() {
        Timer timer = new Timer("Timer");
        TimerTask task = new AnonymousClass();
        task.setStart(System.currentTimeMillis());
        long delay = 1000L;
        timer.schedule(task, delay);
        timer.cancel();
    }
}
