package ex0425N;

public class Thread_Maker extends Thread{
    private CakePlate cake;

    public Thread_Maker(CakePlate cake){
        this.cake = cake;
    }

    public void run(){
        for(int i=0; i<50; i++){
            cake.makeBread();
        }
    }
}
