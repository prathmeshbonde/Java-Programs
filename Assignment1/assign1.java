package Assignment1;

import java.awt.*;

// 2. Inheritance Method
public class assign1 extends Frame {
    assign1() {
        setTitle("Assignment 1");
        setSize(400, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        assign1 frame = new assign1();
    }
}

// 1. Association Method
/*
 * public class assign1 {
 * public static void main(String[] args) {
 * System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
 * Frame f = new Frame();
 * f.setTitle("Assignment 1");
 * f.setSize(400, 200);
 * f.setLayout(new FlowLayout(FlowLayout.CENTER));
 * f.setVisible(true);
 * }
 * }
 */