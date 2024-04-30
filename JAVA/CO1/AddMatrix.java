import java.util.Scanner;

class AddMatrix{
Scanner sc = new Scanner(System.in);
int n,m;
int ar[][];
AddMatrix(int x){
System.out.print("Enter the row and col of matrix "+x+ " : ");
n = sc.nextInt();
m = sc.nextInt();
ar = new int[n][m];
System.out.println("Enter the matrix elements");
for(int i=0;i<n;i++)
for(int j=0;j<m;j++)
ar[i][j] = sc.nextInt();
}

void add(AddMatrix a, AddMatrix b){

if(a.n!=b.n || a.m!=b.m){
System.out.println("Matrix addition not possible");
}else{
for(int i=0;i<n;i++){
for(int j=0;j<m;j++){
a.ar[i][j]+=b.ar[i][j];
}
}
System.out.println("The sum of these two matrices is ");
this.display();
}
}

void display(){
for(int i=0;i<n;i++){
for(int j=0;j<m;j++)
System.out.print(ar[i][j]+ " ");
System.out.println();
}
}

public static void main(String args[]){
AddMatrix a = new AddMatrix(1);
AddMatrix b = new AddMatrix(2);
a.add(a,b);
}
}
