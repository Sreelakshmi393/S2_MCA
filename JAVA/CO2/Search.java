import java.util.Scanner;

class Search{

static int linearSearch(int[] ar,int ele){
for(int i=0;i<ar.length;i++){
if(ar[i]==ele)
return i;
}
return -1;
}


public static void main(String args[]){
int ar[] = new int[10];
int flag=0;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of array");
int n = sc.nextInt();

System.out.println("Enter the elements of the array");
for(int i=0;i<n;i++)
ar[i] = sc.nextInt();

System.out.println("Enter the element to search");
int ele = sc.nextInt();
int index = linearSearch(ar,ele);
if(index == -1)
System.out.println("Element not found");
else
System.out.println("Element found");
}
}