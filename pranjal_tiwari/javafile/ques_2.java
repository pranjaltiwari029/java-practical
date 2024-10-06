// WAP to find out factorial of a number through recursion.


package javafile;
import java.util.*;

public class ques_2 {
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number = ");
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println("factorial of "+n+" is = "+ans);
    }

    
}
