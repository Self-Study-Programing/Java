public class RunnableSample implements Runnable {
    public void run(){
        System.out.println("This is RunnableSample's run() method");
    }
}

public class ThreadSample extends Thread {
    public void run(){
        System.out.println("This is ThreadSample's run() methos");
    }
}

public class RunThreads {
    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }

    public runBasic(){
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
    }
}

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads sample = new RunMultiThreads();
        sample.runMultiThread();
    }
    public runMultiThread(){
        RunnableSample []runnable = new RunnableSample[5];
        ThreadSample []thread = new ThreadSample[5];
        for(int loop = 0; loop<5; loop++){
            runnable[loop]=new RunnableSample();
            thread[loop] = ThreadSample();

            new Thread(runnable[loop]).start();
            thread[loop].start();
        }
        System.out.println("RunMutiThreads.runnMutiThread() method is ended");
    }
}

/**
 * Thread class
 * 
 * -- construct --
 * Thread()
 * Thread(Runnable target)
 * Thread(Runnable target, String name)
 * Thread(String name)
 * Thread(ThreadGroup group, Runnable target)
 * Thread(ThreadGroup group, Runnable target, String name)
 * Thread(ThreadGroup group, Runnable target, String name, long stackSize)
 * Thread(ThreadGroup group, String name)
 */