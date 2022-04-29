package Assignment9;

import javax.swing.*;
import java.awt.event.*;

public class assign9 implements ActionListener {
    JFrame f;
    JMenuBar mBar;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;

    assign9() {
        f = new JFrame("NotePad");
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        mBar.add(file);
        mBar.add(edit);
        mBar.add(help);

        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);
        f.add(mBar);
        f.add(ta);

        f.setJMenuBar(mBar);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Name: Prathmesh Bonde\nRoll No.: 32115");
        new assign9();
    }

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == cut) {
            ta.cut();
        }
        if (e.getSource() == copy) {
            ta.copy();
        }
        if (e.getSource() == paste) {
            ta.paste();
        }
        if (e.getSource() == selectAll) {
            ta.selectAll();
        }
    }
}
