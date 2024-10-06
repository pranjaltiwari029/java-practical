// package pranjal_tiwari.javafile;

class overload{
    public void show(){
        System.out.println("implementing overloading function in java");
    }
    public void show(String Name){
        System.out.println("student name = "+Name);
    }
}

class override extends overload{
    public void show(){
       
        System.out.println("implementing overriding function in java" );
        
    }
}

public class ques_9 {
    public static void main(String[] args) {
        overload obj=new overload();
        obj.show();
        obj.show("Pranjal");

        override obj1=new override();
        obj1.show();
    }
    
}
