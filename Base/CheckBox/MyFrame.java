package Base.CheckBox;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("PNT");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("PNT");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 24));

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
}
