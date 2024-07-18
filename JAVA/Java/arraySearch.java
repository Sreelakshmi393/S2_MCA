import java.util.Scanner;

public class arraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to search");
        int ele = sc.nextInt();
        int flag=0;
        for(int i=0; i<n; i++)
            if(arr[i]==ele){
                System.out.print(n+ "  is found at the location "+ (i+1));
                flag=1;
                break;
            }
        if(flag == 0)
            System.out.print("Element not found");
        sc.close();
    }
}
