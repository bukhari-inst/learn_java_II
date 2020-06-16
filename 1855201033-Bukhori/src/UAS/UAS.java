/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class UAS {

    public static void main(String[] args) {
        long nkt[] = new long[7];
        nkt[0] = 350623201;
        nkt[1] = 350623202;
        nkt[2] = 350623203;
        nkt[3] = 350623204;
        nkt[4] = 350623205;
        nkt[5] = 0;
        nkt[6] = 0;
        /*nkt[7] = 350623207;
        nkt[8] = 350623208;
        nkt[9] = 350623209;*/
        String[] np = {"082338644861", "082338644862", "082338644863", "082338644864", "082338644865", "0", "0"};
        String[] nama1 = {"Bukhori", "Alfian", "Berly Dhana", "Zainul", "Iqbal Fikri", "Kosong", "Kosong"};
        //String[] nama = {"Bukhori", "Alfian", "Berly Dhana", "Kosong", "Zainul", "Iqbal Fikri", "Kosong", "Kosong", "Chirzudin", "Kosong", "Kosong", "Rizal Syakhoni", "Fatwa", "Mujawadatul", "Kosong", "Maulidatul Isna"};
        String[] alamat = {"Kediri", "Blitar", "Blitar", "Blitar", "Blitar", "Kosong", "Kosong"};

        //Data Kamar
        /*String i, b, k, s, d, st;
        i = "Terisi";
        b = "Diboking";
        k = "Kosong";
        s = "Single";
        d = "Double";
        st = "Suite"; 
        int l, m, h;
        l = 175000;
        m = 225000;
        h = 300000;*/
        String nmk[] = {"Al-Hanafi 1", "Al-Maliki 1", "As-Syafi'i 1", "Al-Hanbali 1", "Al-Hanafi 2", "Al-Maliki 2", "As-Syafi'i 2"};
        String sk[] = {"Terisi", "Terisi", "Terisi", "Terisi", "Terisi", "Kosong", "Kosong"};
        String tp[] = {"Suite", "Single", "Suite", "Double", "Single", "Suite", "Suite"};
        int hk[] = new int[16];
        hk[0] = 300000;
        hk[1] = 175000;
        hk[2] = 300000;
        hk[3] = 225000;
        hk[4] = 175000;
        hk[5] = 300000;
        hk[6] = 300000;
        int hk2[] = new int[16];
        hk2[0] = 300000;
        hk2[1] = 175000;
        hk2[2] = 300000;
        hk2[3] = 225000;
        hk2[4] = 175000;
        hk2[5] = 0;
        hk2[6] = 0;
        /*hk[7] = 225000;
        hk[8] = 225000;
        hk[9] = 225000;
        hk[10] = 175000;
        hk[11] = 175000;
        hk[12] = 175000;
        hk[13] = 300000;
        hk[14] = 300000;
        hk[15] = 300000;*/
        int nk[] = new int[16];
        nk[0] = 1001;
        nk[1] = 1002;
        nk[2] = 1003;
        nk[3] = 1004;
        nk[4] = 1005;
        nk[5] = 1006;
        nk[6] = 1007;
        /*nk[7] = 1008;
        nk[8] = 1009;
        nk[9] = 10010;
        nk[10] = 10011;
        nk[11] = 10012;
        nk[12] = 10013;
        nk[13] = 10014;
        nk[14] = 10015;
        nk[15] = 10016;*/

        Boolean u = true;
        while (u) {
            try {
                JFrame fr = new JFrame("DATA INFORMASI PERHOTELAN");
                fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fr.setSize(1280, 750);
                fr.getContentPane().setBackground(Color.WHITE);
                fr.setVisible(true);
                int p = Integer.parseInt(JOptionPane.showInputDialog("DATA INFORMASI PERHOTELAN \n"
                        + "\n"
                        + "Masukkan Pilihan!"
                        + "\n"
                        + "\n"
                        + "1. Tampilkan Data Kamar \n"
                        + "2. Data Penyewa \n"
                        + "3. Data Transaksi Hotel \n"
                        + "4. Cari Data \n"
                        + "5. Ganti Data \n"
                        + "6. Keluar \n"
                        + "\n"));

                if (p < 1 || p > 6) {
                    JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-5");
                } else if (p == 1) {
                    Boolean cc = true;
                    while (cc) {
                        try {
                            JFrame fr1 = new JFrame("DATA KAMAR - DATA INFORMASI PERHOTELAN");
                            fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            fr1.setSize(1280, 750);
                            fr1.getContentPane().setBackground(Color.ORANGE);
                            fr1.setVisible(true);
                            int pl = Integer.parseInt(JOptionPane.showInputDialog(null, "Data Informasi Perhotelan" + "\n"
                                    + "\n"
                                    + "1. Data Kamar & Status Kamar \n"
                                    + "2. Penyewa Kamar \n"
                                    + "3. Tipe Kamar & Harga Kamar \n"
                                    + "4. Ganti Data \n"
                                    + "5. Kembali ke Menu Utama \n"
                                    + "6. keluar"));

                            if (pl < 1 || pl > 6) {
                                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-6/Inputan Tidak Boleh Kosong");
                            } else if (pl == 1) {
                                String data = "";
                                for (int a = 0; a < nmk.length; a++) {
                                    data += (a + 1 + ". ") + "Nama Kamar  : " + nmk[a] + "\n"
                                            + "    Nomor Kamar : " + nk[a] + "\n"
                                            + "    Tipe Kamar      : " + tp[a] + "\n"
                                            + "    Status Kamar  : " + sk[a];
                                    {
                                        data += "\n"
                                                + "\n";
                                    }
                                }
                                /*JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data);
                                JOptionPane.showMessageDialog(null, areaTampilan, "    Data Kamar & Status Kamar \n",
                                        JOptionPane.INFORMATION_MESSAGE);*/
                                JFrame frame1 = new JFrame("Data Kamar & Status Kamar");
                                /*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                frame.setSize(1280, 750);
                                frame.getContentPane().setBackground(Color.WHITE);
                                frame.setVisible(true);*/
                                ImageIcon icon = new ImageIcon("src/UTS/11.png");
                                JOptionPane.showMessageDialog(frame1, data, "Data Kamar & Status Kamar :", JOptionPane.PLAIN_MESSAGE, icon);

                            } else if (pl == 2) {
                                String data = "";
                                for (int a = 0; a < tp.length; a++) {
                                    data += (a + 1 + ". ") + "Nama Kamar  : " + nmk[a] + "\n"
                                            + "     Nomor Kamar : " + nk[a] + "\n"
                                            + "     Tipe Kamar      : " + tp[a] + "\n"
                                            + "     Harga Kamar  : Rp. " + hk2[a] + "\n"
                                            + "     Penyewa           : " + nama1[a] + "\n";
                                    {
                                        data += " ";
                                    }
                                }
                                /*JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data);
                                JOptionPane.showMessageDialog(null, areaTampilan, "    Tipe Kamar & Harga Kamar \n",
                                        JOptionPane.INFORMATION_MESSAGE);*/
                                JFrame frame1 = new JFrame("Data Kamar & Status Kamar");
                                //ImageIcon icon = new ImageIcon("11.png");
                                //frame1.setIconImage(icon.getImage());
                                JOptionPane.showMessageDialog(frame1, data, "Penyewa Kamar :", JOptionPane.PLAIN_MESSAGE); //,icon
                            } else if (pl == 3) {
                                String data = "";
                                for (int a = 0; a < tp.length; a++) {
                                    data += (a + 1 + ". ") //+ "Nama Kamar  : " + nmk[a] + "\n"
                                            + "Tipe Kamar     : " + tp[a] + "\n"
                                            + "     Harga Kamar : Rp. " + hk[a] + "\n";
                                    {
                                        data += "\n";
                                    }
                                }
                                JFrame frame1 = new JFrame("Data Kamar & Status Kamar");
                                JOptionPane.showMessageDialog(frame1, data, "Tipe Kamar & Harga Kamar :", JOptionPane.PLAIN_MESSAGE);
                            } else if (pl == 4) {
                                Boolean bb = true;
                                while (bb) {
                                    try {
                                        JFrame fr12 = new JFrame("GANTI DATA INFORMASI PERHOTELAN");
                                        fr12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        fr12.setSize(1280, 750);
                                        fr12.getContentPane().setBackground(Color.RED);
                                        fr12.setVisible(true);
                                        int plc = Integer.parseInt(JOptionPane.showInputDialog(null, "Data Informasi Perhotelan" + "\n"
                                                + "\n"
                                                + "1. Ganti Status Kamar \n"
                                                + "2. Ganti Nama Penyewa Kamar \n"
                                                + "3. Ganti Harga \n"
                                                + "4. Kembali ke Menu Sebelumnya \n"
                                                + "5. keluar"));
                                        if (plc < 1 || plc > 5) {
                                            JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-5/Inputan Tidak Boleh Kosong!");
                                        } else if (plc == 1) {
                                            JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                            int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Status Kamar index keberapa yang ingin diubah  ?"));
                                            //JFrame frame1 = new JFrame("");
                                            //int input13 = Integer.parseInt(JOptionPane.showInputDialog(frame1, input13, "Status Kamar Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE));
                                            sk[input13] = JOptionPane.showInputDialog("Masukan data Status Kamar baru untuk index ini !");
                                            String data = "";
                                            for (int a = 0; a < sk.length; a++) {
                                                data += (a + 1 + ". ") + sk[a];
                                                {
                                                    data += "\n";
                                                }
                                            }
                                            JFrame frame1 = new JFrame("");
                                            JOptionPane.showMessageDialog(frame1, data, "Status Kamar Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                                        } else if (plc == 2) {
                                            JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                            int input14 = Integer.parseInt(JOptionPane.showInputDialog("Data Nama Penyewa Kamar index keberapa yang ingin diubah  ?"));
                                            nama1[input14] = JOptionPane.showInputDialog("Masukan Data Nama Penyewa baru untuk index ini !");
                                            String data = "";
                                            for (int a = 0; a < nama1.length; a++) {
                                                data += (a + 1 + ". ") + nama1[a];
                                                {
                                                    data += "\n";
                                                }
                                            }
                                            JFrame frame1 = new JFrame("Ganti Data");
                                            JOptionPane.showMessageDialog(frame1, data, "Nama Penyewa Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                                        } else if (plc == 3) {
                                            JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                            int input11 = Integer.parseInt(JOptionPane.showInputDialog("Data Harga index keberapa yang ingin diubah  ?"));
                                            hk2[input11] = Integer.parseInt(JOptionPane.showInputDialog("Masukan data Harga baru untuk index ini !"));
                                            String data11 = "";
                                            for (int a = 0; a < nama1.length; a++) {
                                                data11 += (a + 1 + ". ") + hk2[a];
                                                {
                                                    data11 += "\n";
                                                }
                                            }
                                            JFrame frame1 = new JFrame("Ganti Data");
                                            JOptionPane.showMessageDialog(frame1, data11, "Harga Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                                        } else if (plc == 4) {
                                            bb = false;
                                        } else if (plc == 5) {
                                            JFrame frame3 = new JFrame();
                                            //String message = "Anda Yakin Ingin Keluar?";
                                            int answer = JOptionPane.showConfirmDialog(frame3, "Anda Yakin Ingin Keluar?");//,message
                                            if (answer == JOptionPane.YES_OPTION) {
                                                System.exit(answer);
                                            } else if (answer == JOptionPane.NO_OPTION) {
                                            }
                                        }
                                    } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-5/Inputan Tidak Boleh Kosong");
                                    }

                                }//} else if (pl == 55) {*/
                            } else if (pl == 5) {
                                cc = false;
                            } else if (pl == 6) {
                                JFrame frame2 = new JFrame();
                                String message = "Anda Yakin Ingin Keluar?";
                                int answer = JOptionPane.showConfirmDialog(frame2, message);
                                if (answer == JOptionPane.YES_OPTION) {
                                    System.exit(answer);
                                } else if (answer == JOptionPane.NO_OPTION) {
                                }
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-6/Inputan Tidak Boleh Kosong");
                        }
                    }
                } else if (p == 2) {
                    String data = "";
                    for (int a = 0; a < nama1.length; a++) {
                        data += (a + 1 + ". ") + "Nama                 : " + nama1[a] + "\n"
                                + "    No KTP/SIM      : " + nkt[a] + "\n"
                                + "    Alamat               : " + alamat[a] + "\n"
                                + "    No Telepon/HP : " + np[a] + "\n";
                        {
                            data += "\n";
                        }
                    }
                    JFrame frame1 = new JFrame("DATA INFORMASI PERHOTELAN");
                    JOptionPane.showMessageDialog(frame1, data, "Data Penyewa :", JOptionPane.PLAIN_MESSAGE);
                } else if (p == 3) {
                    int hsl = hk2[0] + hk2[1] + hk2[2] + hk2[3] + hk2[4] + hk2[5] + hk2[6];
                    String data = "";
                    for (int a = 0; a < tp.length; a++) {
                        data += (a + 1 + ". ") //+ "Nama Kamar  : " + nmk[a] + "\n"
                                //+ "     Nomor Kamar : " + nk[a] + "\n"
                                + " Tipe Kamar      : " + tp[a] + "\n"
                                + "      Harga Kamar   : Rp. " + hk2[a] + "\n"
                                + "      Penyewa           : " + nama1[a] + "\n";
                        {
                            data += " ";
                        }
                    }
                    /*JTextArea areaTampilan = new JTextArea();
                                areaTampilan.setText(data);
                                JOptionPane.showMessageDialog(null, areaTampilan, "    Tipe Kamar & Harga Kamar \n",
                                        JOptionPane.INFORMATION_MESSAGE);*/
                    JFrame frame1 = new JFrame("Data Kamar & Status Kamar");
                    //ImageIcon icon = new ImageIcon("11.png");
                    //frame1.setIconImage(icon.getImage());
                    JOptionPane.showMessageDialog(frame1, data, "Data Transaksi Hotel :", JOptionPane.PLAIN_MESSAGE); //,icon
                    JOptionPane.showMessageDialog(null, "Total : Rp. " + hsl);
                } else if (p == 4) {
                    //Boolean y = true;
                    //while (y){
                    JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                    String c = (JOptionPane.showInputDialog("Masukkan Nama Yang Dicari!"));
                    String data = "";
                    for (int a = 0; a < nama1.length; a++) {
                        if (nama1[a].equals(c)) {
                            data += (a + 1 + ". ") + "Nama                : " + nama1[a] + "\n"
                                    + "\n"
                                    + "    Nama Kamar  : " + nmk[a] + "\n"
                                    + "\n"
                                    + "    Nomor Kamar : " + nk[a] + "\n"
                                    + "\n"
                                    + "    Tipe Kamar      : " + tp[a] + "\n"
                                    + "\n";
                            JFrame frame1 = new JFrame("Cari Data");
                            JOptionPane.showMessageDialog(frame1, data, "Hasil Data Yang Anda Cari Adalah: ", JOptionPane.PLAIN_MESSAGE);
                            /*JTextArea areaTampilan = new JTextArea();
                            areaTampilan.setText(data);
                            JOptionPane.showMessageDialog(null, areaTampilan, "Hasil Data Yang Anda Cari Adalah: ",
                                    JOptionPane.INFORMATION_MESSAGE);*/
                        }
                        /*else {
                            nama[a] = nama[a];
                            JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Salah! " + "\n"
                                    + "/Perhatikan Penggunaan Huruf Kapital!" + "\n"
                                    + "Silahkan Ulangi Kembali!" + "\n");
                            //System.exit(0);
                            //Boolean y = false;
                            //y = false;
                            break;*/
                    }
                    //}
                    //}
                } else if (p == 5) {
                    Boolean cc = true;
                    while (cc) {
                        try {
                            JFrame fr1 = new JFrame("GANTI DATA INFORMASI PERHOTELAN");
                            fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            fr1.setSize(1280, 750);
                            fr1.getContentPane().setBackground(Color.BLUE);
                            fr1.setVisible(true);
                            int plb = Integer.parseInt(JOptionPane.showInputDialog(null, "Ganti Data Informasi Perhotelan" + "\n"
                                    + "\n"
                                    + "1. Ganti Nama \n"
                                    + "2. Ganti No KTP/SIM \n"
                                    + "3. Ganti Alamat \n"
                                    + "4. Ganti No Telepon/HP \n"
                                    + "5. Tampilkan Data \n"
                                    + "6. Kembali ke Menu Utama \n"
                                    + "7. keluar"));
                            if (plb < 1 || plb > 7) {
                                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-7/Inputan Tidak Boleh Kosong");
                            } else if (plb == 1) {
                                Boolean dd = true;
                                while (dd) {
                                    try {
                                        JFrame fr12 = new JFrame("GANTI NAMA");
                                        fr12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        fr12.setSize(1280, 750);
                                        fr12.getContentPane().setBackground(Color.BLACK);
                                        fr12.setVisible(true);
                                        int pld = Integer.parseInt(JOptionPane.showInputDialog(null, "                      Ganti Nama" + "\n"
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
                                            for (int a = 0; a < nama1.length; a++) {
                                                if (nama1[a].equals(f)) {
                                                    String g = JOptionPane.showInputDialog(null, "Inputkan Nama Pengganti");
                                                    nama1[a] = g;
                                                    {
                                                        data += ("Nama Telah Diganti Menjadi: "
                                                                + nama1[a] + "\n");
                                                    }
                                                    JFrame frame1 = new JFrame("Ganti Data");
                                                    JOptionPane.showMessageDialog(frame1, data, "GANTI NAMA", JOptionPane.PLAIN_MESSAGE);
                                                }
                                            }
                                        } else if (pld == 2) {
                                            JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                            int input13 = Integer.parseInt(JOptionPane.showInputDialog("Data Nama index keberapa yang ingin diubah  ?"));
                                            //JFrame frame1 = new JFrame("");
                                            //int input13 = Integer.parseInt(JOptionPane.showInputDialog(frame1, input13, "Status Kamar Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE));
                                            nama1[input13] = JOptionPane.showInputDialog("Masukan Data Nama baru untuk index ini !");
                                            String data = "";
                                            for (int a = 0; a < nama1.length; a++) {
                                                data += (a + 1 + ". ") + nama1[a];
                                                {
                                                    data += "\n";
                                                }
                                            }
                                            JFrame frame1 = new JFrame("Ganti Data");
                                            JOptionPane.showMessageDialog(frame1, data, "Nama Telah Diganti Menjadi: ", JOptionPane.PLAIN_MESSAGE);
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
                            } else if (plb == 2) {
                                JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                int input11 = Integer.parseInt(JOptionPane.showInputDialog("Data No KTP/SIM index keberapa yang ingin diubah  ?"));
                                nkt[input11] = Integer.parseInt(JOptionPane.showInputDialog("Masukan data No KTP/SIM baru untuk index ini !"));
                                String data11 = "";
                                for (int a = 0; a < np.length; a++) {
                                    data11 += (a + 1 + ". ") + nkt[a];
                                    {
                                        data11 += "\n";
                                    }
                                }
                                JFrame frame1 = new JFrame("Ganti Data");
                                JOptionPane.showMessageDialog(frame1, data11, "No KTP/SIM Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                            } else if (plb == 3) {
                                JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                int input1 = Integer.parseInt(JOptionPane.showInputDialog("Data Alamat index keberapa yang ingin diubah  ?"));
                                alamat[input1] = JOptionPane.showInputDialog("Masukan data Alamat baru untuk index ini !");
                                String data = "";
                                for (int a = 0; a < alamat.length; a++) {
                                    data += (a + 1 + ". ") + alamat[a];
                                    {
                                        data += "\n";
                                    }
                                }
                                JFrame frame1 = new JFrame("Ganti Data");
                                JOptionPane.showMessageDialog(frame1, data, "Alamat Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                            } else if (plb == 4) {
                                JOptionPane.showMessageDialog(null, "Pastikan Data Yang Diinputkan Benar!");
                                int input1 = Integer.parseInt(JOptionPane.showInputDialog("Data No Telepon/HP index keberapa yang ingin diubah  ?"));
                                np[input1] = JOptionPane.showInputDialog("Masukan data No Telepon/HP baru untuk index ini !");
                                String data = "";
                                for (int a = 0; a < alamat.length; a++) {
                                    data += (a + 1 + ". ") + np[a];
                                    {
                                        data += "\n";
                                    }
                                }
                                JFrame frame1 = new JFrame("Ganti Data");
                                JOptionPane.showMessageDialog(frame1, data, "Nomor Telepon/HP Berhasil Diubah : ", JOptionPane.PLAIN_MESSAGE);
                            } else if (plb == 5) {
                                String data = "";
                                for (int a = 0; a < nama1.length; a++) {
                                    data += (a + 1 + ". ") + "Nama                 : " + nama1[a] + "\n"
                                            + "    No KTP/SIM      : " + nkt[a] + "\n"
                                            + "    Alamat               : " + alamat[a] + "\n"
                                            + "    No Telepon/HP : " + np[a];
                                    {
                                        data += "\n"
                                                + "\n";
                                    }
                                }
                                JFrame frame1 = new JFrame("DATA INFORMASI PERHOTELAN");
                                JOptionPane.showMessageDialog(frame1, data, "Data Penyewa :", JOptionPane.PLAIN_MESSAGE);
                            } else if (plb == 6) {
                                cc = false;
                            } else if (plb == 7) {
                                JFrame frame2 = new JFrame();
                                String message = "Anda Yakin Ingin Keluar?";
                                int answer = JOptionPane.showConfirmDialog(frame2, message);
                                if (answer == JOptionPane.YES_OPTION) {
                                    System.exit(answer);
                                } else if (answer == JOptionPane.NO_OPTION) {
                                }
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-7/Inputan Tidak Boleh Kosong");
                        }
                    }
                } else if (p == 6) {
                    JFrame frame3 = new JFrame();
                    //String message = "Anda Yakin Ingin Keluar?";
                    int answer = JOptionPane.showConfirmDialog(frame3, "Anda Yakin Ingin Keluar?");//,message
                    if (answer == JOptionPane.YES_OPTION) {
                        System.exit(answer);
                    } else if (answer == JOptionPane.NO_OPTION) {
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan Pilihan Dengan Rentang 1-6/Inputan Tidak Boleh Kosong");
            }
        }
    }
}











