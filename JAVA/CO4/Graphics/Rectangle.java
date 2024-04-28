package Graphics;

public class Rectangle implements Figures{
double length;
double breadth;

public Rectangle(double l, double b){
length = l;
breadth = b;
}

public double area(){
return length*breadth;
}
}