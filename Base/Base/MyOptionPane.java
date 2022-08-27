package Base.Base;

import javax.swing.*;

public class MyOptionPane {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(
//                null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE
//        );

//        JOptionPane.showMessageDialog(
//                null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE
//        );

//        JOptionPane.showMessageDialog(
//                null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE
//        );

//        JOptionPane.showMessageDialog(
//                null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE
//        );

//        JOptionPane.showMessageDialog(
//                null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE
//        );

//        JOptionPane.showConfirmDialog(
//                null, "Are you want to exit?", "Title", JOptionPane.YES_NO_CANCEL_OPTION
//        );

//        String name = JOptionPane.showInputDialog("What you name: ");
//        System.out.println("Name: " + name);

        String[] response = {"123", "234", "345", "345"};
        JOptionPane.showOptionDialog(
            null, "You are awesome!", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, response, 0
        );
    }
}
