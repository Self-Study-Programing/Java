package ex0425N;

public class SemaPhoreMain {
    public static void main(String[] args) {
        Thread_Semaphore m1 = new Thread_Semaphore();

        Thread t1 = new Thread(m1, "t1");
        Thread t2 = new Thread(m1, "t2");
        Thread t3 = new Thread(m1, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
