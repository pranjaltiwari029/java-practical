class a{
    public void fun1(){
        System.out.println("this is base class");
    }
}
class b extends a{
    public void fun2(){
        System.out.println("this is b class");
    }
}
class c extends a{
    public void fun3(){
        System.out.println("this is c class");
    }
}


public class hierrchical {
    public static void main(String[] args) {
        
    
    a obj1=new a();
    obj1.fun1();

    b obj2=new b();
    obj2.fun1();

    c obj=new c();
    obj.fun1();
    

    
    
    
}

}