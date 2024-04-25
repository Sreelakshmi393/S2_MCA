import java.util.Scanner;
class Rectangle{
int length;
int breadth;
void getData(int x, int y){
length=x;
breadth=y;
}
int rectArea(){
int area = length*breadth;
return area;
}
}

class RectArea{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
Rectangle rect = new Rectangle();
System.out.print("Enter length : ");
int l = sc.nextInt();
System.out.print("Enter breadth : ");
int b = sc.nextInt();
rect.getData(l,b);
int ar = rect.rectArea();
System.out.print("Area = "+ar);
}
}
