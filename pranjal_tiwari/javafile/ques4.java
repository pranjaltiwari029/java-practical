// 4. WAP to obtain a number by a user & check if it’s prime or not.

package pranjal_tiwari.javafile;
import java.util.*;

public class ques4 {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        return isPrime;
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number to check for prime = ");
        int n=sc.nextInt();

       System.out.println( isPrime(n));
    }
}
