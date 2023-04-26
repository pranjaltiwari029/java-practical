import java.util.*;

class myexception extends Exception{
    public static toString(){
        return "myexception: Invalid age";
        
    }
}
public class ques18 {
    public static void main(String[] args) {
        
        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("enter a number = ");
            int n=sc.nextInt();
            if(n==10)
                throw new myexception();
            System.out.println("no");
        }

            catch(myexception e){
                System.out.println("caught "+e);

            }
            
        }
        
    }

    
}
