public class Main {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("group1");
        Thread thread1 = new MyThread(group, "thread1");
        Thread thread2 = new MyThread(group, "thread2");
        Thread thread3 = new MyThread(group, "thread3");
        Thread thread4 = new MyThread(group, "thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        group.interrupt();
    }
}
