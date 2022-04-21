package ex0421;

public class CardLeader {
    protected int income;

    public CardLeader(){
        this.income = 0;
    }

    public void contact(Card card) {

        String type = card.getType();
        int fee = 0;
        if("성인".equals(type)){
            fee = 1500;
        }else if("학생".equals(type)){
            fee = 800;
        }else if("어르신".equals(type)){
            fee = 0;
        }else{
            System.out.println("잘못된 카드입니다.");
            return;
        }

        boolean enough = card.canPaiable(fee);

        if(enough){
            card.payment(fee);
            income += fee;
            System.out.println(card.getType() + "입니다.");
            System.out.println("남은 금액은: " + card.money + "입니다.");
        }else{
            System.out.println("잔액이 부족합니다. 당장 내리세요.");
        }
    }

    public int getIncome(){
        return this.income;
    }

    public static void main(String[] args) {
        CardLeader cardLeader = new CardLeader();
        Card card1 = new Card(18);
        card1.chargeingMoney(10000);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);
        cardLeader.contact(card1);

        Card card2 = new Card(0);
        card2.chargeingMoney(1000);
        cardLeader.contact(card2);

        System.out.println("오늘의 수입은 " + cardLeader.getIncome() + "원 입니다.");
    }
}
