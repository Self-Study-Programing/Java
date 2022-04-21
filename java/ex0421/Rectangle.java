package ex0421;

public class Rectangle extends Polygon {

    final int width;
    final int height;
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public String getType(){
        return "직사각형";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(8, 6);
        rectangle.print();
    }
}
