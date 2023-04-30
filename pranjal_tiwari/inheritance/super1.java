
class a{
    public void show(){
        System.out.println("pranjal");
    }
}
class b extends a{
    
    public void show(){
        super.show();

        System.out.println("tiwari");
    }
}


public class super1 {
    public static void main(String[] args) {
        b obj=new b();
        obj.show();

    }

    
    
}
