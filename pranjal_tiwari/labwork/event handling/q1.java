// class MyFrame extends JFrame{
//     JLabel l;
//     MyFrame(){
//         setSize(400, 400);
//         setTitle("Title");
//         setLocation(100, 100);
//         setLayout(new FlowLayout());
//         l = new JLabel("This is label");
//         add(l);
//         setVisible(true);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//     }
// }

// public class Demo{
//     public static void main(String[] args) {
//         MyFrame f = new MyFrame();
//     }
// }
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame{
    JLabel l;
    MyFrame(){
        setSize(300,100);
        setTitle("title");
        setLocation(100,100);
        setLayout(new FlowLayout());
        l=new JLabel("label");
        add(l);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class q1 {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
    }
    
}
