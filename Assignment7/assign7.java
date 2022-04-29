package Assignment7;

import java.awt.*;
import java.awt.event.*;

public class assign7 extends Frame implements MouseListener {
    // Label l;
    TextField t;

    assign7() {
        setTitle("Assignment7");
        setVisible(true);
        setSize(800, 400);
        setLocation(200, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
        // l = new Label();
        // l.setBounds(350, 50, 100, 20); // setting size and location of the text
        // l.setBackground(Color.CYAN);
        t = new TextField(30);
        add(t);

        addMouseListener(this);
    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign7();
    }

    // Mouse Listener Methods
    public void mouseClicked(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        t.setText("Mouse Clicked!");
        System.out.println(t.getText());
    }

    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        t.setText("Mouse Pressed!");
        System.out.println(t.getText());
    }

    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        t.setText("Mouse Released!");
        System.out.println(t.getText());
    }

    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        t.setText("Mouse Entered!");
        System.out.println(t.getText());
    }

    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        t.setText("Mouse Exited!");
        System.out.println(t.getText());
        setVisible(false);
    }
}
