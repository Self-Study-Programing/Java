package ex0421;

public class Circle extends Square2{
    public Circle(int length){
        super(length/2);
    }

    @Override
    public String getType() {
        return "원";
    }

    @Override
    public double getArea() {
        return super.getArea() * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8);
        circle.print();
    }
}
