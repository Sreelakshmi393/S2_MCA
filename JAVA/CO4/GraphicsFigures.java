import Graphics.*;

class GraphicsFigures{
public static void main(String args[]){

Circle c = new Circle(3);
System.out.println("The area of Circle is : "+c.area());

Rectangle r = new Rectangle(3,5);
System.out.println("The area of Rectangle is : "+r.area());

Square s = new Square(5);
System.out.println("The area of Square is : "+s.area());

Triangle t = new Triangle(3,4);
System.out.println("The area of Triangle is : "+t.area());
}
}