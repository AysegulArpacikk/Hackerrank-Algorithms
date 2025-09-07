package multithreading;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 23, 45, 9, 52, 78};

        MyThread thread1 = new MyThread(array);
        MyThread thread2 = new MyThread(array);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Main thread is finishing");
    }
}
