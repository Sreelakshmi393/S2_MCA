import java.util.Scanner;;

public class Complex {
    double real, imag;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part");
        real = sc.nextDouble();
        System.out.println("Enter the imaginary part");
        imag = sc.nextDouble();
    }
    void add(Complex obj1, Complex obj2 ){
        this.real = obj1.real + obj2.real;
        this.imag = obj1.imag + obj2.imag;
        System.out.println("Sum = "+ this.real + " + " + this.imag + "i");
    }
    public static void main(String args[]){
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        obj1.getData();
        obj2.getData();
        obj1.add(obj1,obj2);
    }   
}


