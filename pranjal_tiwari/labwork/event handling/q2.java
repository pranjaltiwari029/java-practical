
import javax.swing.*;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class eVent extends JFrame implements MouseMotionListener {
	JLabel l1;

	eVent() {
		l1 = new JLabel("Print over here");
		addMouseMotionListener(this);
		add(l1);

		setVisible(true);
		setSize(250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void mouseDragged(MouseEvent ae) {
		getContentPane().setBackground(Color.BLUE);
		l1.setText("Mouse is Dragged");
	}

	public void mouseMoved(MouseEvent ae) {
		getContentPane().setBackground(Color.YELLOW);
		l1.setText("Mouse is Moved");
	}
}

public class q2 {
	public static void main(String[] args) {
		eVent obj = new  eVent();}
}
