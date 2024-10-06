package javafile;


public class ques_14 {
    public static void main(String[] args) {
        int num = 76;
        int den = 0; 
        try {
            int ans = num / den;
            System.out.println("ans is  " + ans);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } 
        finally {
            System.out.println("Execution successfull.");
        }
    }

    
}
