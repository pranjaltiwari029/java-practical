//  package javafile;

class Box {
    int height, width, depth;

    Box(){
        System.out.println("using default Constructor ");
    }

    Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void volume() {
        System.out.println("The volume of box is " + (height * width * depth));
    }

}

class Box_new extends Box{
    int weight;
    Box_new(){
        super(16,10,12);
        weight = 10;
    }
}

public class ques_10 {
    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box(13,9,11);
        Box_new obj3 = new Box_new();

        obj2.volume();
        obj3.volume();
    }
    
}
