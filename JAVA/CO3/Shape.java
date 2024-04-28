import java.util.Scanner;

interface Objects{
public void area();
public void perimeter();
}

class Circle implements Objects{
int radius;

Circle(int r){
radius = r;
}

public void area(){
double x = 3.14*radius*radius;
System.out.println("The area of circle is : "+x);
}

public void perimeter(){
double y = 2*3.14*radius;
System.out.println("The perimeter of circle is : "+y);
}
}

class Rectangle implements Objects{
int length,breadth;

Rectangle(int l,int b){
length = l;
breadth = b;
}

public void area(){
int x1 = length*breadth;
System.out.println("The area of rectangle is : "+x1);
}

public void perimeter(){
int y1 = 2*(length+breadth);
System.out.println("The perimeter of rectangle is : "+y1);
}
}



class Shape{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int ch=0;
do{
System.out.println("Enter your choice");
System.out.println("1.Circle");
System.out.println("2. Rectangle");
System.out.println("3. Exit");
ch = sc.nextInt();
switch(ch){
case 1:
int r;
System.out.println("Enter the radius");
r = sc.nextInt();
Circle c = new Circle(r);
c.area();
c.perimeter();
break;
case 2:
int l,b;
System.out.println("Enter the length");
l = sc.nextInt();
System.out.println("Enter the breadth");
b = sc.nextInt();
Rectangle rec = new Rectangle(l,b);
rec.area();
rec.perimeter();
break;
case 3:
break;
default:
System.out.println("Invalid choice");
}
}while(ch!=3);
}
}