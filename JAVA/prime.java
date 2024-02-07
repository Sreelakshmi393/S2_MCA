import java.util.Scanner;

class prime{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = obj.nextInt();
        if(n%2==0){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
        
