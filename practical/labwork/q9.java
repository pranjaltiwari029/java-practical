
import java.util.*;

class ride{
    int x,y;
    void get(int a){

        x=a;
    }
    void get(int a,int b){
        x=a;
        y=b;
    }
    public void show(){
        System.out.println(x);
        System.out.println(y);
    }
}

public class q9 {
    public static void main(String[] arg){

    ride obj= new ride();
    obj.get(76);
    obj.show();
    obj.get(67,89);
    obj.show();

    
    
    }
}
