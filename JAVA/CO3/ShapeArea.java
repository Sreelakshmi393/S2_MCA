import java.util.Scanner;

class Shape{
int length;
int breadth;
void getData(int l, int b){
length = l;
breadth = b;
}
void getData(int l){
length = l;
}
int area(int l, int b){
int ar = l*b;
return ar;
}
int area(int l){
int ar = l*l;
return ar;
}
}
class ShapeArea{
public static void main(String args[]){
try{
Scanner sc = new Scanner(System.in);
Shape s = new Shape();
int ch=0;
do{
System.out.println("Enter your choice");
System.out.println("1. Area of Rectangle");
System.out.println("2. Area of Square");
System.out.println("3. Exit");
ch = sc.nextInt();
switch(ch){
case 1:
{
System.out.print("Enter the length : ");
int l = sc.nextInt();
System.out.print("Enter the breadth : ");
int b = sc.nextInt();
int a = s.area(l,b);
System.out.println("Area of rectangle = "+a);
break;
}
case 2:
{
System.out.print("Enter the side length : ");
int si = sc.nextInt();
int a = s.area(si);
System.out.println("Area of sqaure = "+a);
break;
}
case 3:
break;
default:
{
System.out.println("Invalid choice");
break;
}
}
}
while(ch!=3);
}catch(Exception e){}
}
}



