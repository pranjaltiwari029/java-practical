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
class c extends b{
    public void fun3(){
        System.out.println("this is c class");
    }
}






public class mutli_level {
    public static void main(String[] args) {
        c obj=new c();
        obj.fun1();
    }

    
}
