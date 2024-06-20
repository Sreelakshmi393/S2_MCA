import java.util.Scanner;

public class matrixSymmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println();
        System.out.println("Enter the array elements");
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                arr[i][j] = sc.nextInt();

        int flag=0;
        outer : for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++){
                if (arr[i][j] != arr[j][i]){
                    flag=1;
                    break outer;
                }
            }
        if(flag==1){
            System.out.println("Matrix is not symmetric");
        }else{
            System.out.println("Matrix is symmetric");
        }
        sc.close();
    }
}
