import java.util.Scanner;

class StringSort{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String fruits[] = new String[10];
System.out.println("Enter the number of strings : ");
int n = sc.nextInt();
System.out.println("Enter the strings");
for(int i=0;i<n;i++){
fruits[i] = sc.next();
}

System.out.println("Before sorting");
for(int i=0;i<n;i++)
System.out.println(fruits[i]);

for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(fruits[i].compareTo(fruits[j])>0){
String temp = fruits[i];
fruits[i] = fruits[j];
fruits[j] = temp;
}
}
}

System.out.println("After sorting");
for(int i=0;i<n;i++)
System.out.println(fruits[i]);
}
}
