public class GenericSample {
    public static void main(String[] args) {
        GenericSample smaple = new GenericSample();
        smaple.checkCastingDTO();
    }

    public void checkCastingDTO(){
        CastignDto dto1 = new CastignDto();
    }
}

public void boundedWildcardMethod(WildcardGeneric<? extends Car> c){
    Car value = c.getWildcard();
    System.out.println(value);
}