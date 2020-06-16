/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas7;

import javax.swing.JOptionPane;

/**
 *
 * @author bukhori
 */
public class Biodata {

    public static void main(String[] args) {

        /*
         * Biodata ilkom A 2018, nim, nama, alamat, ipk.
         */
        
        
        long nim[] = new long[34];
        nim[0] = 185520101;
        nim[1] = 185520102;
        nim[2] = 185520103;
        nim[3] = 185520104;
        nim[4] = 185520105;
        nim[5] = 1855201029;
        nim[6] = 185520106;
        nim[7] = 185520107;
        nim[8] = 185520108;
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
        nim[33] = 1855201029;

        String[] nama = {"Zainul", "Ike", "Berly Dhana", "Bukhori", "Iqbal Fikri", "Chirzudin", "Rizal Syakhoni", "Fatwa", "Mujawadatul", "Maulidatul Isna", "Lutfi", "Yusuf", "Hasby", "Asna Andi", "Naufal Said", "Faturrahman", "Rouf", "Iqbal", "Ikhsan", "Sulton", "Ilham", "Alfian", "Ulum", "Riski Balian", "Rizal", "Endah", "Chusna", "Dhiazmie", "Dewi", "Neni", "Yuni", "Citra", "Sugiarto", "Said Al Baqi"};
        String[] alamat = {"Blitar", "Blitar", "Blitar", "Kediri", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Kediri", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Kediri", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Blitar", "Kalimantan", "Blitar", "Blitar", "Blitar"};

        Double IPK[] = new Double[34];
        IPK[0] = 3.40;
        IPK[1] = 3.56;
        IPK[2] = 3.45;
        IPK[3] = 2.99;
        IPK[4] = 3.70;
        IPK[5] = 3.80;
        IPK[6] = 3.40;
        IPK[7] = 3.56;
        IPK[8] = 3.45;
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
        IPK[33] = 3.40;

        for (int s = 0 ; s < nama.length ; s++) {
            
                        JOptionPane.showMessageDialog(null, " BIODATA ILKOM A 2018 " + "\n"
                                + "\n"
                                + "\n"
                                + "Nama     = " + nama [s] + "\n"
                                + "\n"
                                + "Nim         = " + nim[s] + "\n"
                                + "\n"
                                + "Alamat   = " + alamat [s] + "\n"
                                + "\n"
                                + "IPK          = " + IPK [s] + "\n");
        }
    }
}


