import java.util.Scanner;

interface meth{
    public void area();
    public void perimeter();
}
class Circle implements meth{
    int r;
    void getData(int r){
        this.r = r;
    }
    public void area(){
        System.out.println();
        System.out.print("Area of circle is "+(3.14*this.r*this.r));
    }
    public void perimeter(){
        System.out.println();
        System.out.print("Perimeter of circle is "+(2*3.14*this.r));
    }
}
class Rectangle implements meth{
    int l,b;
    void getData(int l, int b){
        this.l = l;
        this.b = b;
    }
    public void area(){
        System.out.println();
        System.out.print("Area of rectangle is "+(this.l*this.b));
    }
    public void perimeter(){
        System.out.println();
        System.out.print("Perimeter of rectangle is "+(2*(this.l+this.b)));
    }   
}



public class interfaceImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        int ch;
        do{
            System.out.println("\nEnter your choice: \n 1. Circle \n 2. Rectangle \n 3. Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the radius of circle : ");
                    int rad = sc.nextInt();
                    c.getData(rad);
                    c.area();
                    c.perimeter();
                    break;

                case 2:
                System.out.println("Enter the length of rectangle : ");
                int length = sc.nextInt();
                System.out.println("Enter the breadth of rectangle : ");
                int breadth = sc.nextInt();
                r.getData(length, breadth);
                r.area();
                r.perimeter();
                break;
                
                case 3:
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }while(ch!=3);
    }
    
}
