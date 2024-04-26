import java.util.Scanner;

class BigArray{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int ar[] = new int[10];
System.out.print("Enter the limit of array : ");
int n = sc.nextInt();
System.out.println("Enter the elements");
for(int i=0;i<n;i++){
ar[i]=sc.nextInt();
}
int big=ar[0];
for(int i=0;i<n;i++){
if(ar[i]>big){
big=ar[i];
}
}
System.out.print("The biggest element = "+big);
}
}