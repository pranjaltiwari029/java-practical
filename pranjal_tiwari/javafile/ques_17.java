// package javafile;
import java.util.*;


class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class ques_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String input = sc.next();
        
        try {
            if (!input.equals("india")) {
                throw new NoMatchException("Input does not match 'india'.");
            }
            System.out.println("Input matches 'india'.");
        } 
        catch (NoMatchException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("execution completed");
        }

        // scanner.close();
    }
}

