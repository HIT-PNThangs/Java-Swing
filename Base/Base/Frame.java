package Base.Base;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("PNT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
