package ex0422N;

public class ThreadMain {
    public static void main(String[] args) {
        Thread1 m1 = new Thread1();
        Thread1 m2 = new Thread1();
        Thread1 m3 = new Thread1();
        Thread1 m4 = new Thread1();
        Thread1 m5 = new Thread1();

        Thread t1 = new Thread(m1, "T1");
        Thread t2 = new Thread(m2, "T2");
        Thread t3 = new Thread(m3, "T3");
        Thread t4 = new Thread(m4, "T4");
        Thread t5 = new Thread(m5, "T5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
    }
}
