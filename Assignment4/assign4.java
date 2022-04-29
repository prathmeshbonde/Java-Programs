package Assignment4;

import java.awt.*;
import java.awt.event.*;

public class assign4 extends Frame implements ActionListener {
    private TextField num1, num2, ans;
    private Button add, sub, div, mul, reset;
    private Label l1, l2, l3;

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign4();
    }

    assign4() {
        setTitle("Calculator");
        setSize(350, 500);
        setLocation(200, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        setBackground(Color.white);
        setVisible(true);

        init();
        addComponents();
        addActionListeners();
    }

    public void init() {
        l1 = new Label("Input 1");
        l1.setForeground(Color.darkGray);
        num1 = new TextField(10);

        l2 = new Label("Input 2");
        l2.setForeground(Color.darkGray);
        num2 = new TextField(10);

        l3 = new Label("Output");
        l3.setForeground(Color.darkGray);
        ans = new TextField(10);

        add = new Button("Add");
        sub = new Button("Sub");
        div = new Button("Div");
        mul = new Button("Mul");
        reset = new Button("Reset");
    }

    public void addComponents() {
        add(l1);
        add(num1);

        add(l2);
        add(num2);

        add(l3);
        add(ans);

        add(add);
        add(sub);
        add(div);
        add(mul);
        add(reset);
    }

    public void addActionListeners() {
        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        reset.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s1 = num1.getText();
        String s2 = num2.getText();

        Integer n1 = Integer.parseInt(s1);
        Integer n2 = Integer.parseInt(s2);
        Integer output = 0;

        if (e.getSource() == add) {
            output = n1 + n2;
        }
        if (e.getSource() == sub) {
            output = n1 - n2;
        }
        if (e.getSource() == div) {
            output = n1 / n2;
        }
        if (e.getSource() == mul) {
            output = n1 * n2;
        }
        if (e.getSource() == reset) {
            num1.setText("");
            num2.setText("");
        }

        ans.setText(output.toString());
    }

}
