/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bukhori
 */
public class Uts {

    public static void main(String[] args) {

        int responden;
        int pemilih = 199999;
        int pakwiwi = 0;
        int pakwowo = 0;
        int golputh = 0;

        JOptionPane.showMessageDialog(null, "Selamat Datang Di Pilpres 2023!");

        for (responden = 0; responden < pemilih; responden++) {

            int[] responden1;
            int[] responden2;
            int[] responden3;
            responden1 = new int[pemilih];
            responden2 = new int[pemilih];
            responden3 = new int[pemilih];

            try {
                int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Selamat Datang Di Pilpres 2023!\n"
                        + "Pilih Presiden Kamu : \n"
                        + "\n"
                        + " 1. Pak wiwi \n "
                        + "2. Pak wowo \n "
                        + "3. GolPuth \n"
                        + " 4. Hasil Rekapitulasi sementara: \n"
                        + " 5. Keluar \n"
                        + "\n"
                        + "Responden ke= " + (responden + 1)));

                if (pilihan < 0 || pilihan > 5) {
                    //JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1, 2, 3, 4, 5");
                } else {
                    if (pilihan == 1) {
                        int pakwi = 1;
                        responden1[responden] = pakwi;
                        pakwiwi = pakwiwi + pakwi;
                        JOptionPane.showMessageDialog(null, "Responden ke= " + (responden + 1) + "\n" + "Anda Memilih Pak WIWI!");
                        System.out.println("-----------------\n"
                                + "\n"
                                + "Responden ke= " + (responden + 1) + "\n"
                                + "Memilih Pak WIWI\n"
                                + "\n"
                                + "-----------------");

                    } else if (pilihan == 2) {
                        int PakJojo = 1;
                        responden2[responden] = PakJojo;
                        pakwowo = pakwowo + PakJojo;
                        JOptionPane.showMessageDialog(null, "Responden ke= " + (responden + 1) + "\n" + " Anda Memilih Pak WOWO!");
                        System.out.println("-----------------\n"
                                + "\n"
                                + "Responden ke= " + (responden + 1) + "\n"
                                + "Memilih Pak WOWO\n"
                                + "\n"
                                + "-----------------");
                    } else if (pilihan == 3) {
                        int golput = 1;
                        responden3[responden] = golput;
                        golputh = golputh + golput;
                        JOptionPane.showMessageDialog(null, "Responden ke= " + (responden + 1) + "\n" + "Anda Memilih Untuk Golput!");
                        System.out.println("-----------------\n"
                                + "\n"
                                + "Responden ke= " + (responden + 1) + "\n"
                                + "Memilih GolPuth\n"
                                + "\n"
                                + "-----------------");
                    } else if (pilihan == 4) {
                        JOptionPane.showMessageDialog(null, "Hasil Rekapitulasi Sementara:\n"
                                + "Responden = " + (responden--) + "\n"
                                + "-----------------------------  \n"
                                + "Pak WIWI  : " + (pakwiwi * 100 / responden) + "%" + "\n"
                                + "Pak WOWO  : " + (pakwowo * 100 / responden) + "%" + "\n"
                                + "Golputh   : " + (golputh * 100 / responden) + "%" + "\n"
                                + "-----------------------------\n");
                        System.out.println("-----------------------------\n"
                                + "Hasil Rekapitulasi Sementara:\n"
                                + "Responden = " + (responden + 1) + "\n"
                                + "\n"
                                + "Pak WIWI  : " + (pakwiwi * 100 / responden) + "%" + "\n"
                                + "Pak WOWO  : " + (pakwowo * 100 / responden) + "%" + "\n"
                                + "Golputh   : " + (golputh * 100 / responden) + "%" + "\n"
                                + "\n"
                                + "-----------------------------");
                    } else if (pilihan == 5) {
                        JFrame frame = new JFrame();
                        String message = "Anda Yakin Ingin Keluar?";
                        int answer = JOptionPane.showConfirmDialog(frame, message);
                        if (answer == JOptionPane.YES_OPTION) {
                            System.exit(answer);
                        } else if (answer == JOptionPane.NO_OPTION) {
                        }
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1, 2, 3, 4, 5" + "\n"
                        + "Responden = " + (responden--));
            }
        }
    }
}






