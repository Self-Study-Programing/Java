package R;

public class Compare {
    public int compare(String want, LinkedList list){
        if(want.equals(list.data)){
            System.out.println("비겼습니다");
            return 1;
        }else if(want.equals(list.getNextData())){
            System.out.println("졌습니다");
            return 2;
        }else{
            System.out.println("이겼습니다");
            return 0;
        }
    }
}
