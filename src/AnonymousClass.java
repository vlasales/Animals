class TimerTask@anonymous extends TimerTask {
    @Override
    public void run () {
        System.out.print("Task invoked: " +
            (System.currentTimeMillis() - start) + " ms");
        System.out.println(" - " + Thread.currentThread());
        timer.cancel();
    }
}

Timer timer = new Timer();
long start = System.currentTimeMillis();
TimerTask task = new TimerTas@anonymous();

timer.schedule(task);
