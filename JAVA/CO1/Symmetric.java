import java.util.Scanner;

class Symmetric{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int ar[][] = new int[10][10];
System.out.print("Enter the size of matrix : ");
int n = sc.nextInt();
System.out.println("Enter the array elements");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
ar[i][j] = sc.nextInt();
}
}
int flag=0;
outer:for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(ar[i][j]!=ar[j][i]){
flag=1;
break outer;
}
}
}
if(flag==1)
System.out.println("The matrix is not symmetric");
else
System.out.println("The matric is symmetric");
System.out.println("Here's the matrix");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(ar[i][j]+" ");
}
System.out.println();
}
}
}