/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SN;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author toshiba
 */
public class ForJustTest1 {

    public static void main(String[] args) {

        double nilaiRata2;
        JTextArea areaTampilan;
        DecimalFormat duaAngka;
        double jumlah = 0;
        String stringTampil = "Nilai Siswa :\n";
        double[] nilaiSiswa = {65.45, 75.25, 90.45, 85.15, 67.45,
            70.65, 84.75, 55.75, 60.35, 77.85,
            80.65, 76.45, 95.55, 85.55, 60.75};

        for (int x = 0; x < nilaiSiswa.length; x++) {
            jumlah += nilaiSiswa[x];
            stringTampil += nilaiSiswa[x] + "  ";
            if ((x + 1) % 5 == 0) {
                stringTampil += "\n";
            }
        }

        duaAngka = new DecimalFormat("0.00");
        nilaiRata2 = jumlah / nilaiSiswa.length;
        stringTampil += "Nilai rata-rata : " + duaAngka.format(nilaiRata2);

        areaTampilan = new JTextArea();
        areaTampilan.setText(stringTampil);
        JOptionPane.showMessageDialog(null, areaTampilan, "Nilai Rata-Rata",
                JOptionPane.INFORMATION_MESSAGE);

        // Mengakhiri aplikasi
        System.exit(0);
    }
}


