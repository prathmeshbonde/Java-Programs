package Assignment5;

import java.awt.*;

// 1. BorderLayout
/* public class assign5 extends Frame {

    private Panel north;
    private Panel east;
    private Panel west;
    private Panel south;
    private Panel center;

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign5();
    }

    public assign5() {
        setTitle("Assignment 5.1");
        setSize(400, 500);
        setLocation(200, 200);
        setLayout(new BorderLayout());
        setVisible(true);

        north = new Panel();
        east = new Panel();
        west = new Panel();
        south = new Panel();
        center = new Panel();

        north.setPreferredSize(new Dimension(200, 120));
        east.setPreferredSize(new Dimension(110, 500));
        west.setPreferredSize(new Dimension(150, 500));
        south.setPreferredSize(new Dimension(200, 100));

        north.setBackground(Color.red);
        east.setBackground(Color.blue);
        west.setBackground(Color.yellow);
        south.setBackground(Color.green);
        center.setBackground(Color.cyan);

        add(north, BorderLayout.NORTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(south, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);
    }
} */

// 2. GridLayout
public class assign5 extends Frame {

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign5();
    }

    public assign5() {
        setTitle("Assignment 5.2");
        setSize(400, 700);
        setLocation(200, 200);

        setLayout(new GridLayout(3, 2, 15, 10)); // row 3, coloum 2, Hgap 15, Vgap 10
        setVisible(true);

        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
    }
}
