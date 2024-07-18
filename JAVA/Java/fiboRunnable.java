import java.util.Scanner;

class Even implements Runnable{
    int e,s;
    Even(int a, int b){
        s = a;
        e = b;
    }
    public void run(){
        for(int i=s; i<=e; i++){
            if(i%2==0){
                System.out.println("Even : "+i);
            }
        }
    }
}
class Fibo implements Runnable{
    int a=0;
    int b=1;
    int c,num;

    Fibo(int n){
        num = n;
    }

    public void run(){
        for(int j=2;j<=num;j++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
public class fiboRunnable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibbonaci nunmbers : ");
        int n = sc.nextInt();
        System.out.println("Enter the start of the even number : ");
        int start = sc.nextInt();
        System.out.println("Enter the end of the even number : ");
        int end = sc.nextInt();
        Even obj1 = new Even(start, end);
        Thread e = new Thread(obj1);
        Fibo obj2 = new Fibo(n);
        Thread f = new Thread(obj2);
        e.start();
        f.start();
    } 
}
