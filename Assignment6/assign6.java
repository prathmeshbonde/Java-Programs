package Assignment6;

import java.awt.*;
import java.awt.event.*;

public class assign6 extends Frame implements KeyListener {
    private TextField key;
    private Label l1;
    private Panel mainPanel;

    assign6() {

        setTitle("Assignment 6");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        addComponents();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign6();
    }

    public void addComponents() {
        Font f = new Font("verdana", Font.BOLD, 35);

        mainPanel = new Panel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.white);
        mainPanel.setBounds(0, 0, 500, 500);
        add(mainPanel);

        l1 = new Label("Key Events");
        l1.setBounds(20, 50, 200, 25);
        l1.setForeground(Color.black);
        l1.setFont(new Font("verdana", Font.BOLD, 20));
        mainPanel.add(l1);

        key = new TextField();
        key.setBounds(20, 80, 460, 40);
        key.setBackground(Color.black.brighter());
        key.setForeground(Color.white);
        key.setFont(f);
        mainPanel.add(key);
        key.addKeyListener(this);

    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Key Typed");
        key.setText("Key Typed");
    }

    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Key Pressed");
        key.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Key Released");
        key.setText("Key Released");
    }

}
