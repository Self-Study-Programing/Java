package ex0421;

public class Card {
    protected int age;
    protected String kind;
    protected int money;
    protected boolean success = true;

    public Card(int age){
        this.age = age;
        this.money = 0;

        if(age <= 0){
            System.out.println("잘못된 카드가 생성되었습니다.");
            success = false;
            return;
        }

        if(age < 20){
            kind =  "학생";
        }else if(age <= 65){
            kind =  "어른";
        }else{
            kind =  "어르신";
        }
        System.out.println(kind + "카드가 생성되었습니다.");
    }

    public String getType() {
        if(!success){
            return "알수없음";
        }
        return kind;
    }

    public boolean canPaiable(int fee){
       return money >= fee;
    }

    public void payment(int fee){
        money -= fee;
    }

    public void chargeingMoney(int amount){
        if(!success){
            System.out.println("이상한 카드가 찍혔습니다.");
            return;
        }
        money += amount;
        System.out.println(amount + "원 충전되어 현재 " + money + "원 있습니다.");
    }
}
