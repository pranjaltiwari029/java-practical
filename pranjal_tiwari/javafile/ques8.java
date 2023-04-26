package pranjal_tiwari.javafile;

public class ques8 {
    
        public static void call_by_value(int number){
            number = number+1;  // increment variable by 1
            System.out.println("value in method: "+number);
        }
        
        int number=15;
        public static void call_by_reference(ques8 obj){
            obj.number = obj.number+1;  // increment variable by 1
            System.out.println("value in method: "+obj.number);
        }
        public static void main(String[] args) {
            int number=10;
            System.out.println("value before method call : "+number);
            call_by_value(number);
            System.out.println("value after method call: "+number);

            ques8 obj=new ques8(); 
        
            System.out.println("value before method call: "+obj.number);
            call_by_reference(obj); 
            System.out.println("value after method call: "+obj.number);
        }
}

