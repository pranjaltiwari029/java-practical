class a{
    public void show1(){
        System.out.println("hello all");
    }
}
class b extends a{
    public void show(){
        System.out.println("how are you");
    }
}


public class overriding {
    public static void main(String[] args) {
        
    
    b obj= new b();
    obj.show();
    
}
}