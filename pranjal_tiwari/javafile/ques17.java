// package pranjal_tiwari.javafile;
import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("enter numerator = ");
            int numerator=sc.nextInt();
            System.out.print("enter dinominator = ");
            int denominator=sc.nextInt();
            int quotient = numerator/denominator;
            System.out.println(quotient);
        }
        catch(ArithmeticException e){
            System.out.println("Not defined");
        }
        finally{
            System.out.println("All exception handled");
        }
    }
}