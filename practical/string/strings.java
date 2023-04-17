package string;
import java.util.*;

public class strings {
    public static void main(String[] args) {
        String a="pranjal";
        String b="tiwari";
        int c=a.length();
        
        System.out.println(c);
        int d=b.charAt(3);
        System.out.println(d);
        System.out.println(a.substring(0, 5));
        if(a.equals(b)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

    }
    
}
