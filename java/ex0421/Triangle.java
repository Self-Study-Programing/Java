package ex0421;

public class Triangle extends Rectangle{
    public Triangle(int width, int height){
        super(width, height);
    }

    @Override
    public String getType() {
        return "삼각형";
    }

    @Override
    public double getArea() {
        return super.getArea() / 2;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 6);
        triangle.print();
    }
}
