package R;

public class LinkedList {
    public LinkedList next = null;
    public final String data;

    public LinkedList(String data){
        this.data = data;
    }

    public String getNextData(){
        if(next != null) {
            return next.data;
        }
        return "null";
    }
    public void setNext(LinkedList list){
        next = list;
    }
}
