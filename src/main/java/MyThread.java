class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Поток " + Thread.currentThread().getName() + ".Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }
}