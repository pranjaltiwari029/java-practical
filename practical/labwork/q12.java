package labwork;

class base{
    public void show(){
        System.out.println("this is base class");
    }
}

class child1 extends base{
    public void show1(){

        System.out.println("this is child 1");
    }



}

class child2 extends child1{
    public void show2(){

        System.out.println("this is child 2");
    }
}

public class q12 {
    public static void main(String[] args){
        child2 obj=new child2();
        obj.show1();
    }
    
}
