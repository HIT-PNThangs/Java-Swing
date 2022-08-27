package Base.OpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class LaunchPage {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");

    LaunchPage() {
        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(e -> {
            if(e.getSource() == button) {
                frame.dispose();
                NewWindow window = new NewWindow();
            }
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(420, 420));
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
