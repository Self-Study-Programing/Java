public enum OverTimeValues {
    THREE_HOUR,
    FIVE_HOUR,
    WEEKEND_FOUR_HOUR,
    WEEKEND_EIGHT_HOUR
}

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value){
        int amount = 0;
        System.out.println(value);
        switch (value) {
            case THREE_HOUR:
                amount=18000;
                break;
            case FIVE_HOUR:
                amount=30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount=40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount=60000;
                break;
            default:
                break;
        }
        return amount;
    }

    public static void main(String[] args) {
        OverTimeManager manager = new OverTimeManager();
        int myAmount=manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
    }
}

public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;
    OverTimeValues2(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return amount;
    }
}
public class OverTimeManager2 {
    public static void main(String[] args) {
        OverTimeValues2 value2 = OverTimeValues2.FIVE_HOUR;
        System.out.println(value2);
        System.out.println(value.Amount());

        OverTimeValues2 value3 = OverTimeValues2.THREE_HOUR;
        System.out.println(value2.compareTo(value3));
    }
}