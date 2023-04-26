// package pranjal_tiwari.javafile;
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
   
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class ques14 {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        Shape obj2 = new Square();

        obj1.draw(); // Output: "Drawing a circle"
        obj2.draw(); // Output: "Drawing a square"
    }
}

