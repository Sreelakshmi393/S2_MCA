import Graphics.*;

public class GraphicsPack {
    public static void main(String[] args) {
        
        Circle c = new Circle(3);
        System.out.print("Area of Circle is : "+c.area());
        System.out.println();

        Rectangle r = new Rectangle(4,5);
        System.out.print("Area of Rectangle is : "+r.area());
        System.out.println();

        Square s = new Square(5);
        System.out.print("Area of Square is : "+s.area());
        System.out.println();

        Triangle t = new Triangle(12, 8);
        System.out.print("Area of Triangle is : "+t.area());
        System.out.println();

    }
}
