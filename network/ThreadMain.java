package thread;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("main start");
//        Thread t1 = new Thread(new Runnable(){
//            @Override
//            public void run() {
//                for(int i=0; i<500; i++){
//                    System.out.println("t1 Thread: " + i);
//                }
//            }
//        });

        new Thread(() -> {
            for(int i=0; i<500; i++){
                System.out.println("t1 Thread: " + i);
            }
        }).start();

//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0; i<500; i++){
//                    System.out.println("t2 Thread: " + i);
//                }
//            }
//        });

        new Thread(() -> {
            for(int i=0; i<500; i++){
                System.out.println("t2 Thread: " + i);
            }
        }).start();

//        System.out.println("t1 start");
//        t1.start();
//        System.out.println("t2 start");
//        t2.start();

        System.out.println("main for start");
        for(int i=0; i<500; i++) {
            System.out.printf("main Thread: %d\n", i);
        }

        System.out.println("전체 종료");
    }
}
