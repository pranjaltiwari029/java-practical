// package pranjal_tiwari.javafile;

class base{
    public void name(){
    System.out.println("this is base class");
    }
}
class derived extends base{
    public void name(){
        super.name();

        System.out.println("derived class");
        

    }
}

public class ques10 {
    public static void main(String[] args) {
        derived obj=new derived();
        obj.name();
    }
    
}
