package Assignment3;

import java.awt.*;
import java.awt.event.*;

public class assign3 extends Frame implements ActionListener {
    TextField t1, t2;
    Button b1, b2;

    assign3() {
        setTitle("Assignment 3");
        setSize(400, 400);
        setLocation(100, 100);
        setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
        setBackground(Color.white);
        setVisible(true);

        t1 = new TextField(20);
        t2 = new TextField(20);

        add(t1);
        add(t2);

        b1 = new Button("Swap");
        add(b1);
        b1.addActionListener(this);

        b2 = new Button("Exit");
        add(b2);
        b2.addActionListener(this);

    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign3();
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Swapping textfield values");
        String s = t1.getText();
        t1.setText(t2.getText());
        t2.setText(s);

        if (e.getSource() == b2) {
            System.out.println("Exiting program");
            dispose();
        }
    }
}
