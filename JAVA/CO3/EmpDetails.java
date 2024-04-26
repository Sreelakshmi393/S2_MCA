import java.util.Scanner;

class Employee{

int empid,salary;
String name,address;
Scanner sc = new Scanner(System.in);
Employee(int a){
System.out.println("Enter the details of teacher "+a);
System.out.println("Enter the employee id");
empid = sc.nextInt();
System.out.println("Enter the name");
name = sc.next();
System.out.println("Enter the salary");
salary = sc.nextInt();
System.out.println("Enter the address");
address = sc.next();
}
}

class Teacher extends Employee{
String dept;
int n;
String sub[];
Teacher(int a){
super(a);
System.out.println("Enter the department");
dept = sc.next();
System.out.println("Enter number of subjects taught");
n = sc.nextInt();
sub = new String[n];
System.out.println("Enter the subjects");
for(int i=0;i<n;i++)
sub[i] = sc.next();
}

void display(int x){
System.out.println(" Details of teacher number "+x);
System.out.println("Employee id : "+empid);
System.out.println("Name : "+name);
System.out.println("Salary : "+salary);
System.out.println("Address : "+address);
System.out.println("Department : "+dept);
System.out.println("Subjects ");
for(int i=0;i<n;i++)
System.out.println(sub[i]+" ");
}
}

class EmpDetails{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of teachers");
int num = sc.nextInt();
Teacher tr[] = new Teacher[num];
for(int i=0;i<num;i++)
tr[i] = new Teacher(i+1);
for(int i=0;i<num;i++)
tr[i].display(i+1);
}
}

