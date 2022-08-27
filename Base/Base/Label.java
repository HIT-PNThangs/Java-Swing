package Base.Base;

import javax.swing.*;
import java.awt.*;

public class Label {
    public static void main(String[] args) {
        ImageIcon imageIcon = new ImageIcon("photo.png");

        JLabel label = new JLabel();
        label.setText("Do you even code?");
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("Consolas", Font.PLAIN, 20));
        label.setBackground(Color.black);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setIconImage(imageIcon.getImage());
        frame.add(label);
    }
}
