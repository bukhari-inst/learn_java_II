/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author toshiba
 */
public class Biodata2 {

    public static void main(String[] args) {

        //BinarySearch
        /*
         Tampilkan Data
         Ganti Data
         Cari Data
         Keluar
         */
        long nim[] = new long[8];
        nim[0] = 185520101;
        nim[1] = 185520102;
        nim[2] = 185520103;
        nim[3] = 185520104;
        nim[4] = 185520105;
        nim[5] = 1855201029;
        nim[6] = 185520106;
        nim[7] = 185520107;
        /*nim[8] = 185520108;
        nim[9] = 185520109;
        nim[10] = 1855201010;
        nim[11] = 1855201011;
        nim[12] = 1855201012;
        nim[13] = 1855201013;
        nim[14] = 1855201014;
        nim[15] = 1855201015;
        nim[16] = 1855201016;
        nim[17] = 1855201017;
        nim[18] = 1855201018;
        nim[19] = 1855201019;
        nim[20] = 1855201020;
        nim[21] = 1855201021;
        nim[22] = 1855201022;
        nim[23] = 1855201023;
        nim[24] = 1855201024;
        nim[25] = 1855201025;
        nim[26] = 1855201026;
        nim[27] = 1855201027;
        nim[28] = 1855201028;
        nim[29] = 1855201030;
        nim[30] = 1855201031;
        nim[31] = 1855201032;
        nim[32] = 1855201033;
        nim[33] = 1855201029;*/

        String[] nama = {"Bukhori", "Ilham", "Berly Dhana", "Zainul", "Iqbal Fikri", "Chirzudin", "Rizal Syakhoni", "Fatwa"};
        String[] alamat = {"Kediri", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar"};

        String IPK[] = new String[8];
        IPK[0] = "4.40";
        IPK[1] = "3.56";
        IPK[2] = "3.45";
        IPK[3] = "2.99";
        IPK[4] = "3.70";
        IPK[5] = "3.80";
        IPK[6] = "3.40";
        IPK[7] = "3.56";
        /*IPK[8] = 3.45;
        IPK[9] = 2.99;
        IPK[10] = 3.70;
        IPK[11] = 3.80;
        IPK[12] = 3.56;
        IPK[13] = 3.45;
        IPK[14] = 2.99;
        IPK[15] = 3.70;
        IPK[16] = 3.80;
        IPK[17] = 3.56;
        IPK[18] = 3.45;
        IPK[19] = 2.99;
        IPK[20] = 3.70;
        IPK[21] = 3.80;
        IPK[22] = 3.56;
        IPK[23] = 3.45;
        IPK[24] = 2.99;
        IPK[25] = 3.70;
        IPK[26] = 3.80;
        IPK[27] = 3.56;
        IPK[28] = 3.45;
        IPK[29] = 2.99;
        IPK[30] = 3.70;
        IPK[31] = 3.80;
        IPK[32] = 3.40;
        IPK[33] = 3.40;*/

        Boolean u = true;
        while (u) {

            try {
                int p = Integer.parseInt(JOptionPane.showInputDialog("          BIODATA ILKOM A 2018 \n"
                        + "\n"
                        + "Masukkan Pilihan!"
                        + "\n"
                        + "\n"
                        + "1. Tampilkan Data \n"
                        + "2. Ganti Data \n"
                        + "3. Cari Data \n"
                        + "4. Keluar \n"
                        + "\n"));

                if (p < 1 || p > 4) {
                    JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1, 2, 3, 4");
                } else if (p == 1) {
                    String data = "";
                    for (int a = 0; a < nama.length; a++) {
                        data += (a + 1 + ". ") + "NAMA  : " + nama[a] + "\n"
                                + "    NIM       : " + nim[a] + "\n"
                                + "    Alamat  : " + alamat[a] + "\n"
                                + "    IPK        : " + IPK[a] + "\n";
                        {
                            data += "\n";
                        }
                    }
                    JTextArea areaTampilan = new JTextArea();
                    areaTampilan.setText(data);
                    JOptionPane.showMessageDialog(null, areaTampilan, "    Biodata Ilkom 2A \n",
                            JOptionPane.INFORMATION_MESSAGE);
                    /*JFrame frames = new JFrame("Bukhori Frame Kotak Dialog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.RED);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("src/dialog/kas.png");// icon yang akan dipasang
        JOptionPane.showMessageDialog(frame, date, "Informasi Pembayaran", JOptionPane.PLAIN_MESSAGE, icon);*/

                } else if (p == 2) {
                    Boolean bb = true;
                    while (bb) {
                        try {
                            /*JFrame fr12 = new JFrame("GANTI DATA INFORMASI PERHOTELAN");
                                        fr12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        fr12.setSize(1280, 750);
                                        fr12.getContentPane().setBackground(Color.RED);
                                        fr12.setVisible(true);*/
                            int plc = Integer.parseInt(JOptionPane.showInputDialog(null, "                      Ganti Data" + "\n"
                                    + "\n"
                                    + "1. Ganti Nama \n"
                                    + "2. Ganti Nim \n"
                                    + "3. Ganti Alamat \n"
                                    + "4. Ganti IPK \n"
                                    + "5. Kembali ke Menu Sebelumnya \n"
                                    + "6. keluar"));
                            if (plc < 1 || plc > 6) {
                                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-6/Inputan Tidak Boleh Kosong!");
                            } else if (plc == 1) {
                                Boolean dd = true;
                                while (dd) {
                                    try {
                                        int pld = Integer.parseInt(JOptionPane.showInputDialog(null, "                      Ganti Data" + "\n"
                                                + "\n"
                                                + "1. Berdasarkan Nama \n"
                                                + "2. Berdasarkan Index \n"
                                                + "3. Kembali ke Menu Sebelumnya \n"
                                                + "4. keluar"));
                                        if (pld < 1 || pld > 4) {
                                            JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-4/Inputan Tidak Boleh Kosong!");
                                        } else if (pld == 1) {
                                            JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                            String data = "";
                                            String f = JOptionPane.showInputDialog("Masukkan Nama Yang Ingin Anda Ganti!");
                                            for (int a = 0; a < nama.length; a++) {
                                                if (nama[a].equals(f)) {
                                                    String g = JOptionPane.showInputDialog(null, "Inputkan Nama Pengganti");
                                                    nama[a] = g;
                                                    {
                                                        data += ("Nama Telah Diganti Menjadi: "
                                                                + nama[a] + "\n");
                                                    }
                                                    JTextArea areaTampilan = new JTextArea();
                                                    areaTampilan.setText(data);
                                                    JOptionPane.showMessageDialog(null, areaTampilan, "GANTI NAMA",
                                                            JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            }
                                        } else if (pld == 2) {
                                            JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                            int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Nama index keberapa yang ingin diubah  ?"));
                                            //JFrame frame1 = new JFrame("");
                                            //int input13 = Integer.parseInt(JOptionPane.showInputDialog(frame1, input13, "Status Kamar Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE));
                                            nama[input13] = JOptionPane.showInputDialog("Masukan Data Nama baru untuk index ini !");
                                            String data = "";
                                            for (int a = 0; a < nama.length; a++) {
                                                data += (a + 1 + ". ") + nama[a];
                                                {
                                                    data += "\n";
                                                }
                                            }
                                            JTextArea areaTampilan = new JTextArea();
                                            areaTampilan.setText(data);
                                            JOptionPane.showMessageDialog(null, areaTampilan, "GANTI NAMA",
                                                    JOptionPane.INFORMATION_MESSAGE);
                                            //JFrame frame1 = new JFrame("");
                                            //JOptionPane.showMessageDialog(frame1, data, "Status Kamar Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                                            //JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");

                                        } else if (pld == 3) {
                                            dd = false;
                                        } else if (pld == 4) {
                                            JFrame frame = new JFrame();
                                            String message = "Anda Yakin Ingin Keluar?";
                                            int answer = JOptionPane.showConfirmDialog(frame, message);
                                            if (answer == JOptionPane.YES_OPTION) {
                                                System.exit(answer);
                                            } else if (answer == JOptionPane.NO_OPTION) {
                                            }
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-4/Inputan Tidak Boleh Kosong");
                                    }
                                }

                            } else if (plc == 2) {
                                JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                int input14 = Integer.parseInt(JOptionPane.showInputDialog("Data Nim index keberapa yang ingin diubah  ?"));
                                nim[input14] = Integer.parseInt(JOptionPane.showInputDialog("Masukan Data Nim baru untuk index ini !"));
                                String data = "";
                                for (int a = 0; a < nim.length; a++) {
                                    data += (a + 1 + ". ") + nim[a];
                                    {
                                        data += "\n";
                                    }
                                }
                                JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data);
                                JOptionPane.showMessageDialog(null, areaTampilan, "Nim Berhasil Diubah!",
                                        JOptionPane.INFORMATION_MESSAGE);
                                //JFrame frame1 = new JFrame("Ganti Data");
                                //JOptionPane.showMessageDialog(frame1, data, "Nama Penyewa Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                            } else if (plc == 3) {
                                JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                int input11 = Integer.parseInt(JOptionPane.showInputDialog("Data Alamat index keberapa yang ingin diubah  ?"));
                                alamat[input11] = JOptionPane.showInputDialog("Masukan data Alamat baru untuk index ini !");
                                String data11 = "";
                                for (int a = 0; a < alamat.length; a++) {
                                    data11 += (a + 1 + ". ") + alamat[a];
                                    {
                                        data11 += "\n";
                                    }
                                }
                                JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data11);
                                JOptionPane.showMessageDialog(null, areaTampilan, "Alamat Berhasil Diubah!",
                                        JOptionPane.INFORMATION_MESSAGE);
                                //JFrame frame1 = new JFrame("Ganti Data");
                                //JOptionPane.showMessageDialog(frame1, data11, "Harga Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                            } else if (plc == 4) {
                                JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                int input11 = Integer.parseInt(JOptionPane.showInputDialog("Data IPK index keberapa yang ingin diubah  ?"));
                                IPK[input11] = (JOptionPane.showInputDialog("Masukan data IPK baru untuk index ini !"));
                                String data11 = "";
                                for (int a = 0; a < IPK.length; a++) {
                                    data11 += (a + 1 + ". ") + IPK[a];
                                    {
                                        data11 += "\n";
                                    }
                                }
                                JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data11);
                                JOptionPane.showMessageDialog(null, areaTampilan, "IPK Berhasil Diubah!",
                                        JOptionPane.INFORMATION_MESSAGE);
                                //JFrame frame1 = new JFrame("Ganti Data");
                                //JOptionPane.showMessageDialog(frame1, data11, "Harga Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                            } else if (plc == 5) {
                                bb = false;
                            } else if (plc == 6) {
                                JFrame frame3 = new JFrame();
                                //String message = "Anda Yakin Ingin Keluar?";
                                int answer = JOptionPane.showConfirmDialog(frame3, "Anda Yakin Ingin Keluar?");//,message
                                if (answer == JOptionPane.YES_OPTION) {
                                    System.exit(answer);
                                } else if (answer == JOptionPane.NO_OPTION) {
                                }
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-6/Inputan Tidak Boleh Kosong!");
                        }

                    }
                } else if (p == 3) {
                    //Boolean y = true;
                    //while (y){
                    JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                    String data = "";
                    String g = "";
                    {
                        String f = JOptionPane.showInputDialog("Masukkan Nama Yang Ingin Anda Ganti!");
                        for (int a = 0; a < nama.length; a++) {
                            if (nama[a].equals(f)) {
                                //g = JOptionPane.showInputDialog(null, "Inputkan Nama Pengganti");
                                //nama[a] = g;
                                //{
                                data += ("    NAMA    : " + nama[a] + "\n"
                                        + "    NIM         : " + nim[a] + "\n"
                                        + "    Alamat   : " + alamat[a] + "\n"
                                        + "    IPK          : " + IPK[a] + "\n"
                                        + "\n");
                                //}
                                //JOptionPane.showMessageDialog(null, data);
                                JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data);
                                JOptionPane.showMessageDialog(null, areaTampilan, "Hasil Data Yang Anda Cari Adalah :",
                                        JOptionPane.INFORMATION_MESSAGE);
                            }/*else {
                            JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Salah! " + "\n"
                                    + "/Perhatikan Penggunaan Huruf Kapital!" + "\n"
                                    + "Silahkan Ulangi Kembali!" + "\n");
                            //System.exit(0);
                            //Boolean y = false;
                            //y = false;
                            break;
                        }break;*/
                        }
                    }
                } else if (p == 4) {
                    JFrame frame = new JFrame();
                    String message = "Anda Yakin Ingin Keluar?";
                    int answer = JOptionPane.showConfirmDialog(frame, message);
                    if (answer == JOptionPane.YES_OPTION) {
                        System.exit(answer);
                    } else if (answer == JOptionPane.NO_OPTION) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1, 2, 3, 4" + "\n");
            }
        }
    }
}

