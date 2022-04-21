package ex0421;

public class Square extends Polygon{
    final int length;

    public Square(int length){
        this.length = length;
    }

    @Override
    public String getType() {
        return "정사각형";
    }

    @Override
    public double getArea() {
        return length * length;
    }

    public static void main(String[] args) {
        Square square = new Square(6);
        square.print();
    }
}
