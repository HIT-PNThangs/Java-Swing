package Base.TextFields;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JTextField textField = new JTextField(); // input text
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 20));
        textField.setBackground(Color.black); // màu nền
        textField.setCaretColor(Color.white); // màu con trỏ chuột
        textField.setForeground(Color.green); // màu chữ

        JButton button = new JButton("Submit");
        button.addActionListener(e -> {
            if(e.getSource() == button) {
                JOptionPane.showMessageDialog(null, textField.getText(), "Title", JOptionPane.PLAIN_MESSAGE);
                textField.setEditable(false);
                button.setEnabled(false);
            }
        });

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
}
