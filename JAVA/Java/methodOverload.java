import java.util.Scanner;
class areaFig {
    int l, b;
    void getData(int l, int b){
        this.l = l;
        this.b = b;
    }
    int area(int l, int b){
        int ar = l*b;
        return ar;
    }
    void getData(int l){
        this.l = l;
    }
    int area(int l){
        int ar = l*l;
        return ar;
    }
}

public class methodOverload{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        areaFig obj = new areaFig();

        System.out.print("Enter the length of rectangle : ");
        int l = sc.nextInt();
        System.out.println();
        System.out.print("Enter the breadth of rectangle : ");
        int b = sc.nextInt();
        obj.getData(l,b);
        int arRect = obj.area(l, b);
        System.out.print("Area of rectangle is : "+ arRect);
        System.out.println();

        System.out.print("Enter the side of square : ");
        int side = sc.nextInt();
        obj.getData(side);
        int arSq = obj.area(side);
        System.out.print("Area of square is : "+arSq);
    }
}
