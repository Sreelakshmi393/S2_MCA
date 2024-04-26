import java.util.Scanner;

class SortArray{
public static void main(String args[]){
try{
int a[] = new int[10];
Scanner sc = new Scanner(System.in);
System.out.print("Enter the array length : ");
int n = sc.nextInt();
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Before sorting");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp = a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println();
System.out.println("After sorting");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}catch(Exception e){}
}
}