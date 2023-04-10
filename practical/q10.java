import java.util.*;

class base{
    public void name(){
        System.out.println("base class");
    }
}

class derived extends base{
    public void name(){
        super.name();

        System.out.println("derived class");
        

    }
}

public class q10 {
    public static void main(String[] args) {
        derived obj=new derived();
        obj.name();
    }
    
}
