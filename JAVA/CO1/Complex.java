import java.util.Scanner;

class Complex{
double a,b,c;
Scanner sc = new Scanner(System.in);

void readData(){
System.out.print("Enter the real part : ");
a = sc.nextDouble();
System.out.print("Enter the imaginary : ");
b = sc.nextDouble();
}

void add(Complex obj1, Complex obj2){
Complex obj = new Complex();
obj.a= obj1.a+obj2.a;
obj.b = obj1.b + obj2.b;
System.out.println("The sum is ");
System.out.print(obj.a+"+"+obj.b+"i");
}


public static void main(String args[]){
Complex obj1 = new Complex();
System.out.println("Enter first number");
obj1.readData();
Complex obj2 = new Complex();
System.out.println("Enter second number");
obj2.readData();
obj1.add(obj1,obj2);
}
}