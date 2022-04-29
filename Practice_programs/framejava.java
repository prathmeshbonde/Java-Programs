package Practice_programs;

import java.awt.*;

public class framejava extends Frame {
    public static void main(String[] args) {
        // Frame fobj = new Frame("My Page"); not needed
        framejava fobj = new framejava();
        fobj.setVisible(true);
        fobj.setSize(400, 400);
        fobj.setTitle("My Page");
        fobj.setLocation(300, 200); // on screen bounds else default is top left of the screen
        fobj.setBackground(Color.DARK_GRAY);
        boolean b = fobj.isVisible();
        System.out.println(b);
    }
}
