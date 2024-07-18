import java.util.Scanner;

public class strSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of strings : ");
        int n = sc.nextInt();
        String words[] = new String[n];
        System.out.println("Enter the strings : ");
        for(int i=0; i<n; i++){
            words[i] = sc.nextLine();
        }
        System.out.println("Before sorting : ");
        for(int i=0;i<n;i++)
            System.out.println(words[i]);
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(words[j].compareTo(words[i])<0){
                String s = words[i];
                words[i] =  words[j];
                words[j] = s;
                }
            }
        }
        System.out.println("After sorting : ");
        for(int i=0;i<n;i++)
            System.out.println(words[i]);
        
        sc.close();
    }
}
