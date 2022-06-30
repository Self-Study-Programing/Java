public class Constructor1{
    public Constructor1(){}
    public Constructor1(String arg){}
    public static void main(String[] args) {
        Constructor1 con = new Constructor1();
    }
}

public class MemberDTO{
    public String name;
    public String phone;
    public String email;
    public MemberDTO(){
        // 아무 정보도 모를 때
    }
    public MemberDTO(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public MemberDTO(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class StaticBlock {
    static int data=1;
    public StaticBlock(){
        System.out.println("StaticBlock Constructor");
    }
    static {
        System.out.println("*** First static block. ***");
    }
    static {
        System.out.println("*** Second static block. ***");
    }
    public static int getData(){
        return data;
    }
}