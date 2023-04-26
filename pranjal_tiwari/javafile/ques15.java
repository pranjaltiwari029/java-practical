// package pranjal_tiwari.javafile;

interface shape {
    void area();
    void perimeter();
}

class circle implements shape{
    double pi;
    int rad;
   
    circle(double pi, int rad){
        this.pi = pi;
        this.rad = rad;
    }
    public void print(){
        System.out.println("area and perimeter of circle");
    }
    public void area() {
        System.out.println( "area = "+pi*rad);
    }
    public void perimeter(){
        System.out.println("perimeter = "+2*pi*rad);
    }
}
class rectangle implements shape{

    int len,wid;
    rectangle(int len, int wid){
        this.len = len;
        this.wid = wid;
    }
    public void print(){
        System.out.println("area and perimeter of rectangle");
    }
    public void area() {
        System.out.println("area = "+len*wid);
    }
    public void perimeter(){
        System.out.println("perimeter = "+2*len*wid);
    }
}
class square implements shape{
    int side;
    square(int side){
        this.side = side;
    }
    public void print(){
        System.out.println("area and perimeter of square");
    }
    public void area() {
        System.out.println("area = "+side*side);
    }
    public void perimeter(){
        System.out.println("perimeter = "+2*side);
    }
}

public class ques15 {
    public static void main(String[] args) {
        circle obj1 = new circle(3.14, 9);
        obj1.print();
        obj1.area();
        obj1.perimeter();
        rectangle obj2 = new rectangle(7, 4);
        obj2.print();
        obj2.area();
        obj2.perimeter();
        square obj3 = new square(5);
        obj3.print();
        obj3.area();
        obj3.perimeter();

    }
}


