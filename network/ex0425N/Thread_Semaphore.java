package ex0425N;

import java.util.concurrent.Semaphore;

public class Thread_Semaphore implements Runnable{
    private int i = 0;
    private Semaphore sem = new Semaphore(1);

    public void run(){
        while(i<500){
            try {
                sem.acquire();
                for (int j = 0; j < 2000; j++) ;
                System.out.printf((Thread.currentThread()).getName() + " i = " + i);
                System.out.println();
                i++;
                sem.release();
            }catch (InterruptedException e) {}
        }
    }
}
