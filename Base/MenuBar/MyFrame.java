package Base.MenuBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("PNT");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem loadItem = new JMenuItem("Load");
        loadItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Loading", "Title", JOptionPane.PLAIN_MESSAGE);
        });
        loadItem.setMnemonic(KeyEvent.VK_L);
        fileMenu.add(loadItem);

        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Saving", "Title", JOptionPane.PLAIN_MESSAGE);
        });
        saveItem.setMnemonic(KeyEvent.VK_S);
        fileMenu.add(saveItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> {
            System.exit(0);
        });
        exitItem.setMnemonic(KeyEvent.VK_E);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);

        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);
        menuBar.add(editMenu);

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
}
