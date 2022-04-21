package ex0421;

public class Circle2 extends Polygon{
    protected final int radius;

    public Circle2(int radius){
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "원";
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        Circle2 circle2 = new Circle2(5);
        circle2.print();
    }
}
