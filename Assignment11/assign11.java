package Assignment11;

import java.awt.*;
import java.awt.event.*;

public class assign11 extends Frame {
    Button b1, b2;

    public assign11() {
        setTitle("Assignment 11");
        setSize(500, 500);
        setLocation(200, 200);
        setLayout(new FlowLayout());
        setVisible(true);

        b1 = new Button("Login");
        add(b1);

        ListenerClass ml = new ListenerClass(this);

        b1.addActionListener(ml);

        b2 = new Button("Password");
        add(b2);
        b2.addActionListener(ml);
    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign11();
    }
}

class ListenerClass implements ActionListener {
    assign11 obj;

    ListenerClass(assign11 obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == obj.b1) {
            System.out.println("Click on Login");
        }
        if (e.getSource() == obj.b2) {
            System.out.println("Click on Password");
        }
    }
}
