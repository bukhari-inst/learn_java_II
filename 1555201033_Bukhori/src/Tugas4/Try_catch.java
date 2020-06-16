/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba
 */
public class Try_catch {
    
        public static void main(String[] args) {
        try{
            double x, y, a, b, c, d, e, f, g, h, i, j, k , l, result;
        
      
        {String input = JOptionPane.showInputDialog("PILIHAN HITUNG LUAS BANGUN DATAR:\n1. Hitung Luas Persegi Panjang\n2. Hitung Luas Trapesium\n3. Hitung luas Lingkaran");
        int Nilai = Integer.parseInt(input);
        
        switch (Nilai) {
            case 1: 
                JOptionPane.showMessageDialog(null, "SELAMAT DATANG!\nKamu Berada Dalam Hitung Luas Persegi Panjang!");
                x = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang: "));
                y = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar: "));
                JOptionPane.showMessageDialog(null, "Luas Persegi Panjang Kamu Adalah= " + x * y);
                JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH BERKUNJUNG!\nSILAHKAN BERKUNJUNG KEMBALI!");
                System.exit(0);
                break;
        }
        switch (Nilai) {
            case 2:
                JOptionPane.showMessageDialog(null, "SELAMAT DATANG!\nKamu Berada Dalam Hitung Luas Trapesium!");
                a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi-Sisi Sejajar a:"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Sisi-Sisi Sejajar b:"));
                c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi:"));
                JOptionPane.showMessageDialog(null, "Luas Trapsium Kamu Adalah= " + ((a + b) * c) / 2);
                JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH BERKUNJUNG!\nSILAHKAN BERKUNJUNG KEMBALI!");
                System.exit(0);
                break;
        }
        switch (Nilai) {
            case 3:
                Double phi = 3.14;
                JOptionPane.showMessageDialog(null, "SELAMAT DATANG!\nKamu Berada Dalam Hitung Luas lingkaran!");
                d = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jari-Jari Lingkaran:"));
                JOptionPane.showMessageDialog(null, "Luas Lingkaran Kamu Adalah= " + ( phi * Math.pow(d, 2) ));
                JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH BERKUNJUNG!\nSILAHKAN BERKUNJUNG KEMBALI!");
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "INPUT SALAH!\nSILAHKAN ULANGI LAGI!\nSELESAI!");
                System.exit(0);
                break;
        }
        }
    }catch(HeadlessException | NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Salah");
    }
    }
}

