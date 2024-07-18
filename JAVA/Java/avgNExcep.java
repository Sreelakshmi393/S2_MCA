import java.util.Scanner;

public class avgNExcep {
    public static void main(String[] args) {
            double total = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the count of numbers : ");
            int n = sc.nextInt();
            int num[] = new int[n];
            System.out.println("Enter the numbers : ");
            for(int i=0; i<n; i++){
                num[i] = sc.nextInt();
                try{
                    if(num[i]<0) 
                        throw new NumberNegativeException();
                    else
                        total += num[i];
                }catch(NumberNegativeException e){
                    e.printStackTrace();
                }
            }
            System.out.print("Average is "+(total/n));
    }
}

class NumberNegativeException extends RuntimeException{
    NumberNegativeException(){
        super("Please enter only positive integers");
    }
}
