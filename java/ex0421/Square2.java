package ex0421;

public class Square2 extends Rectangle{
    public Square2(int width){
        super(width, width);
    }

    @Override
    public String getType() {
        return "정사각형";
    }

    public static void main(String[] args) {
        Square2 square2 = new Square2(6);
        square2.print();
    }
}
