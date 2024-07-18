import java.util.Scanner;

class employee{
    int eNo;
    String eName;
    int eSalary;
    void readData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee number : ");
        eNo = sc.nextInt();
        System.out.println("Enter the employee name : ");
        eName = sc.next();
        System.out.println("Enter the employee salary : ");
        eSalary = sc.nextInt();
    }
    void display(){
        System.out.println("Name : "+eName); 
    }
}
public class employeeArrObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of employees : ");
        int n = sc.nextInt();  
        employee obj[] = new employee[n];
        for(int i=0;i<n;i++){
            obj[i] = new employee();
            obj[i].readData();
        }
        System.out.println("Search employee here");
        while(true){
            System.out.println("Enter the employee number : ");
            int no = sc.nextInt();
            
            for(int i=0;i<n;i++){
                if(obj[i].eNo==no){
                    obj[i].display();
                    break;
                }
            }
        }
    }  
}
