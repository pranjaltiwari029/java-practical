// WAP to print Fibonacci series.


package javafile;
import java.util.*;

public class ques_4 {
    public static int fib(int n) {
        if(n==1 ){
            return 0;
        }
        if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number = ");
        int num=sc.nextInt();
        for(int i=1;i<=num+1;i++){
            System.out.print(fib(i)+" ");
        }

        
    }
    
}
