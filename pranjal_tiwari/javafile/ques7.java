// package pranjal_tiwari.javafile;

class counter{
    static int count;
    counter(){
        count++;
        System.out.println("object number = "+count);
    }
}

public class ques7 {
    public static void main(String[] args) {
        counter obj1=new counter();
        counter obj2=new counter();
        counter obj3=new counter();
        counter obj4=new counter();
        counter obj5=new counter();
    }
}
