package Assignment2;

import java.awt.*;
import java.awt.event.*;

class assign2 extends Frame {
    Panel mainPanel;
    Label lTitle;
    Label lUser;
    Label lPass;
    Button b;
    TextField name1;
    TextField name2;

    public assign2() {
        setSize(700, 700);
        setTitle("Login Frame");
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.black);
        addComponent();
        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign2();
    }

    private void addComponent() {
        mainPanel = new Panel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(237, 217, 225));
        mainPanel.setBounds(0, 0, this.getWidth(), this.getHeight());

        lTitle = new Label("Login Page");
        lTitle.setBounds(20, 50, 660, 70);
        lTitle.setFont(new Font("verdana", Font.BOLD, 50));
        lTitle.setBackground(Color.darkGray);
        lTitle.setForeground(Color.white);
        lTitle.setAlignment(Label.CENTER);
        mainPanel.add(lTitle);

        lUser = new Label("Username");
        lUser.setBounds(50, 150, 200, 70);
        lUser.setFont(new Font("verdana", Font.BOLD, 30));
        lUser.setForeground(Color.white);
        lUser.setBackground(new Color(55, 45, 118));
        lUser.setAlignment(Label.CENTER);
        mainPanel.add(lUser);

        lPass = new Label("Password");
        lPass.setBounds(50, 250, 200, 70);
        lPass.setFont(new Font("verdana", Font.BOLD, 30));
        lPass.setForeground(Color.white);
        lPass.setBackground(new Color(55, 45, 118));
        lPass.setAlignment(Label.CENTER);
        mainPanel.add(lPass);

        name1 = new TextField();
        name1.setBounds(350, 150, 200, 70);
        name1.setFont(new Font("verdana", Font.BOLD, 20));
        name1.setBackground(Color.white);
        name1.setForeground(Color.black);

        mainPanel.add(name1);

        name2 = new TextField();
        name2.setBounds(350, 250, 200, 70);
        name2.setFont(new Font("verdana", Font.BOLD, 20));
        name2.setBackground(Color.white);
        name2.setForeground(Color.black);
        name2.setEchoChar('*');
        mainPanel.add(name2);

        b = new Button("Login");
        b.setBounds(250, 350, 150, 70);
        b.setFont(new Font("verdana", Font.BOLD, 40));
        b.setBackground(Color.darkGray);
        b.setForeground(Color.white);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mainPanel.add(b);

        add(mainPanel);
    }
}
