import java.util.Scanner;

class Products{
int pcode;
String pname;
int price;

void getData(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Product code : ");
this.pcode = sc.nextInt();
System.out.print("Enter the Product name : ");
this.pname = sc.next();
System.out.print("Enter the Product price : ");
this.price = sc.nextInt();
}

public static void main(String args[]){
Products obj1 = new Products();
Products obj2 = new Products();
Products obj3 = new Products();

obj1.getData();
obj2.getData();
obj3.getData();

if(obj1.price < obj2.price){
if(obj1.price < obj3.price){
System.out.println(obj1.pname+" has the lowest price");
}else{
System.out.println(obj3.pname+" has the lowest price");
}
}
else if(obj2.price < obj3.price){
System.out.println(obj2.pname+" has the lowest price");
}
else{
System.out.println(obj3.pname+" has the lowest price");
}
}
}
