package Assignment8;

import java.awt.*;
import java.awt.event.*;

public class assign8 extends Frame implements WindowListener {

    assign8() {
        addWindowListener(this);

        setTitle("Assignment 8");
        setSize(800, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign8();
    }

    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Opened!");
    }

    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Closing!");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Closed!");
    }

    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Iconified!");

    }

    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Deiconified!");

    }

    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Activated!");

    }

    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window Deactivated!");
    }
}
