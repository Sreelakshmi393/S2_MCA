class Student{
int id;
String name;
int age;
Student(int i, String n){
id = i;
name = n;
}
Student(int i, String n, int a){
id = i;
name = n;
age = a;
}
/*void display(){
System.out.print(id+" "+name+" "+age);
}*/
public static void main(String args[]){
Student s1 = new Student(1,"Sree");
System.out.println(s1.id+" "+s1.name);
Student s2 = new Student(2,"Lakshmi",22);
System.out.println(s2.id+" "+s2.name+" "+s2.age);
/*s1.display();
System.out.println();
s2.display();*/
}
}
