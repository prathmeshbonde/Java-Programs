package Assignment10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class assign10 extends JFrame {
    JFrame j1;
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    JLabel lb5;
    JLabel lb6;
    JLabel lb7;
    JLabel lb8;
    JLabel lb9;
    JTextField tf1;
    JTextField tf2;
    JTextField tf3;
    JTextField tf4;
    JTextField tf5;
    JTextField tf6;
    JTextField tf7;
    JTextField tf8;
    JComboBox div;
    JComboBox dept;
    JButton b1;
    JButton b2;
    JButton b3;

    assign10() {
        j1 = new JFrame();
        JFrame.setDefaultLookAndFeelDecorated(true);
        lb1 = new JLabel("Enter Name");
        lb2 = new JLabel("Select Divsion");
        lb3 = new JLabel("Enter Id");
        lb4 = new JLabel("Enter Mn");
        lb5 = new JLabel("Select Department");
        lb6 = new JLabel("Subject 1 Marks");
        lb7 = new JLabel("Subject 2 Marks");
        lb8 = new JLabel("Subject 3 Marks");
        lb9 = new JLabel("Subject 4 Marks");
        tf1 = new JTextField();
        tf1.setPreferredSize(new Dimension(50, 50));
        tf2 = new JTextField();
        tf2.setPreferredSize(new Dimension(50, 50));
        tf3 = new JTextField();
        tf3.setPreferredSize(new Dimension(50, 50));
        tf4 = new JTextField();
        tf4.setPreferredSize(new Dimension(50, 50));
        tf5 = new JTextField();
        tf5.setPreferredSize(new Dimension(50, 50));
        tf6 = new JTextField();
        tf6.setPreferredSize(new Dimension(50, 50));
        tf7 = new JTextField();
        tf7.setPreferredSize(new Dimension(50, 50));
        tf8 = new JTextField();
        tf8.setPreferredSize(new Dimension(50, 50));
        div = new JComboBox();
        dept = new JComboBox();
        b1 = new JButton("Get  Result");
        b2 = new JButton("Close");

        div.addItem("1");
        div.addItem("2");
        div.addItem("3");
        div.addItem("4");
        div.addItem("5");
        div.addItem("6");

        dept.addItem("Comp");
        dept.addItem("IT");
        dept.addItem("Entc");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                String s3 = tf3.getText();
                int a = Integer.parseInt(tf4.getText());
                int b = Integer.parseInt(tf5.getText());
                int c = Integer.parseInt(tf6.getText());
                int d = Integer.parseInt(tf7.getText());
                double sum = (double) (a + b + c + d);
                double res = (sum / (double) 400) * (double) (100);
                String division = (String) div.getItemAt(div.getSelectedIndex());
                String department = (String) dept.getItemAt(dept.getSelectedIndex());
                j1.setVisible(false);
                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);
                System.out.println(division);
                System.out.println(department);
                System.out.println(res);
                JOptionPane.showMessageDialog(j1,
                        "Name -" + s1 + "\r\n" + "Id -" + s2 + "\r\n" + "Mn -" + s3 + "\r\n " + "Division -" + division
                                + "\r\n " + "Department -" + department + "\r\n" + "Result in percentage - " + res);
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                j1.setVisible(false);
            }
        });

        j1.add(lb1);
        j1.add(tf1);
        j1.add(lb2);
        j1.add(div);
        j1.add(lb3);
        j1.add(tf2);
        j1.add(lb4);
        j1.add(tf3);
        j1.add(lb5);
        j1.add(dept);
        j1.add(lb6);
        j1.add(tf4);
        j1.add(lb7);
        j1.add(tf5);
        j1.add(lb8);
        j1.add(tf6);
        j1.add(lb9);
        j1.add(tf7);
        j1.add(b1);
        j1.add(b2);
        j1.setSize(1000, 1000);
        j1.setLayout(new GridLayout(24, 12));
        j1.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign10();
    }
}
