
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bukhori
 */
public class test3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame Kotak Dialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("src/dialog/kas.png");// icon yang akan dipasang
        JOptionPane.showMessageDialog(frame, "Pembayaran berhasil", "Informasi Pembayaran", JOptionPane.PLAIN_MESSAGE, icon);
    }
    }






