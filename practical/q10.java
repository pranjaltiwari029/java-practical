import java.util.*;

class base{
    public void name(){
        System.out.println("implementing super class");
    }
}

class derived extends base{
    public void name(){
        super.name();

        System.out.println("derived class");
    }
}

public class q10 {
    public static void main(){
        derived obj=new derived();
        obj.name();
    }
    
}
