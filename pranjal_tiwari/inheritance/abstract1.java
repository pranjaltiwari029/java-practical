// package inheritance;
abstract class a{
    abstract void car();

}
class b extends a{
    public void car(){
        System.out.println("i own a super_nano and a vitara brezza");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        b obj=new b();
        obj.car();
        
    }
    

    
}
