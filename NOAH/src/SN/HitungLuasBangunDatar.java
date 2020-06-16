/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SN;

import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class HitungLuasBangunDatar {
     public static void main(String[] args) {
        int x, y, a, b, c, d, result;
      
        {String input = JOptionPane.showInputDialog("PILIHAN HITUNG LUAS BANGUN DATAR:\n1. Hitung Luas Persegi Panjang\n2. Hitung Luas Trapesium\n3. Hitung luas Lingkaran");
        int Nilai = Integer.parseInt(input);
        
        switch (Nilai) {
            case 1: {
                x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang: "));
                y = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar: "));
                JOptionPane.showMessageDialog(null, "Luas Persegi Panjang Kamu Adalah= " + x * y);
                System.exit(0);
                break;
            }
        }
        switch (Nilai) {
            case 2:
                a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi-Sisi Sejajar a:"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi-Sisi Sejajar b:"));
                c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi:"));
                JOptionPane.showMessageDialog(null, "Luas Trapsium Kamu Adalah= " + ((a + b) * c) / 2);
                System.exit(0);
                break;
        }
        switch (Nilai) {
            case 3:
                d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jari-Jari Lingkaran:"));
                JOptionPane.showMessageDialog(null, "Luas Lingkaran Kamu Adalah= " + (22 * (d * d) / 7));
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "INPUT SALAH!\nSILAHKAN ULANGI LAGI!\nSELESAI!");
                System.exit(0);
                break;
        }
        }
    }
    }






