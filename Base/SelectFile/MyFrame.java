package Base.SelectFile;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Select File");
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
//            int response = fileChooser.showSaveDialog(null); // select file to save
            int response = fileChooser.showOpenDialog(null); // select file to open


            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            }
        });

        this.pack();
        this.setVisible(true);
    }
}
