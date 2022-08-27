package Base.OpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    NewWindow() {
        label.setBounds(200, 200, 100, 50);
        label.setFont(new Font("Consolas", Font.PLAIN, 20));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420, 420));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
