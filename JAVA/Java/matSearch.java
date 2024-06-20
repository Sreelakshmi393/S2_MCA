import java.util.Scanner;

public class matSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt(); 
        
        int arr[][] = new int[rows][cols];

        System.out.println();
        System.out.println("Enter the elements of the array");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                arr[i][j] = sc.nextInt();

        System.out.println();
        System.out.println("Enter the element to search");
        int n = sc.nextInt();

        outer : for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                if(n==arr[i][j]){
                    System.out.print(n+ " is found at the location "+ i + "," + j);
                    break outer;
                }
                sc.close();
    }
}
