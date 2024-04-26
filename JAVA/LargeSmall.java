import java.util.Scanner;

class LargeSmall{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int ar[] = new int[10];
System.out.print("Enter the limit of array : ");
int n = sc.nextInt();
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
ar[i] = sc.nextInt();
System.out.println("The array is");
for(int i=0;i<n;i++){
System.out.print(ar[i]+" ");
}
int big = ar[0];
for(int i=0;i<n-1;i++){
if(ar[i]>big){
big = ar[i];
}
}
System.out.println();
System.out.print("The biggest element is : "+big);
int small = ar[0];
for(int i=0;i<n;i++){
if(ar[i]<small){
small = ar[i];
}
}
System.out.println();
System.out.print("The smallest element is : "+small);
}
}

