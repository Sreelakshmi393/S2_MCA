import java.lang.Thread;

class MultiplicationTable extends Thread {
    public void run() {
        try{
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
            sleep(2000);
        }
    }catch(Exception e){}
    }
}
class PrimeNumbers extends Thread {
    private int N;
    public PrimeNumbers(int N) {
        this.N = N;
    }
    public void run() {
        int count = 0;  
        int num = 2;    
        try{
        while (count < N) {
            if (isPrime(num)) {
                System.out.println(num);
                sleep(1800);
                count++;
            }
            num++;
        }
    }catch(Exception e){}
        System.out.println(); 
    }
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class primeThreadclass {
    public static void main(String[] args) {
        int N = 10; 
        MultiplicationTable tableThread = new MultiplicationTable();
        PrimeNumbers primeThread = new PrimeNumbers(N);
        tableThread.start();
        primeThread.start();
    }
}

