/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhom7.quanlyluong.View;

import com.nhom7.quanlyluong.util.IOptionEvent;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;

/**
 * @author Admin
 */
public class TuyChonUI {
    private static final int CHAP_NHAN = 0;
    private static final int HUY_BO = 1;

    private IOptionEvent iOptionEvent;

    public void setOnHandleOptionEvent(IOptionEvent iOptionEvent) {
        this.iOptionEvent = iOptionEvent;
    }

    public void onCallGUI(Component parentComponent, String message, String title) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        String[] options = {"Chấp Nhận", "Hủy Bỏ"};
        int res = JOptionPane.showOptionDialog(parentComponent, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (res) {
            case CHAP_NHAN:
                iOptionEvent.onAcceptEvent();
                break;
            case HUY_BO:
            case JOptionPane.CLOSED_OPTION:
                iOptionEvent.onCancelEvent();
                break;
            default:
                break;
        }
    }
}
