import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        int i,j,flag=0;
        int k = (int)str.length()/2;
        for(i=0, j=str.length()-1; j>=k; i++, j-- ){
            if(str.charAt(i)!=str.charAt(j)){
                flag =1;
                break;
            }
        }
        if(flag==1){
            System.out.println("String is not palindrome");
        }else{
            System.out.println("String is palindrome");
        }
        sc.close();
    }
    
}
