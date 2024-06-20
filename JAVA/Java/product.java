import java.util.Scanner;

class Product{
    int pcode;
    String pname;
    Double price;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code :");
        this.pcode = sc.nextInt();
        System.out.println("Enter the product name :");
        this.pname = sc.next();
        System.out.println("Enter the price :");
        this.price = sc.nextDouble();
    }


    public static void main(String args[]){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        p1.getData();
        p2.getData();
        p3.getData();

        if (p1.price < p2.price){
            if (p1.price < p3.price){
                System.out.println(p1.pname + " has lowest price");
            }else{
                System.out.println(p3.pname + " has lowest price");
            }
        }else if(p3.price < p2.price){
            System.out.println(p3.pname + " has lowest price");
        }
        else{
            System.out.println(p2.pname + " has lowest price");
        }

    }
}
