/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SN;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class fortest {

    public static void main(String[] args) {

        int matriks1[][] = new int[2][2];
        int matriks2[][] = new int[2][2];
        int matriks3[][] = new int[2][2];
        int matriks4[][] = new int[2][2];
        int matriks[][] = new int[2][2];
        int a = 0, b = 0, c = 0, d = 0;
        int i = 0, jk = 0, k, l, m, n;
        Boolean u = true;
        while (u) {
            try {
                int p = Integer.parseInt(JOptionPane.showInputDialog("             Kalkulator Metriks" + "\n"
                        + "\n"
                        + "1. Input Matriks 1" + "\n"
                        + "2. Input Maatriks 2" + "\n"
                        + "3. Jumlahkan" + "\n"
                        + "4. Kurangkan" + "\n"
                        + "5. Kalikan" + "\n"
                        + "6. Keluar" + "\n"
                        + "\n"));

                if (p < 1 || p > 6) {
                    JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1, 2, 3, 4, 5, 6!");
                } else if (p == 1) {
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[0].length; kolom++) {
                            matriks1[baris][kolom] = Integer.parseInt(JOptionPane.showInputDialog("input baris ke: " + baris + " input kolom ke: " + kolom));
                        }
                    }
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[0].length; kolom++) {
                            System.out.print(matriks1[baris][kolom] + " ");
                        }
                        System.out.println();
                    }
                } else if (p == 2) {
                    for (int baris = 0; baris < matriks2.length; baris++) {
                        for (int kolom = 0; kolom < matriks2[0].length; kolom++) {
                            matriks2[baris][kolom] = Integer.parseInt(JOptionPane.showInputDialog("input baris ke: " + baris + " input kolom ke: " + kolom));
                        }
                    }
                    for (int baris = 0; baris < matriks2.length; baris++) {
                        for (int kolom = 0; kolom < matriks2[0].length; kolom++) {
                            System.out.print(matriks2[baris][kolom] + " ");
                        }
                        System.out.println();
                    }
                } else if (p == 3) {
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[0].length; kolom++) {
                            matriks[baris][kolom] = matriks1[baris][kolom] + matriks2[baris][kolom];
                        }
                    }
                    System.out.println("===========================");
                    System.out.println("Hasil Penjumlahan Matriks: ");
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1.length; kolom++) {
                            System.out.print(+(matriks[baris][kolom]) + " ");
                        }
                        System.out.println();
                    }
                } else if (p == 4) {
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[0].length; kolom++) {
                            matriks[baris][kolom] = matriks1[baris][kolom] - matriks2[baris][kolom];
                        }
                    }
                    System.out.println("===========================");
                    System.out.println("Hasil Pengurangan Matriks: ");
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1.length; kolom++) {
                            System.out.print(+(matriks[baris][kolom]) + " ");
                        }
                        System.out.println();
                    }
                } else if (p == 5) {
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1[0].length; kolom++) {
                            matriks3[i][jk] = 0;
                            for (k = 0; k < 2; k++) {
                                matriks3[i][jk] += matriks1[i][k] * matriks2[k][jk];
                            }
                        }
                    }
                    System.out.println("===========================");
                    System.out.println("Hasil Perkalian Matriks: ");
                    for (int baris = 0; baris < matriks1.length; baris++) {
                        for (int kolom = 0; kolom < matriks1.length; kolom++) {
                            System.out.print(+(matriks[baris][kolom]) + " ");
                        }
                        System.out.println();
                    }
                } else if (p == 6) {
                    JFrame f = new JFrame();
                    String pesan = "Anda Yakin Ingin Keluar?";
                    int j = JOptionPane.showConfirmDialog(f, pesan);
                    if (j == JOptionPane.YES_OPTION) {
                        System.exit(j);
                    } else if (j == JOptionPane.NO_OPTION) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1, 2, 3, 4, 5, 6!" + "\n");
            }
        }
    }
}

